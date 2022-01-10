package com.scm.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.internal.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.domain.ApprovalTemplate;
import com.scm.dao.domain.RoleRelationship;
import com.scm.dao.domain.Supplier;
import com.scm.dao.domain.SupplierMasterWork;
import com.scm.dao.domain.SystemUser;
import com.scm.dao.domain.TaskComparableRoute;
import com.scm.dao.domain.TaskManager;
import com.scm.dao.domain.TransactionType;
import com.scm.dao.domain.Workflow;
import com.scm.keys.NotificationPlaceholderKeys;
import com.scm.keys.UserCodeIdKeys;
import com.scm.service.WorkFlowEngineService;
import com.scm.service.common.BaseUIservice;

@Service
public class WorkFlowEngineServiceImpl extends BaseUIservice implements WorkFlowEngineService {

	private SupplierMasterWork supplierWork;
	private Long currUser;
	private String url;

	@Override
	@Transactional("transactionManager")
	public boolean submit(SupplierMasterWork work, Long systemUserId, String url) throws Throwable {

		this.supplierWork = work;
		this.currUser = systemUserId;
		this.url = url;

		return submit(work.getUserCode11().getId(), work.getOriginalId());
	}

	@Transactional("transactionManager")
	private boolean submit(Long transactionTypId, Long transactionId) throws Throwable {

		TransactionType trxnType = daoManager.getTransactionTypesDao().getTransactionTypesBy(transactionTypId);

		if (trxnType == null)
			throw new Exception(
					"Invalid transaction type for work flow engine submit. Please configure this transaction type (TRXNTID: "
							+ transactionTypId + ").");

		ApprovalTemplate approvalTemp = daoManager.getApprovalTemplatesDao()
				.getApprovalTemplatesBy(trxnType.getUserCode1().getId());

		if (approvalTemp == null)
			throw new Exception(
					"Invalid approval template for work flow engine submit. Please configure this approval template (APPTTID: "
							+ trxnType.getUserCode1().getId() + ").");

		TaskManager taskMan = daoManager.getTaskManagersDao().getTaskManagersBy(approvalTemp.getId());

		if (taskMan == null)
			throw new Exception(
					"Invalid task manager for work flow engine submit. Please configure the task manager for this step or flag the previous step as final (APPTVID: "
							+ approvalTemp.getId() + ").");

		// Get the value of the Requisitions to compare to identify which policy needs
		// to be used to enforce the workflow approval process
		Long totalValue = serviceManager.getRequisitionDetailsEngineService().totalExtendedPrice(transactionId);

		TaskComparableRoute taskComparableRoute = daoManager.getTaskComparableRoutesDao()
				.getTaskComparableRoutesBy(taskMan.getId(), approvalTemp.getId(), totalValue);

		// Get the role relationships.
		List<RoleRelationship> rorels = new ArrayList<RoleRelationship>();

		if (taskMan != null && taskMan.getUserCode3() != null)
			rorels = daoManager.getRoleRelationshipsDao().getRoleRelationshipsBy(taskMan.getUserCode3().getId(),
					"GroupId");

		if (taskMan != null && taskMan.getUserCode5() != null)
			rorels = daoManager.getRoleRelationshipsDao().getRoleRelationshipsBy(taskMan.getUserCode5().getId(),
					"TeamId");

		if (taskMan != null && taskMan.getSystemUser3() != null)
			rorels = daoManager.getRoleRelationshipsDao().getRoleRelationshipsBy(taskMan.getSystemUser3().getId(),
					"UserId");

		Workflow wf = new Workflow();
		// TODO: Fix up variables.
		// UnitId = // Link to organisational structure.
		wf.setUserCode4(
				daoManager.getUserCodeDao().getUserCodeDetails(Long.valueOf(UserCodeIdKeys.WorkflowStatusPending)));
		wf.setUserCode3((taskComparableRoute != null && taskComparableRoute.getUserCode3() != null) ? taskComparableRoute.getUserCode3()
				: ((taskMan != null && taskMan.getUserCode3() != null)?taskMan.getUserCode3():null));
		wf.setUserCode5((taskComparableRoute != null && taskComparableRoute.getUserCode4() != null) ? taskComparableRoute.getUserCode4()
				: ((taskMan != null && taskMan.getUserCode5() != null)?taskMan.getUserCode5():null));
		if (taskComparableRoute != null && taskComparableRoute.getUserId() != null) {
			SystemUser sysUser = new SystemUser();
			sysUser.setId(taskComparableRoute.getUserId());
			wf.setSystemUser5(sysUser);
		} else {
			wf.setSystemUser5(taskMan.getSystemUser3());
		}
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		wf.setWorkflowDateStarted(ts);
		wf.setRoundNo(1l);
		wf.setTaskDateStarted(ts);
		wf.setUserCode6(daoManager.getUserCodeDao().get(transactionTypId));
		wf.setTransactionId(transactionId);
		wf.setApprovalTemplateCode(approvalTemp != null ?approvalTemp.getApprovalTemplateCode():"");
		wf.setUserCode1(approvalTemp.getUserCode1());
		wf.setApprovalTemplateType(approvalTemp.getApprovalTemplateType());
		wf.setApprovalTemplate(approvalTemp);
		wf.setStepNo(1l);
		wf.setTaskId((taskComparableRoute != null && taskComparableRoute.getTaskId() != null) ? taskComparableRoute.getTaskId() : taskMan.getId());

		SystemUser sysUser = new SystemUser();
		sysUser.setId(this.currUser);
		wf.setSystemUser4(sysUser);
		wf.setApprovedMessage("");
		wf.setIsStandard(true);
		wf.setIsActive(true);
		wf.setIsDeleted(false);
		wf.setIsLocked(false);
		// StatusCode = null,
		// GroupCode = null,
		// TeamCode = null,
		// RoundNo = 1,
		// TransactionTypeId = txnTypeId,
		// TransactionId = txnId,
		// ApprovalTemplateCode = approvalTemp.ApprovalTemplateCode,
		// ApprovalTemplateTypeId = approvalTemp.ApprovalTemplateTypeId,
		// ApprovalTemplateType = approvalTemp.ApprovalTemplateType,
		// StepNo = 1,
		// TaskId = taskComparableRoute?.TaskId ?? taskMan.Id,
		// ApprovedByUserId = null,
		// TrxnOriginatorId = CurrentUser.Id,
		// ApprovedMessage = "",
		// ApprovalTemplate = null,
		// IsStandard = true,

		// JK.20200901a - Moved this code from the workflow model to here, the origin or
		// creation of workflows.
		// Avoids linq errors and makes description field searchable.
		switch (transactionTypId.intValue()) {
		case UserCodeIdKeys.TransactionType_ContractNonStock:
		case UserCodeIdKeys.TransactionType_ContractServices:
		case UserCodeIdKeys.TransactionType_ContractStock:
		case UserCodeIdKeys.TransactionType_ContractServiceLevelAgreement:
		case UserCodeIdKeys.TransactionType_ContractMemorandumOfUnderstanding:
		case UserCodeIdKeys.TransactionType_ContractMemorandumOfAgreement:
		case UserCodeIdKeys.TransactionType_ContractProvisionalTransversal:
		case UserCodeIdKeys.TransactionType_ContractNationalTransversal:
			// wf.setWorkflowDescription(ContractWork.ContractNo + " - " +
			// ContractWork.ContractTitle);
			break;
		case UserCodeIdKeys.TransactionType_Employee:
			wf.setWorkflowDescription("Employee");
			break;
		case UserCodeIdKeys.TransactionType_Requistion:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// RequisitionHeader.Id, RequisitionHeader.OrderNo ?? "Requisition ");
			break;
		case UserCodeIdKeys.TransactionType_Request:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// RequisitionHeader.Id, RequisitionHeader.Title ?? "Requisition Request");
			break;
		case UserCodeIdKeys.TransactionType_ItemTransaction:
			// wf.WorkflowDescription = string.Format("{0} - {1}",
			// ItemTransactionMasterWork.OriginalId,
			// ItemTransactionMasterWork.DocumentNumber);
			break;
		case UserCodeIdKeys.TransactionType_InventoryNonStock:
		case UserCodeIdKeys.TransactionType_InventoryServices:
		case UserCodeIdKeys.TransactionType_InventoryStock:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// InventoryWork.OriginalId, InventoryWork.ItemDescription);
			break;
		case UserCodeIdKeys.TransactionType_Vendor:
			Supplier supplier = daoManager.getSupplierDao().get(supplierWork.getSupplierRefId());
			wf.setWorkflowDescription(supplier.getSupplierNumber() + " - " + supplier.getLegalName());
			break;
		case UserCodeIdKeys.TransactionType_KPI_Item:
		case UserCodeIdKeys.TransactionType_KPI_Supplier:
		case UserCodeIdKeys.TransactionType_KPI_Contract:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// SupplierMarketDevelopmentWork.OriginalId,
			// SupplierMarketDevelopmentWork.ReferenceNumber);
			break;

		case UserCodeIdKeys.TransactionType_SupplierRotationTemplate:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// SupplierRotationPool.ReferenceNo, SupplierRotationPool.TemplateTitle ??
			// "Supplier Rotation Pool Template");
			break;

		case UserCodeIdKeys.TransactionType_Tender:
			// workflow.WorkflowDescription = string.Format("{0} - {1}", Tenders.Id,
			// Tenders.TenderNo ?? "Tender Template");
			break;

		case UserCodeIdKeys.TransactionType_SupplierCompliant:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// SupplierCompliantHeaderWork.OriginalId,
			// SupplierCompliantHeaderWork.VendorName);
			break;
		case UserCodeIdKeys.TransactionType_SupplierEnquiry:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// SupplierEnquiryHeaderWork.OriginalId, SupplierEnquiryHeaderWork.VendorName);
			break;
		case UserCodeIdKeys.TransactionType_StandardAgreement:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// StandardAgreementWork.Id, StandardAgreementWork.TemplateId);
			break;

		case UserCodeIdKeys.TransactionType_SRO:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// ServiceRequestOrder.SroReference, "Service Request Order");
			break;

		case UserCodeIdKeys.TransactionType_IPW:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// InstructionToPerformWork.IpwReference, "IPW");
			break;

		case UserCodeIdKeys.TransactionType_MasterAgreement:
			// workflow.WorkflowDescription = string.Format("{0} - {1}",
			// Agreements.AgreementReference, "Commodity Master Agreement");
			break;
		default:
			wf.setWorkflowDescription("Unknown");
			break;
		}

		daoManager.getWorkflowsDao().save(wf);
		daoManager.getWorkflowsDao().flush();
		NotifyNextApprovers(BuildMessage(taskMan), wf);
		return true;

	}

	@Autowired
	private CesarApiHelper cesarApiHelper;

	@Transactional("transactionManager")
	private void NotifyNextApprovers(String message, Workflow wf) throws Throwable {
		try {
			{
				List<RoleRelationship> rorels = new ArrayList<RoleRelationship>();

				if (wf != null && wf.getUserCode3() != null)
					rorels = daoManager.getRoleRelationshipsDao().getRoleRelationshipsBy(wf.getUserCode3().getId(),
							"GroupId");

				if (wf.getUserCode5() != null)
					rorels = daoManager.getRoleRelationshipsDao().getRoleRelationshipsBy(wf.getUserCode5().getId(),
							"TeamId");

				if (wf.getSystemUser5() != null)
					rorels = daoManager.getRoleRelationshipsDao().getRoleRelationshipsBy(wf.getSystemUser5().getId(),
							"UserId");

				for (RoleRelationship rr : rorels) {

					message = message.replace(NotificationPlaceholderKeys.Fullname,
							rr.getSystemUser3().getFirstName() + " " + rr.getSystemUser3().getLastName());
					message = message.replace(NotificationPlaceholderKeys.ApprovalLink, url + "/?id=" + wf.getId());// string.Format("{0}/?id={1}",
																													// Url,
																													// wf.Id));

					emailAnsSendSMS(rr.getSystemUser3().getEmailAddress(), rr.getSystemUser3().getMobileNumber(),
							message);
				}
			}
		} catch (Throwable th) {
			throw th;
		}
	}
	
	@Transactional(value = "cesarTransactionManager", propagation = Propagation.REQUIRES_NEW)
	private void emailAnsSendSMS(String email, String mobileNumber, String body) throws Throwable {
		String emailSubject = "";
		try {
				emailSubject = "COE SCM - Approval Request";
				cesarApiHelper.sendMail(email, emailSubject, body);
				if (StringHelper.isNotEmpty(mobileNumber)) {
					cesarApiHelper.sendSms(mobileNumber, body);
				}
		} catch(Throwable th) {
			throw th;
		}
	}

	private String BuildMessage(TaskManager tskman) throws Throwable {
		String message = "";
		try {
			message = tskman.getConditionDescription();

			message = tskman.getPlaceholder1() != null ? message.replace(NotificationPlaceholderKeys.Placeholder1,
					Resolve(tskman.getPlaceholder1(), tskman)) : message;
			message = tskman.getPlaceholder2() != null ? message.replace(NotificationPlaceholderKeys.Placeholder2,
					Resolve(tskman.getPlaceholder2(), tskman)) : message;
			message = tskman.getPlaceholder3() != null ? message.replace(NotificationPlaceholderKeys.Placeholder3,
					Resolve(tskman.getPlaceholder3(), tskman)) : message;
			message = tskman.getPlaceholder4() != null ? message.replace(NotificationPlaceholderKeys.Placeholder4,
					Resolve(tskman.getPlaceholder4(), tskman)) : message;
			message = tskman.getPlaceholder5() != null ? message.replace(NotificationPlaceholderKeys.Placeholder5,
					Resolve(tskman.getPlaceholder5(), tskman)) : message;
			message = tskman.getPlaceholder6() != null ? message.replace(NotificationPlaceholderKeys.Placeholder6,
					Resolve(tskman.getPlaceholder6(), tskman)) : message;
			message = tskman.getPlaceholder7() != null ? message.replace(NotificationPlaceholderKeys.Placeholder7,
					Resolve(tskman.getPlaceholder7(), tskman)) : message;
			message = tskman.getPlaceholder8() != null ? message.replace(NotificationPlaceholderKeys.Placeholder8,
					Resolve(tskman.getPlaceholder8(), tskman)) : message;
			message = tskman.getPlaceholder9() != null ? message.replace(NotificationPlaceholderKeys.Placeholder9,
					Resolve(tskman.getPlaceholder9(), tskman)) : message;
			message = tskman.getPlaceholder10() != null ? message.replace(NotificationPlaceholderKeys.Placeholder10,
					Resolve(tskman.getPlaceholder10(), tskman)) : message;

		} catch (Throwable x) {
			throw x;
		}
		return message;
	}

	private String Resolve(String placeHolder, TaskManager tskman)  throws Throwable {
		String retval = "";
		try {

			switch (placeHolder) {
			case "SupplierID":
				retval = supplierWork.getSupplierRefId() + "";
				break;
			case "SupplierName":
				Supplier supplier = daoManager.getSupplierDao().get(supplierWork.getSupplierRefId());
				retval = supplier.getLegalName();
				break;
			}

		} catch (Throwable x) {
			throw x;
		}
		return retval;
	}

}

package com.scm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scm.dao.domain.Workflow;
import com.scm.keys.UserCodeIdKeys;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.modal.WorkflowBean;
import com.scm.modal.WorkflowTotCountBean;
import com.scm.service.WorkflowUIService;
import com.scm.service.common.BaseUIservice;

@Service
public class WorkflowUIServiceImpl extends BaseUIservice implements WorkflowUIService {

	@Override
	public SummaryResponse<WorkflowBean> getWorkflowDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj, Long transactionTypeId) throws Throwable {

		String whereClause;

		switch (transactionTypeId.intValue()) {
		case UserCodeIdKeys.TransactionType_ContractNonStock:
		case UserCodeIdKeys.TransactionType_ContractServices:
		case UserCodeIdKeys.TransactionType_ContractStock:
		case UserCodeIdKeys.TransactionType_ContractServiceLevelAgreement:
		case UserCodeIdKeys.TransactionType_ContractMemorandumOfUnderstanding:
		case UserCodeIdKeys.TransactionType_ContractMemorandumOfAgreement:
		case UserCodeIdKeys.TransactionType_ContractProvisionalTransversal:
		case UserCodeIdKeys.TransactionType_ContractNationalTransversal:

			whereClause = " (w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_ContractNonStock
					+ "  or  w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_ContractStock
					+ "  or  w.TransactionTypeId =  " + UserCodeIdKeys.TransactionType_ContractServices
					+ "  or  w.TransactionTypeId =  " + UserCodeIdKeys.TransactionType_ContractServiceLevelAgreement
					+ "  or  w.TransactionTypeId =  " + UserCodeIdKeys.TransactionType_ContractMemorandumOfUnderstanding
					+ "  or  w.TransactionTypeId =  " + UserCodeIdKeys.TransactionType_ContractMemorandumOfAgreement
					+ "  or  w.TransactionTypeId =  " + UserCodeIdKeys.TransactionType_ContractProvisionalTransversal
					+ "  or  w.TransactionTypeId =  " + UserCodeIdKeys.TransactionType_ContractNationalTransversal
					+ ")";
			break;

		case UserCodeIdKeys.TransactionType_InventoryNonStock:
		case UserCodeIdKeys.TransactionType_InventoryServices:
		case UserCodeIdKeys.TransactionType_InventoryStock:
			whereClause = " (w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_InventoryNonStock
					+ "  or  w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_InventoryServices
					+ "  or  w.TransactionTypeId =  " + UserCodeIdKeys.TransactionType_InventoryStock
					+ ")";
			break;
		case UserCodeIdKeys.TransactionType_Vendor:
			whereClause = " (w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_Vendor + ")";
			break;
		case UserCodeIdKeys.TransactionType_Requistion:
		case UserCodeIdKeys.TransactionType_Request:
		case UserCodeIdKeys.TransactionType_SupplierRotationTemplate:
			whereClause = " (w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_SupplierRotationTemplate + ")";
			break;
		case UserCodeIdKeys.TransactionType_SupplierCompliant:
			whereClause = " (w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_SupplierCompliant + ")";
			break;
		case UserCodeIdKeys.TransactionType_SupplierEnquiry:
			whereClause = " (w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_SupplierEnquiry + ")";
			break;
		case UserCodeIdKeys.TransactionType_StandardAgreement:
			whereClause = " (w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_StandardAgreement + ")";
			break;
		case UserCodeIdKeys.TransactionType_SRO:
			whereClause = " (w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_SRO + ")";
			break;
		case UserCodeIdKeys.TransactionType_IPW:
			whereClause = " (w.TransactionTypeId = " + UserCodeIdKeys.TransactionType_IPW + ")";
			break;
		case UserCodeIdKeys.TransactionType_MasterAgreement:
		case UserCodeIdKeys.TransactionType_Tender:
			whereClause = " w.TransactionTypeId = " + transactionTypeId;
			break;
		default:
			whereClause = " w.TransactionTypeId = " + transactionTypeId;
			break;

		}

		SummaryResponse<WorkflowBean> summary = new SummaryResponse<WorkflowBean>();
		summary.setTotalRecords(daoManager.getWorkflowsDao().getWorkflowCount(searchSortObj, whereClause));
		summary.setEntities(daoManager.getWorkflowsDao().getWorkflowSummary(pagination, searchSortObj, whereClause));

		return summary;

	}

	@Override
	public WorkflowTotCountBean getTotalvsApproved() throws Throwable {
		return daoManager.getWorkflowsDao().getTotalvsApproved();
	}

	@Override
	public List<WorkflowBean> getTenderWorkflowsToday(String username) throws Throwable {
		List<WorkflowBean> workflowToday = daoManager.getWorkflowsDao().getTenderWorkflowsToday();
		if (workflowToday == null || (workflowToday != null && workflowToday.size() == 0)) {
			workflowToday = daoManager.getWorkflowsDao().getCommitteeWorkflowsList(username);
		}
		return workflowToday;
	}

	@Override
	public List<Workflow> getWorkflowDetails(Long transactionId, Long transactionTypeId, Long statusId) throws Throwable {
		return daoManager.getWorkflowsDao().getWorkflowsDetails(transactionId, transactionTypeId, statusId);
	}

}

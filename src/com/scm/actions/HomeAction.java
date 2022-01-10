package com.scm.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.scm.dao.domain.SupplierCompliantHeader;
import com.scm.dao.domain.SupplierEnquiryHeader;
import com.scm.keys.UserCodeIdKeys;
import com.scm.modal.BidSpecificationsBean;
import com.scm.modal.ContractDetailBean;
import com.scm.modal.DashBoardViewModal;
import com.scm.modal.IPWBean;
import com.scm.modal.RequisitionDetailBean;
import com.scm.modal.SroBean;
import com.scm.modal.TendersBean;
import com.scm.modal.WorkFlowGraphModal;
import com.scm.modal.WorkflowBean;

@Controller("homeAction")
@Scope("prototype")
public class HomeAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6947649944214410870L;

	private long sroCount;

	private List<Object> data = new ArrayList<Object>();

	private List<ContractDetailBean> supplierContractsList = new ArrayList<ContractDetailBean>();
	private List<RequisitionDetailBean> purchaseOrdersList = new ArrayList<RequisitionDetailBean>();
	private List<RequisitionDetailBean> requisitionsList = new ArrayList<RequisitionDetailBean>();

	private List<RequisitionDetailBean> quotationsList = new ArrayList<RequisitionDetailBean>();

	private List<BidSpecificationsBean> invitationBidList = new ArrayList<BidSpecificationsBean>();

	private List<SroBean> sroList = new ArrayList<SroBean>();
	private List<IPWBean> ipwList = new ArrayList<IPWBean>();

	private List<SupplierCompliantHeader> complaintList = new ArrayList<SupplierCompliantHeader>();

	private List<SupplierEnquiryHeader> enquiryList = new ArrayList<SupplierEnquiryHeader>();

	private List<WorkflowBean> tenderWorkflowsToday = new ArrayList<WorkflowBean>();
	
	private List<TendersBean> tenders = new ArrayList<TendersBean>();

	private String transactionType;

	@SkipValidation
	public String goGetApplicationHomeDetails() {
		logger.debug("In goGetApplicationHomeDetails...");
		try {
			String role = ActionContext.getContext().getSession().get("SESSION_USER_ROLE") == null ? ""
					: (String) ActionContext.getContext().getSession().get("SESSION_USER_ROLE");

			List<String> allBackOffice = new ArrayList<String>();
			allBackOffice.add("Supplier Development: Specialist");
			allBackOffice.add("Supplier Management: Senior Specialist");
			allBackOffice.add("Commodities: Specialist");
			allBackOffice.add("Commodities: Category Manager");
			allBackOffice.add("Contracts Management: Specialist");
			allBackOffice.add("Contracts Management: Senior Specialist");
			allBackOffice.add("Requesting Department: Specialist");
			allBackOffice.add("Requesting Department: Senior Specialist");
			allBackOffice.add("EPMO Senior Specialist");

			if (allBackOffice.contains(role)) {
				ActionContext.getContext().getSession().put("SESSION_BACK_OFFICE_USER", "true");
			}

			List<String> clerkAdminSuperAdmin = new ArrayList<String>();

			clerkAdminSuperAdmin.add("Super Admin");
			clerkAdminSuperAdmin.add("Admin");
			clerkAdminSuperAdmin.add("Clerk");

			if (clerkAdminSuperAdmin.contains(role)) {
				ActionContext.getContext().getSession().put("SESSION_SUPER_ADMIN_CLERK_USER", "true");
			}

			if (role.equalsIgnoreCase("Super Admin")) {
				ActionContext.getContext().getSession().put("SESSION_SUPER_ADMIN", "true");

				tenderWorkflowsToday = serviceManager.getWorkflowUIService().getTenderWorkflowsToday(
						(String) ActionContext.getContext().getSession().get("SESSION_USER_NAME"));
				
				tenders = serviceManager.getTendersUIService().getTendersDetails();
			}

			if (role.equalsIgnoreCase("Supplier")) {
				ActionContext.getContext().getSession().put("SESSION_SUPPLIER_USER", "true");
				supplierContractsList = serviceManager.getSupplierUIService().getContractDetailsList(
						(String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"));

				purchaseOrdersList = serviceManager.getSupplierUIService().loadRequisitionDetails(
						(String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"),
						UserCodeIdKeys.TransactionType_PurchaseOrder);

				requisitionsList = serviceManager.getSupplierUIService().loadRequisitionDetails(
						(String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"),
						UserCodeIdKeys.TransactionType_Requistion);

				quotationsList = serviceManager.getSupplierUIService().loadQuotationDetails(
						(String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"),
						UserCodeIdKeys.TransactionType_Quotation);

				invitationBidList = serviceManager.getSupplierUIService().loadBidSpecifications(
						(String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"));

				complaintList = serviceManager.getSupplierUIService()
						.getSCHList((String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"));

				enquiryList = serviceManager.getSupplierUIService()
						.getSEHList((String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"));

				sroList = serviceManager.getSupplierUIService()
						.getSROList((String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"));

				ipwList = serviceManager.getSupplierUIService()
						.getIPWList((String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"));

				return "supplier";
			} else if (allBackOffice.contains(role) || clerkAdminSuperAdmin.contains(role)) {

				return "backoffice";
			} else {

				return "others";
			}
		} catch (Throwable th) {
			th.printStackTrace();
			logger.error("Error While loading home page", th);
			addActionError("Unable to load home page");
			return ERROR;
		}

	}

	@SkipValidation
	public String goGetSupplierDetails() {
		logger.debug("In goGetSupplierDetails...");
		try {

		} catch (Throwable th) {
			th.printStackTrace();
		}
		return SUCCESS;
	}

	@SkipValidation
	public String goGetAdvertisingDetails() {
		logger.debug("In goGetAdvertisingDetails...");
		try {

		} catch (Throwable th) {
			th.printStackTrace();
		}
		return SUCCESS;
	}

	@SkipValidation
	public String goGetWorkFlowGraphData() {
		logger.debug("In goGetWorkFlowGraphData...");
		try {
			data = new ArrayList<Object>();
			List<WorkFlowGraphModal> dashBoardDetailsList = serviceManager.getSupplierUIService()
					.getWorkFlowGraphData(transactionType);
			data.addAll(dashBoardDetailsList);
		} catch (Throwable th) {
			th.printStackTrace();
		}
		return SUCCESS;
	}

	@SkipValidation
	public String goLoadEnquiryCompliantCount() {
		logger.debug("In goLoadEnquiryCompliantCount...");
		try {
			data = new ArrayList<Object>();
			List<DashBoardViewModal> dashBoardDetailsList = serviceManager.getSupplierUIService()
					.getBackOfficeEnquiryCompliantCount();
			data.addAll(dashBoardDetailsList);
		} catch (Throwable th) {
			th.printStackTrace();
		}
		return SUCCESS;
	}

	public long getSroCount() {
		return sroCount;
	}

	public void setSroCount(long sroCount) {
		this.sroCount = sroCount;
	}

	public List<ContractDetailBean> getSupplierContractsList() {
		return supplierContractsList;
	}

	public void setSupplierContractsList(List<ContractDetailBean> supplierContractsList) {
		this.supplierContractsList = supplierContractsList;
	}

	public List<RequisitionDetailBean> getPurchaseOrdersList() {
		return purchaseOrdersList;
	}

	public void setPurchaseOrdersList(List<RequisitionDetailBean> purchaseOrdersList) {
		this.purchaseOrdersList = purchaseOrdersList;
	}

	public List<RequisitionDetailBean> getRequisitionsList() {
		return requisitionsList;
	}

	public void setRequisitionsList(List<RequisitionDetailBean> requisitionsList) {
		this.requisitionsList = requisitionsList;
	}

	public List<RequisitionDetailBean> getQuotationsList() {
		return quotationsList;
	}

	public void setQuotationsList(List<RequisitionDetailBean> quotationsList) {
		this.quotationsList = quotationsList;
	}

	public List<BidSpecificationsBean> getInvitationBidList() {
		return invitationBidList;
	}

	public void setInvitationBidList(List<BidSpecificationsBean> invitationBidList) {
		this.invitationBidList = invitationBidList;
	}

	public List<SroBean> getSroList() {
		return sroList;
	}

	public void setSroList(List<SroBean> sroList) {
		this.sroList = sroList;
	}

	public List<IPWBean> getIpwList() {
		return ipwList;
	}

	public void setIpwList(List<IPWBean> ipwList) {
		this.ipwList = ipwList;
	}

	public List<SupplierCompliantHeader> getComplaintList() {
		return complaintList;
	}

	public void setComplaintList(List<SupplierCompliantHeader> complaintList) {
		this.complaintList = complaintList;
	}

	public List<SupplierEnquiryHeader> getEnquiryList() {
		return enquiryList;
	}

	public void setEnquiryList(List<SupplierEnquiryHeader> enquiryList) {
		this.enquiryList = enquiryList;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public List<WorkflowBean> getTenderWorkflowsToday() {
		return tenderWorkflowsToday;
	}

	public void setTenderWorkflowsToday(List<WorkflowBean> tenderWorkflowsToday) {
		this.tenderWorkflowsToday = tenderWorkflowsToday;
	}

	public List<TendersBean> getTenders() {
		return tenders;
	}

	public void setTenders(List<TendersBean> tenders) {
		this.tenders = tenders;
	}

}

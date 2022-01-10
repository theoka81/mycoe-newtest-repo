package com.scm.actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.scm.dao.domain.Supplier;
import com.scm.dao.domain.Workflow;
import com.scm.keys.UserCodeIdKeys;
import com.scm.modal.DocumentViewModel;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.modal.SupplierViewModel;
import com.scm.modal.SuppliersBean;

@Controller("supplierAction")
@Scope("prototype")
public class SupplierAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6402907660493973555L;

	private List<Object> data = new ArrayList<Object>();
    private Integer draw=0, recordsTotal=1, recordsFiltered = 0, length = 0, start=0;
    private String error_custom;    
    
    private Long statusId;
    private Long supplierMasterId;
    private Long supplierId;
    private String maaaNumber;
    
    private SupplierViewModel supplierViewModel =  new SupplierViewModel();
	DocumentViewModel documentViewModal = new DocumentViewModel();
	
	private SuppliersBean supplierBean;

	@SkipValidation
	public String goSupplierMastersIndex() {
		logger.debug("In goContractMastersIndex...");
		try {
			if (menuStatusId != null || menuStatusId.intValue() != -1) {
				statusId = menuStatusId;
				if(menuStatusId == UserCodeIdKeys.SupplierStatusPending) {
					pageTitle = "Supplier Registration";
				} else if(menuStatusId == UserCodeIdKeys.SupplierStatusActive) {
					pageTitle = "Supplier Administration";
				}
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@SkipValidation
	public String goLoadSupplierMasterIndex() {
		logger.debug("In goLoadContracts...");
		try {
			data = new ArrayList<Object>();
			
			SearchSortContainer searchSortContainer = getSearchSortBean();
			
			if(statusId != null && statusId != -1) {
				searchSortContainer.setStatusId(statusId);
			}

			SummaryResponse<SuppliersBean> summary = serviceManager.getSupplierUIService()
					.getSupplierMastersSummary(getPaginationObject(), searchSortContainer);
			data.addAll(summary.getEntities());
			recordsTotal = summary.getTotalRecords();
			recordsFiltered = recordsTotal;
			// sends an random error to the JSON
			if ((Math.random() * 10 > 9)) {
				error_custom = "Random Error test";
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@SkipValidation
	public String goGetDetails() {
		logger.debug("In goGetDetails...");
		try {

			String role = ActionContext.getContext().getSession().get("SESSION_USER_ROLE") == null ? ""
					: (String) ActionContext.getContext().getSession().get("SESSION_USER_ROLE");
			if (role.equalsIgnoreCase("Supplier")) {
				Supplier supplier = serviceManager.getSupplierUIService().getSupplierDetails(
						(String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"));
				if(supplier != null)
					supplierId = supplier.getId();
				else 
					supplierId = null;
			}
			supplierViewModel = serviceManager.getSupplierUIService().getSupplierVewModalDetails(supplierId,
					(String) ActionContext.getContext().getSession().get("SESSION_USER_MAAANUMBER"),
					(Long) ActionContext.getContext().getSession().get("SESSION_USER_ID"));
			documentViewModal = supplierViewModel.getDocumentViewModel();
			if (ActionContext.getContext().getSession().get("FROM_REGISTRATION") != null && "true"
					.equalsIgnoreCase((String) ActionContext.getContext().getSession().get("FROM_REGISTRATION"))) {
				supplierViewModel.setSuccessfulRegistration(true);
				ActionContext.getContext().getSession().put("FROM_REGISTRATION", "false");
			}
		} catch (Throwable th) {
			th.printStackTrace();
		}
		return SUCCESS;
	}
	
	@SkipValidation
	public String gosaveDetails() {
		try {
			logger.debug("In gosaveDetails...");
			// update application submitted;
			
			if (submitButton != null && submitButton.equalsIgnoreCase("close")) {
				return "close";
			}

			supplierViewModel = serviceManager.getSupplierUIService().saveSupplierDetails(supplierBean,
					populateDocumentBean(), (Long) ActionContext.getContext().getSession().get("SESSION_USER_ID"));
			
			documentViewModal = supplierViewModel.getDocumentViewModel();
			
			if (submitButton != null) {
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				if (submitButton.equalsIgnoreCase("Save")) {
					supplierViewModel.setMessage(df.format(new Date()) + " - Supplier information saved.");
				} else if (submitButton.equalsIgnoreCase("submit")) {
					// Check if there are any pending workflows with this supplier.
					List<Workflow> workflowList = serviceManager.getWorkflowUIService().getWorkflowDetails(
							supplierViewModel.getSupplierMaster().getId(),
							Long.valueOf(UserCodeIdKeys.TransactionType_Vendor),
							Long.valueOf(UserCodeIdKeys.SupplierStatusPending));
					if (workflowList == null || workflowList.size() <= 0) {

						String url = request.getRequestURL().toString();
						String uri = request.getRequestURI().toString();
						
						String acturl = url.substring(0, (url.length()-uri.length())) + request.getContextPath()+"/Workflow/Approval";
						
						serviceManager.getWorkFlowEngineService().submit(supplierViewModel.getSupplierMasterWork(),
								(Long) ActionContext.getContext().getSession().get("SESSION_USER_ID"), acturl);

						serviceManager.getEmailService().emailTeam(
								Long.valueOf(UserCodeIdKeys.SupplierDevelopmentSeniorSpecialist),
								supplierViewModel.getSupplierMaster().getSupplierRefId());
						serviceManager.getEmailService()
								.emailSupplierOnSubmit(supplierViewModel.getSupplierMaster().getSupplierRefId());
						/*
						 * var engine = new WorkflowEngine(); var urlBuilder = new
						 * UriBuilder(Request.Url.AbsoluteUri) { Path = Url.Action("Approval",
						 * "Workflow"), Query = null, };
						 * 
						 * Uri uri = urlBuilder.Uri; engine.Url = urlBuilder.ToString();
						 * engine.CurrentUser = SystemUser; // NC-2020/09/28 Commented out to prevent
						 * supplier from being submitted into the workflow
						 * //engine.Submit(svm.SupplierMasterWork);
						 */

						/*
						 * WorkflowHelper.EmailTeam(UserCodeIdKeys.SupplierDevelopmentSeniorSpecialist,
						 * svm.SupplierMaster.SupplierRefId);
						 * WorkflowHelper.EmailSupplierOnSubmit(svm.SupplierMaster.SupplierRefId);
						 */

						supplierViewModel.setMessage(
								df.format(new Date()) + " - Supplier information sent to COE for assessment.");

					} else {
						supplierViewModel.setMessage(df.format(new Date())
								+ " - Supplier information currently pending COE assessment. Please try again once processed?");
					}

				}
			}
		} catch(Throwable th) {
			th.printStackTrace();		
		}
		return SUCCESS;
	}

	@SkipValidation
	public String goLoadSuppliers()
	{
		logger.debug("In goLoadSuppliers...");
		return SUCCESS;
	}
	
	private Pagination getPaginationObject() {
		Pagination pagination = new Pagination();
		pagination.setOffset(start);
		pagination.setSize(length);
		return pagination;
	}

	private SearchSortContainer getSearchSortBean() {
		String searchValue = "";
		String columnName = "";
		String order = "";
		HttpParameters map = ActionContext.getContext().getParameters();
		if (map.get("order[0][dir]") != null) {
			order = map.get("order[0][dir]").getValue();
		}

		if (map.get("search[value]") != null) {
			searchValue = map.get("search[value]").getValue();
		}
		if (map.get("order[0][column]") != null) {
			if (map.get("columns[" + map.get("order[0][column]").getValue() + "][data]") != null) {
				columnName = map.get("columns[" + map.get("order[0][column]").getValue() + "][data]").getValue();
			}
		}

		logger.info(
				"searchValue:" + searchValue + " | sort columnName: " + columnName + " | sort order: " + order);
		SearchSortContainer searchSortBean = new SearchSortContainer();

		searchSortBean.setSearchValue(searchValue);
		searchSortBean.setSidx(columnName);
		searchSortBean.setSord(order);

		return searchSortBean;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Integer getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(Integer recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public Integer getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(Integer recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public String getError_custom() {
		return error_custom;
	}

	public void setError_custom(String error_custom) {
		this.error_custom = error_custom;
	}

	public SupplierViewModel getSupplierViewModel() {
		return supplierViewModel;
	}

	public void setSupplierViewModel(SupplierViewModel supplierViewModel) {
		this.supplierViewModel = supplierViewModel;
	}

	public DocumentViewModel getDocumentViewModal() {
		return documentViewModal;
	}

	public void setDocumentViewModal(DocumentViewModel documentViewModal) {
		this.documentViewModal = documentViewModal;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Long getSupplierMasterId() {
		return supplierMasterId;
	}

	public void setSupplierMasterId(Long supplierMasterId) {
		this.supplierMasterId = supplierMasterId;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getMaaaNumber() {
		return maaaNumber;
	}

	public void setMaaaNumber(String maaaNumber) {
		this.maaaNumber = maaaNumber;
	}

	public SuppliersBean getSupplierBean() {
		return supplierBean;
	}

	public void setSupplierBean(SuppliersBean supplierBean) {
		this.supplierBean = supplierBean;
	}
}

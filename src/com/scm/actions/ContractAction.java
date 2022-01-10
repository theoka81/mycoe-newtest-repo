package com.scm.actions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.scm.keys.UserCodeIdKeys;
import com.scm.modal.ContractBean;
import com.scm.modal.ContractDetailBean;
import com.scm.modal.ContractDetailsViewModel;
import com.scm.modal.ContractMasterBean;
import com.scm.modal.ContractMasterViewModel;
import com.scm.modal.DocumentViewModel;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;

@Controller("contractAction")
@Scope("prototype")
public class ContractAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6402907660493973555L;

	private List<Object> data = new ArrayList<Object>();
	private Integer draw = 0, recordsTotal = 1, recordsFiltered = 0, length = 0, start = 0;
	private String error_custom;

	private Long contractId;
	private Long contrctDetailsId;
	private Long statusId;
	private Long contractTypeId;
	private Long procurementTypeId;
	private Long requestedUnitId;
	private Long supplierId;

	ContractMasterViewModel contractMasterViewModel = new ContractMasterViewModel();
	ContractDetailsViewModel contractDetailsViewModel = new ContractDetailsViewModel();
	DocumentViewModel documentViewModal = new DocumentViewModel();
	
	private ContractDetailBean contractDetails = new ContractDetailBean();
	
	private ContractMasterBean contractMasterBean = new ContractMasterBean();
	
	public Map<Long, String> commoditiesMap = new LinkedHashMap<Long, String>();
	

	@SkipValidation
	public String goContractMastersIndex() {

		try {
			if (menuStatusId != null && menuStatusId.intValue() != -1) {
				statusId = menuStatusId;
				if(menuStatusId == UserCodeIdKeys.ContractStatusPending) {
					pageTitle = "Contracts Creation";
				} else if(menuStatusId == UserCodeIdKeys.ContractStatusActive) {
					pageTitle = "Contracts Amendment";
				}
			}
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@SkipValidation
	public String goLoadContractMastersIndex() {
		logger.debug("In goLoadContracts...");
		try {
			data = new ArrayList<Object>();
			
			SearchSortContainer searchSortContainer = getSearchSortBean();
			
			if(statusId != null && statusId != -1) {
				searchSortContainer.setStatusId(statusId);
			}

			if(contractTypeId != null && contractTypeId != -1) {
				searchSortContainer.setContractTypeId(contractTypeId);
			}
			if(procurementTypeId != null && procurementTypeId != -1) {
				searchSortContainer.setProcurementTypeId(procurementTypeId);
			}
			if(requestedUnitId != null && requestedUnitId != -1) {
				searchSortContainer.setRequestedUnitId(requestedUnitId);
			}
			if(supplierId != null && supplierId != -1) {
				searchSortContainer.setSupplierId(supplierId);
			}
			SummaryResponse<ContractBean> summary = serviceManager.getContractUIService()
					.getContractMastersSummary(getPaginationObject(), searchSortContainer);
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
	public String goLoadContractMasterDetails() {
		logger.debug("In loadContractDetails...");
		try {
			serviceManager.getContractUIService().loadContractMasterDetails(contractId, contractMasterViewModel);
			documentViewModal = contractDetailsViewModel.getDocumentViewModel();
			SearchSortContainer searchSortContainer = getSearchSortBean();
			if(contractId != null && contractId != -1) {
				searchSortContainer.setContractMasterId(contractId);
			}
			SummaryResponse<ContractDetailBean> summary = serviceManager.getContractUIService()
					.getContractDetailsSummary(getPaginationObject(), searchSortContainer);
			data.addAll(summary.getEntities());
		} catch (Throwable th) {
			th.printStackTrace();
		}

		return SUCCESS;
	}
	
	@SkipValidation
	public String goContractDetailsIndex() {
		try {
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@SkipValidation
	public String goLoadContractDetailsIndex() {

		try {
			data = new ArrayList<Object>();
			
			SearchSortContainer searchSortContainer = getSearchSortBean();
			if(contractId != null && contractId != -1) {
				searchSortContainer.setContractMasterId(contractId);
			}
			SummaryResponse<ContractDetailBean> summary = serviceManager.getContractUIService()
					.getContractDetailsSummary(getPaginationObject(), searchSortContainer);
			
			data.addAll(summary.getEntities());
			recordsTotal = summary.getTotalRecords();
			recordsFiltered = recordsTotal;
			// sends an random error to the JSON
			if ((Math.random() * 10 > 9)) {
				error_custom = "Random Error test";
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	@SkipValidation
	public String goLoadContractDetails() {

		try {
			serviceManager.getContractUIService().loadContractDetails(contrctDetailsId, contractDetailsViewModel);
			documentViewModal = contractDetailsViewModel.getDocumentViewModel();
			commoditiesMap = serviceManager.getInventoryUIService().getInventoryDefinitionsMap();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	@SkipValidation
	public String goSaveContractDetails() {
		try {
			logger.debug("In goSaveContractDetails...");
			// update application submitted;
		} catch(Throwable th) {
			th.printStackTrace();		
		}
		return SUCCESS;
	}
	
	@SkipValidation
	public String goSaveContractMasterDetails() {
		try {
			logger.debug("In goSaveContractMasterDetails...");
			// update application submitted;
		} catch(Throwable th) {
			th.printStackTrace();		
		}
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

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public ContractMasterViewModel getContractMasterViewModel() {
		return contractMasterViewModel;
	}

	public void setContractMasterViewModel(ContractMasterViewModel contractMasterViewModel) {
		this.contractMasterViewModel = contractMasterViewModel;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Long getContractTypeId() {
		return contractTypeId;
	}

	public void setContractTypeId(Long contractTypeId) {
		this.contractTypeId = contractTypeId;
	}

	public Long getProcurementTypeId() {
		return procurementTypeId;
	}

	public void setProcurementTypeId(Long procurementTypeId) {
		this.procurementTypeId = procurementTypeId;
	}

	public Long getRequestedUnitId() {
		return requestedUnitId;
	}

	public void setRequestedUnitId(Long requestedUnitId) {
		this.requestedUnitId = requestedUnitId;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public ContractDetailsViewModel getContractDetailsViewModel() {
		return contractDetailsViewModel;
	}

	public void setContractDetailsViewModel(ContractDetailsViewModel contractDetailsViewModel) {
		this.contractDetailsViewModel = contractDetailsViewModel;
	}

	public Long getContrctDetailsId() {
		return contrctDetailsId;
	}

	public void setContrctDetailsId(Long contrctDetailsId) {
		this.contrctDetailsId = contrctDetailsId;
	}

	public ContractDetailBean getContractDetails() {
		return contractDetails;
	}

	public void setContractDetails(ContractDetailBean contractDetails) {
		this.contractDetails = contractDetails;
	}

	public Map<Long, String> getCommoditiesMap() {
		return commoditiesMap;
	}

	public void setCommoditiesMap(Map<Long, String> commoditiesMap) {
		this.commoditiesMap = commoditiesMap;
	}

	public DocumentViewModel getDocumentViewModal() {
		return documentViewModal;
	}

	public void setDocumentViewModal(DocumentViewModel documentViewModal) {
		this.documentViewModal = documentViewModal;
	}

	public ContractMasterBean getContractMasterBean() {
		return contractMasterBean;
	}

	public void setContractMasterBean(ContractMasterBean contractMasterBean) {
		this.contractMasterBean = contractMasterBean;
	}

}

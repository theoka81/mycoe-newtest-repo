package com.scm.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.scm.keys.UserCodeIdKeys;
import com.scm.modal.DocumentViewModel;
import com.scm.modal.InventoryBean;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.InventoryViewModel;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;

@Controller("inventoryAction")
@Scope("prototype")
public class InventoryAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6402907660493973555L;

	private List<InventoryDefinitionsBean> data = new ArrayList<InventoryDefinitionsBean>();
    private Integer draw=0, recordsTotal=1, recordsFiltered = 0, length = 0, start=0;
    private String error_custom;  
    
    private InventoryViewModel inventoryViewModel;
    
    private InventoryBean inventoryBean;
    
    private Long inventoryId;
    
    private Long statusId;
    private Long configId;
    private Long inventoryStatusId;
    private Long stockingTypeId;
    private Long familySectionId;
    private Long segmentId;

	DocumentViewModel documentViewModal = new DocumentViewModel();

	@SkipValidation
	public String execute() {
		
		return SUCCESS;
	}
	
	@SkipValidation
	public String goInventorySpecificationIndex() {
		logger.debug("In goInventoryIdentificationIndex...");
		try {
			statusId=menuStatusId;
					pageTitle = "Commodity Specification";
			
				configId=(long) UserCodeIdKeys.Commodity_Specification;
			
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String goInventoryIdentificationIndex() {
		logger.debug("In goInventoryIdentificationIndex...");
		try {
			    statusId=menuStatusId;
					pageTitle = "Commodity Identification";
				configId=(long) UserCodeIdKeys.Commodity_Identification;
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	@SkipValidation
	public String goLoadInventories()
	{
		logger.debug("In goLoadInventories...");
		try {
			
			System.out.println("Config Id"+ configId);
			System.out.println("Status Id"+ statusId);
			
			
			
			SearchSortContainer searchSortContainer = getSearchSortBean();
			
			if(statusId != null && statusId != -1) {
				searchSortContainer.setStatusId(statusId);
			}

			if(segmentId != null && segmentId != -1) {
				searchSortContainer.setSegmentId(segmentId);
			}
		/*	if(procurementTypeId != null && procurementTypeId != -1) {
				searchSortContainer.setProcurementTypeId(procurementTypeId);
			}
			if(requestedUnitId != null && requestedUnitId != -1) {
				searchSortContainer.setRequestedUnitId(requestedUnitId);
			}
			if(supplierId != null && supplierId != -1) {
				searchSortContainer.setSupplierId(supplierId);
			}*/
			
			data = new ArrayList<InventoryDefinitionsBean>();
			SummaryResponse<InventoryDefinitionsBean> summary = serviceManager.getInventoryUIService()
					.getInventoryDetailsSummary(getPaginationObject(), searchSortContainer);
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
	
	public String goGetDetails() {
		logger.debug("In goGetDetails...");
		try {
			System.out.println("inventoryId"+inventoryId);
			System.out.println("config id"+ configId);
			inventoryViewModel = serviceManager.getInventoryUIService().getInventoryVewModalDetails(inventoryId);
			documentViewModal = inventoryViewModel.getDocumentViewModel();

		} catch(Throwable th) {
			th.printStackTrace();
		}
		return SUCCESS;
	}
	@SkipValidation
	public String gosaveDetails() {
		try {
			logger.debug("In gosaveDetails...");
			// update application submitted;

			inventoryViewModel = serviceManager.getInventoryUIService().saveDetails(inventoryBean,
					populateDocumentBean(), (Long) ActionContext.getContext().getSession().get("SESSION_USER_ID"));

		} catch (Throwable th) {
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
			if(map.get("columns["+map.get("order[0][column]").getValue()+"][data]") != null) {
				columnName = map.get("columns["+map.get("order[0][column]").getValue()+"][data]").getValue();
			}
		}
		
		System.out.println("searchValue:" + searchValue + " | sort columnName: " + columnName + " | sort order: " + order);
		SearchSortContainer searchSortBean = new SearchSortContainer();
		
		  searchSortBean.setSearchValue(searchValue);
		  searchSortBean.setSidx(columnName);
		  searchSortBean.setSord(order);
		 
		return searchSortBean;
	}

	

	public List<InventoryDefinitionsBean> getData() {
		return data;
	}

	public void setData(List<InventoryDefinitionsBean> data) {
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


	public InventoryViewModel getInventoryViewModel() {
		return inventoryViewModel;
	}


	public void setInventoryViewModel(InventoryViewModel inventoryViewModel) {
		this.inventoryViewModel = inventoryViewModel;
	}


	public Long getInventoryId() {
		return inventoryId;
	}


	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}


	public InventoryBean getInventoryBean() {
		return inventoryBean;
	}


	public void setInventoryBean(InventoryBean inventoryBean) {
		this.inventoryBean = inventoryBean;
	}


	public Long getStatusId() {
		return statusId;
	}


	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}


	public Long getConfigId() {
		return configId;
	}


	public void setConfigId(Long configId) {
		this.configId = configId;
	}


	public Long getInventoryStatusId() {
		return inventoryStatusId;
	}


	public void setInventoryStatusId(Long inventoryStatusId) {
		this.inventoryStatusId = inventoryStatusId;
	}


	public Long getStockingTypeId() {
		return stockingTypeId;
	}


	public void setStockingTypeId(Long stockingTypeId) {
		this.stockingTypeId = stockingTypeId;
	}


	public Long getFamilySectionId() {
		return familySectionId;
	}


	public void setFamilySectionId(Long familySectionId) {
		this.familySectionId = familySectionId;
	}


	public Long getSegmentId() {
		return segmentId;
	}


	public void setSegmentId(Long segmentId) {
		this.segmentId = segmentId;
	}

	public DocumentViewModel getDocumentViewModal() {
		return documentViewModal;
	}

	public void setDocumentViewModal(DocumentViewModel documentViewModal) {
		this.documentViewModal = documentViewModal;
	}

}

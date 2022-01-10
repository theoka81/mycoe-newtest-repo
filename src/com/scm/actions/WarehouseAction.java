package com.scm.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.beust.jcommander.internal.Lists;
import com.opensymphony.xwork2.ActionContext;
import com.scm.modal.GenericDropDownBean;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Controller("warehouseAction")
@Scope("prototype")
public class WarehouseAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6402907660493973555L;

	private List<GenericDropDownBean> data = new ArrayList<GenericDropDownBean>();
	private String output;
    private Integer draw=0, recordsTotal=1, recordsFiltered = 0, length = 0, start=0;
    private String error_custom;    

	@SkipValidation
	public String execute() {
		
		return SUCCESS;
	}
	

	@SkipValidation
	public String goLoadActiveWarehouses()
	{
		logger.debug("In goLoadActiveWarehouses...");
		try {
			

			List<GenericDropDownBean> summary = serviceManager.getWarehouseUIService()
					.getActiveWarehouses();
			data.addAll(summary);
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
	
	public String goExtendItemsToWarehouse(long[] itemId,long warehouseId)
	{
		logger.debug("In goLoadActiveWarehouses...");
		try {
			
			

			String summary = serviceManager.getWarehouseUIService()
					.goExtendItemsToWarehouse(itemId, warehouseId);
			
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

	

	public List<GenericDropDownBean> getData() {
		return data;
	}

	public void setData(List<GenericDropDownBean> data) {
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

}

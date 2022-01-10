package com.scm.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.modal.WorkflowBean;
import com.scm.modal.WorkflowTotCountBean;

@Controller("workflowAction")
@Scope("prototype")
public class WorkflowAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6402907660493973555L;

	private List<WorkflowBean> data = new ArrayList<WorkflowBean>();
	private WorkflowTotCountBean output = new WorkflowTotCountBean();
	private Integer draw = 0, recordsTotal = 1, recordsFiltered = 0, length = 0, start = 0;
	private String error_custom;
	
	private Long transactionTypeId;

	@SkipValidation
	public String execute() {

		return SUCCESS;
	}

	@SkipValidation
	public String goPagination() {
		logger.debug("In goPagination...");
		try {
			data = new ArrayList<WorkflowBean>();

			SummaryResponse<WorkflowBean> summary = serviceManager.getWorkflowUIService()
					.getWorkflowDetailsSummary(getPaginationObject(), getSearchSortBean(), transactionTypeId);
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

	public String goTotalVsApproved() {
		logger.debug("In goTotalVsApproved...");
		try {
			output = new WorkflowTotCountBean();

			output = serviceManager.getWorkflowUIService().getTotalvsApproved();

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
			if (map.get("columns[" + map.get("order[0][column]").getValue() + "][data]") != null) {
				columnName = map.get("columns[" + map.get("order[0][column]").getValue() + "][data]").getValue();
			}
		}

		System.out.println(
				"searchValue:" + searchValue + " | sort columnName: " + columnName + " | sort order: " + order);
		SearchSortContainer searchSortBean = new SearchSortContainer();

		searchSortBean.setSearchValue(searchValue);
		searchSortBean.setSidx(columnName);
		searchSortBean.setSord(order);

		return searchSortBean;
	}

	public List<WorkflowBean> getData() {
		return data;
	}

	public void setData(List<WorkflowBean> data) {
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

	public WorkflowTotCountBean getOutput() {
		return output;
	}

	public void setOutput(WorkflowTotCountBean output) {
		this.output = output;
	}

	public Long getTransactionTypeId() {
		return transactionTypeId;
	}

	public void setTransactionTypeId(Long transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

}

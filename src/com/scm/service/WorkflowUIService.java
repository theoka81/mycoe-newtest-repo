package com.scm.service;

import java.util.List;

import com.scm.dao.domain.Workflow;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.modal.WorkflowBean;
import com.scm.modal.WorkflowTotCountBean;

public interface WorkflowUIService {

	public SummaryResponse<WorkflowBean> getWorkflowDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj, Long transactionTypeId) throws Throwable;

	public WorkflowTotCountBean getTotalvsApproved() throws Throwable;

	public List<WorkflowBean> getTenderWorkflowsToday(String username) throws Throwable;
	
	public List<Workflow> getWorkflowDetails(Long transactionId, Long transactionTypeId, Long statusId) throws Throwable;
}

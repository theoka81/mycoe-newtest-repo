package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Workflow;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.WorkFlowGraphModal;
import com.scm.modal.WorkflowBean;
import com.scm.modal.WorkflowTotCountBean;

public interface WorkflowsDao  extends GenericDao<Workflow, Long>{

	public List<Workflow> getWorkflowsDetails(Long transactionId, Long transactionTypeId, Long statusId) throws Throwable;
	
	public WorkflowTotCountBean getTotalvsApproved() throws Throwable;
	
	public List<WorkflowBean> getWorkflowSummary(Pagination pagination,
			SearchSortContainer searchSortObj,String whereClause) throws Throwable;

	public int getWorkflowCount(SearchSortContainer searchSortObj,String whereClause) throws Throwable;

	public List<WorkFlowGraphModal> getWorkFlowGraphDetails(String transactionType) throws Throwable;
	
	public List<WorkflowBean> getTenderWorkflowsToday() throws Throwable;
	
	public List<WorkflowBean> getCommitteeWorkflowsList(String username) throws Throwable;
	
	public Workflow getWorkflowByTransactionId(Long contractMasterId) throws Throwable;
	
}

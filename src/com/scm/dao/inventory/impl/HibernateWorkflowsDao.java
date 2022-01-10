package com.scm.dao.inventory.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Workflow;
import com.scm.dao.inventory.WorkflowsDao;
import com.scm.keys.UserCodeIdKeys;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.WorkFlowGraphModal;
import com.scm.modal.WorkflowBean;
import com.scm.modal.WorkflowTotCountBean;

@SuppressWarnings("deprecation")
@Repository
public class HibernateWorkflowsDao extends HibernateGenericDao<Workflow, Long> implements WorkflowsDao {

	@Override
	@Transactional
	public List<Workflow> getWorkflowsDetails(Long transactionId, Long transactionTypeId, Long statusId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("transactionId", transactionId));
		crit.add(Restrictions.eq("userCode6.id", transactionTypeId));
		if(statusId != null)
			crit.add(Restrictions.eq("userCode4.id", statusId));
		crit.addOrder(Order.desc("id"));
		List<Workflow> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

	@Override
	public WorkflowTotCountBean getTotalvsApproved() throws Throwable {
		WorkflowTotCountBean wto = new WorkflowTotCountBean();
		wto.setTotal(getWorkflowCount(null, " id > 0"));
		wto.setApproved(getWorkflowCount(null, " Statusid = " + UserCodeIdKeys.WorkflowStatusActive));

		return wto;
	}

	@Override
	public List<WorkflowBean> getWorkflowSummary(Pagination pagination, SearchSortContainer searchSortObj,
			String whereClause) throws Throwable {
		StringBuilder queryStr = new StringBuilder();
		queryStr.append("select w.id,stepno,approvalTemplateDescription,workflowDescription,"
				+ "CONVERT(VARCHAR,CONVERT(DATE,w.WorkflowDateStarted)) as workflowDateStarted"
				+ ",CONVERT(VARCHAR,CONVERT(DATE,w.TaskDateStarted)) as taskDateStarted"
				+ ",CONVERT(VARCHAR,CONVERT(DATE,w.WorkflowDateEnded)) as workflowDateEnded"
				+ ",CONVERT(VARCHAR,CONVERT(DATE,w.TaskDateEnded)) as taskDateEnded,"
				+ "approvedMessage, u.[description] as [status], su.firstname + ' ' + su.lastname as fullname"
				+ " from Workflows w inner join ApprovalTemplates a on a.id=w.ApprovalTemplateVersionId"
				+ " inner join UserCodes u on u.id=w.StatusId"
				+ " Left outer join systemusers su on su.id=w.ApprovedByUserId where " + whereClause);
		if (searchSortObj != null) {
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
					queryStr.append(" and Id =" + searchSortObj.getSearchValue());
			}

			if (StringHelper.isNotEmpty(searchSortObj.getSidx()) && StringHelper.isNotEmpty(searchSortObj.getSord())) {
				if (searchSortObj.getSidx().equalsIgnoreCase("Id")) {
					queryStr.append(" order by w.Id " + searchSortObj.getSord());
				} else {
					queryStr.append(" order by w.id desc");
				}
			} else {
				queryStr.append(" order by w.id desc");
			}
		}
		Query query = getSession().createSQLQuery(queryStr.toString()).addScalar("id", new LongType())
				.addScalar("stepNo", new StringType()).addScalar("approvalTemplateDescription", new StringType())
				.addScalar("workflowDescription", new StringType()).addScalar("status", new StringType())
				.addScalar("workflowDateStarted", new StringType()).addScalar("workflowDateEnded", new StringType())
				.addScalar("taskDateEnded", new StringType()).addScalar("taskDateStarted", new StringType())
				.addScalar("fullname", new StringType()).addScalar("approvedMessage", new StringType());
		if (pagination != null) {
			if (pagination.getOffset() > 0) {
				query.setFirstResult(pagination.getOffset());
			}
			if (pagination.getSize() > 0) {
				query.setMaxResults(pagination.getSize());
			}
		}
		List<WorkflowBean> smList = query.setResultTransformer(Transformers.aliasToBean(WorkflowBean.class)).list();
		return smList;
	}

	@Override
	public int getWorkflowCount(SearchSortContainer searchSortObj, String whereClause) throws Throwable {
		int count = 0;
		StringBuilder queryStr = new StringBuilder();
		queryStr.append(" select count(*) from Workflows w where  " + whereClause);
		if (searchSortObj != null) {
			if ( StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {

			}

		}
		Query query = getSession().createSQLQuery(queryStr.toString());
		Integer obj = (Integer) query.uniqueResult();
		if (obj != null) {
			count = obj.intValue();
		}
		return count;
	}

	@Override
	public List<WorkFlowGraphModal> getWorkFlowGraphDetails(String transactionType) throws Throwable {
		Query qry = getSession().createSQLQuery("SELECT CONVERT(varchar, WorkflowDateStarted, 110) as dateStarted, "
				+ "(SELECT COUNT(*) from WORKFLOWS a where STATUSID=" + UserCodeIdKeys.WorkflowStatusActive
				+ " and CONVERT(varchar, WorkflowDateStarted, 110)=CONVERT(varchar, w.WorkflowDateStarted, 110) and a.TransactionTypeId=w.TransactionTypeId) as accepted, "
				+ "(SELECT COUNT(*) from WORKFLOWS b where STATUSID=" + UserCodeIdKeys.WorkflowStatusPending
				+ " and CONVERT(varchar, WorkflowDateStarted, 110)=CONVERT(varchar, w.WorkflowDateStarted, 110)  and b.TransactionTypeId=w.TransactionTypeId) as pending, "
				+ "(SELECT COUNT(*) from WORKFLOWS c where STATUSID=" + UserCodeIdKeys.WorkflowStatusDeactivated
				+ " and CONVERT(varchar, WorkflowDateStarted, 110)=CONVERT(varchar, w.WorkflowDateStarted, 110)  and c.TransactionTypeId=w.TransactionTypeId) as rejected "
				+ "from Workflows w where w.TransactionTypeId in (:transactionTypeId)  "
				+ "group by CONVERT(varchar, WorkflowDateStarted, 110), TransactionTypeId")
				.addScalar("dateStarted", new StringType()).addScalar("accepted", new IntegerType())
				.addScalar("pending", new IntegerType()).addScalar("rejected", new IntegerType());
		List<Integer> transactionTypeList = new ArrayList<Integer>();
		switch (transactionType) {
		case "contract": {
			transactionTypeList.add(UserCodeIdKeys.TransactionType_ContractNonStock);
			transactionTypeList.add(UserCodeIdKeys.TransactionType_ContractStock);
			transactionTypeList.add(UserCodeIdKeys.TransactionType_ContractServices);
			break;
		}
		case "supplier": {
			transactionTypeList.add(UserCodeIdKeys.TransactionType_Vendor);
			break;
		}
		case "inventory": {
			transactionTypeList.add(UserCodeIdKeys.TransactionType_InventoryNonStock);
			transactionTypeList.add(UserCodeIdKeys.TransactionType_InventoryStock);
			transactionTypeList.add(UserCodeIdKeys.TransactionType_InventoryServices);
			break;
		}
		case "standardAgreement": {
			transactionTypeList.add(UserCodeIdKeys.TransactionType_StandardAgreement);
			break;
		}
		case "supplierComplaintEscalation": {
			transactionTypeList.add(UserCodeIdKeys.TransactionType_SupplierCompliant);
			break;
		}
		case "supplierEnquiryEscalation": {
			transactionTypeList.add(UserCodeIdKeys.TransactionType_SupplierEnquiry);
			break;
		}
		}

		qry.setParameterList("transactionTypeId", transactionTypeList);

		List<WorkFlowGraphModal> smList = qry.setResultTransformer(Transformers.aliasToBean(WorkFlowGraphModal.class))
				.list();
		return smList;
	}

	@Override
	public List<WorkflowBean> getTenderWorkflowsToday() throws Throwable {
		Query qry = getSession()
				.createSQLQuery("select w.id as id, w.StepNo as stepNo, w.WorkflowDescription as workflowDescription, s.EmailAddress as approvedBy, "
						+ "CONVERT(VARCHAR,CONVERT(DATE,w.WorkflowDateStarted)) as workflowDateStarted, CONVERT(VARCHAR,CONVERT(DATE,w.TaskDateStarted)) as taskDateStarted,"
						+ " w.Status as status "
						+ "from workflows w, SystemUsers s where w.ApprovedByUserId=s.id and w.TransactionTypeId=" + UserCodeIdKeys.TransactionType_Tender + " and "
						+ "CONVERT(varchar(12),w.WorkflowDateStarted, 103) = CONVERT(varchar(12),GETDATE(), 103) and "
						+ "w.WorkflowDateStarted is null")
				.addScalar("id", new LongType()).addScalar("stepNo", new StringType())
				.addScalar("workflowDescription", new StringType()).addScalar("status", new StringType())
				.addScalar("workflowDateStarted", new StringType()).addScalar("taskDateStarted", new StringType())
				.addScalar("approvedBy", new StringType());
		List<WorkflowBean> smList = qry.setResultTransformer(Transformers.aliasToBean(WorkflowBean.class)).list();
		return smList;
	}

	@Override
	public List<WorkflowBean> getCommitteeWorkflowsList(String username) throws Throwable {
		Query qry = getSession()
				.createSQLQuery("select wf.id as id, wf.StepNo as stepNo, wf.WorkflowDescription as workflowDescription, s.EmailAddress as approvedBy, "
						+ "CONVERT(VARCHAR,CONVERT(DATE,wf.WorkflowDateStarted)) as workflowDateStarted, "
						+ "CONVERT(VARCHAR,CONVERT(DATE,wf.TaskDateStarted)) as taskDateStarted, wf.Status as status "
						+ "from Workflows wf, WorkflowRegisters wr, SystemUsers s "
						+ " where wf.ApprovedByUserId=s.id and wf.Id = wr.WorkflowId " + "and wr.Reviewer = :userName " + "and wf.TransactionTypeId ="
						+ UserCodeIdKeys.TransactionType_Tender + "and wf.StatusId="
						+ UserCodeIdKeys.WorkflowStatusPending + "and wf.IsDeleted =:isDeleted "
						+ "and wr.IsPendingApproval=:isPendingApproval " + "and wr.HasApproved=:hasApproved "
						+ "and CONVERT(varchar(12),WorkflowDateStarted, 103) = CONVERT(varchar(12),GETDATE(), 103) "
						+ "and wf.WorkflowDateEnded is null")
				.addScalar("id", new LongType()).addScalar("stepNo", new StringType())
				.addScalar("workflowDescription", new StringType()).addScalar("status", new StringType())
				.addScalar("workflowDateStarted", new StringType()).addScalar("taskDateStarted", new StringType())
				.addScalar("approvedBy", new StringType());
		qry.setString("userName", username);
		qry.setBoolean("isDeleted", false);
		qry.setBoolean("isPendingApproval", true);
		qry.setBoolean("hasApproved", false);
		List<WorkflowBean> smList = qry.setResultTransformer(Transformers.aliasToBean(WorkflowBean.class)).list();
		return smList;
	}

	@Override
	public Workflow getWorkflowByTransactionId(Long contractMasterId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("transactionId", contractMasterId));

		List<Workflow> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}

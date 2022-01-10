package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.RequisitionDetail;

public interface RequisitionDetailsDao  extends GenericDao<RequisitionDetail, Long>{

	public Long getRequisitionDetailsBy(Long transactionId) throws Throwable;
}

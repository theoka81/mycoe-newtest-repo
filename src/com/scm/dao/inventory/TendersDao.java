package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Tender;
import com.scm.modal.TendersBean;

public interface TendersDao extends GenericDao<Tender, Integer>{

	public List<TendersBean> getTendersDetails() throws Throwable;
}

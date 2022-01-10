package com.scm.service;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Tender;
import com.scm.modal.TendersBean;

public interface TendersUIService {

	public List<TendersBean> getTendersDetails() throws Throwable;
}

package com.scm.service.impl;



import java.util.List;

import org.springframework.stereotype.Service;

import com.scm.modal.TendersBean;
import com.scm.service.TendersUIService;
import com.scm.service.common.BaseUIservice;

@Service
public class TendersUIServiceImpl extends BaseUIservice implements TendersUIService {

	@Override
	public List<TendersBean> getTendersDetails() throws Throwable {
		return daoManager.getTendersDao().getTendersDetails();
	}

	

}

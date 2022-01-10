package com.scm.service.impl;

import org.springframework.stereotype.Service;

import com.scm.service.RequisitionDetailsEngineService;
import com.scm.service.common.BaseUIservice;

@Service
public class RequisitionDetailsEngineServiceImpl  extends BaseUIservice implements RequisitionDetailsEngineService {

	public Long totalExtendedPrice(Long transactionId) throws Throwable {
		
		return daoManager.getRequisitionDetailsDao().getRequisitionDetailsBy(transactionId);
	}
}

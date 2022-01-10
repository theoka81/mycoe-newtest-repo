package com.scm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.scm.dao.domain.InventoryDefinition;
import com.scm.dao.domain.InventoryPricing;
import com.scm.dao.domain.InventorySpecification;
import com.scm.dao.domain.InventoryWarehouseDefault;
import com.scm.dao.domain.UomConversion;
import com.scm.dao.inventory.UomConversionDao;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.InventoryViewModel;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.StandardAgreementBean;
import com.scm.modal.SummaryResponse;
import com.scm.service.InventoryUIService;
import com.scm.service.StandardAgreementUIService;
import com.scm.service.common.BaseUIservice;

@Service
public class StandardAgreementUIServiceImpl extends BaseUIservice implements StandardAgreementUIService {

	@Override
	public Map<Integer, String> getStandardAgreementDropDown() throws Throwable {
		
		Map<Integer, String>  summary  = daoManager.getStandardAgreementDao().getStandardAgreementDropDown();

		return summary;
	}


	
}

package com.scm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.domain.Clause;
import com.scm.dao.domain.ClauseMapping;
import com.scm.dao.domain.ContractDetail;
import com.scm.dao.domain.ContractMaster;
import com.scm.dao.domain.Document;
import com.scm.dao.domain.IPW;
import com.scm.dao.domain.SROe;
import com.scm.dao.domain.UserCode;
import com.scm.dao.domain.Workflow;
import com.scm.keys.UserCodeIdKeys;
import com.scm.keys.UserCodeKeys;
import com.scm.modal.ContractBean;
import com.scm.modal.ContractDetailBean;
import com.scm.modal.ContractDetailsViewModel;
import com.scm.modal.ContractMasterViewModel;
import com.scm.modal.DocumentViewModel;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.service.ContractUIService;
import com.scm.service.common.BaseUIservice;

@Service
public class ContractUIServiceImpl extends BaseUIservice implements ContractUIService {

	@Override
	@Transactional
	public SummaryResponse<ContractBean> getContractMastersSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable {
		SummaryResponse<ContractBean> summary = new SummaryResponse<ContractBean>();
		summary.setTotalRecords(daoManager.getContractMasterDao().getContractMastersCount(searchSortObj));
		summary.setEntities(daoManager.getContractMasterDao().getContractMastersSummary(pagination, searchSortObj));

		return summary;
	}

	@Override
	@Transactional
	public void loadContractMasterDetails(Long contractId, ContractMasterViewModel cvm) throws Throwable {

		ContractMaster cm = daoManager.getContractMasterDao().get(contractId);

		if (cm != null) {
			cvm.setContractMaster(cm);
			List<ContractDetail> cdList = daoManager.getContractDetailsDao()
					.getContractDetailsByContractMasterId(cm.getId());
			if (cdList != null)
				cvm.setContractDetails(cdList.get(0));

			Workflow wf = daoManager.getWorkflowsDao().getWorkflowByTransactionId(cm.getId());

			if (wf != null) {
				cvm.setWorkFlowStatus(wf.getStatus());
			}

			if (cdList != null)
				cvm.setContractDetailsList(cdList);

			documentManagement(cvm);

			SROe sro = daoManager.getSroDao().getSROByContract(cm.getId());
			IPW ipw = daoManager.getIpwDao().getIPWByContract(cm.getId());

			cvm.setServiceRequestOrder(sro);
			cvm.setInstructionsToPerformWork(ipw);

		} else {
			cm = new ContractMaster();
			cvm.setContractMaster(cm);
		}
	}

	private void documentManagement(ContractMasterViewModel cvm) throws Throwable {
		DocumentViewModel dmv = new DocumentViewModel();
		dmv.setReferenceId(cvm.getContractMaster().getId());
		dmv.setUploadView(true);
		List<UserCode> userCodeList = daoManager.getUserCodeDao()
				.getUserCodeDetails(UserCodeKeys.ContractRegistrationDocumentsUpload);
		List<Document> documentList = daoManager.getDocumentsDao().getDocumentsDetails(cvm.getContractMaster().getId());
		dmv.setDocumentCheckLists(userCodeList);
		dmv.setDocuments(documentList);
		cvm.setDocumentViewModel(dmv);

	}

	@Transactional
	public Map<Long, String> goUserCodeKeyMap(String codeKey, boolean isContractType) throws Throwable {
		return daoManager.getUserCodeDao().getUserCodeKeyMap(codeKey, isContractType);
	}

	@Override
	@Transactional
	public SummaryResponse<ContractDetailBean> getContractDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable {
		SummaryResponse<ContractDetailBean> summary = new SummaryResponse<ContractDetailBean>();
		summary.setTotalRecords(daoManager.getContractDetailsDao().getContractDetailsCount(searchSortObj));
		summary.setEntities(daoManager.getContractDetailsDao().getContractDetailsSummary(pagination, searchSortObj));

		return summary;
	}

	@Override
	@Transactional
	public void loadContractDetails(Long contractId, ContractDetailsViewModel contractDetailsViewModel)
			throws Throwable {
		contractDetailsViewModel.setContractDetails(daoManager.getContractDetailsDao().get(contractId));
		Long contractMasterId = contractDetailsViewModel.getContractDetails().getContractMasterId();
		contractDetailsViewModel.setSignatory(daoManager.getSignatoriesDao().getSignatoriesByContractMaster(contractId));
		
		List<ClauseMapping> clauseMappingList = daoManager.getClauseMappingDao().getClauseMappingDetails(contractId,
				contractMasterId, Long.valueOf(UserCodeIdKeys.ClauseType_Contract));
		
		contractDetailsViewModel.setContractClauses(clauseMappingList);
		
		List<Clause> clauseList = daoManager.getClauseMappingDao().getClausesDetails(contractId,
				contractMasterId, Long.valueOf(UserCodeIdKeys.ClauseType_Contract));
		
		contractDetailsViewModel.setClauses(clauseList);
		documentManagement(contractDetailsViewModel);
		
		contractDetailsViewModel.getContractDetails().setContractMaster(daoManager.getContractMasterDao().get(contractMasterId));
		contractDetailsViewModel.getContractDetails().setInventoryDefinition(null);
		
	}
	
	private void documentManagement(ContractDetailsViewModel cvm) throws Throwable {
		DocumentViewModel dmv = new DocumentViewModel();
		dmv.setReferenceId(cvm.getContractDetails().getId());
		dmv.setUploadView(true);
		List<UserCode> userCodeList = daoManager.getUserCodeDao()
				.getUserCodeDetails(UserCodeKeys.ContractDetailsDocumentUpload);
		List<Document> documentList = daoManager.getDocumentsDao().getDocumentsDetails(cvm.getContractDetails().getId());
		dmv.setDocumentCheckLists(userCodeList);
		dmv.setDocuments(documentList);
		cvm.setDocumentViewModel(dmv);

	}
}

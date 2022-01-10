package com.scm.service;

import java.util.List;
import java.util.Map;

import com.scm.dao.domain.Address;
import com.scm.dao.domain.Supplier;
import com.scm.dao.domain.SupplierCompliantHeader;
import com.scm.dao.domain.SupplierEnquiryHeader;
import com.scm.modal.BidSpecificationsBean;
import com.scm.modal.ContractDetailBean;
import com.scm.modal.DashBoardViewModal;
import com.scm.modal.DocumentBean;
import com.scm.modal.IPWBean;
import com.scm.modal.Pagination;
import com.scm.modal.RequisitionDetailBean;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SroBean;
import com.scm.modal.SummaryResponse;
import com.scm.modal.SupplierViewModel;
import com.scm.modal.SuppliersBean;
import com.scm.modal.WorkFlowGraphModal;

public interface SupplierUIService {

	public SummaryResponse<SroBean> getSupplierSRODetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable;

	public List<ContractDetailBean> getContractDetailsList(String maaaNumber) throws Throwable;

	public List<RequisitionDetailBean> loadRequisitionDetails(String maaaNumber, Integer orderTypeId) throws Throwable;

	public List<RequisitionDetailBean> loadQuotationDetails(String maaaNumber, Integer orderTypeId) throws Throwable;

	public List<BidSpecificationsBean> loadBidSpecifications(String maaaNumber) throws Throwable;

	public List<SroBean> getSROList(String maaaNumber) throws Throwable;

	public List<IPWBean> getIPWList(String maaaNumber) throws Throwable;

	public List<SupplierCompliantHeader> getSCHList(String maaaNumber) throws Throwable;

	public List<SupplierEnquiryHeader> getSEHList(String maaaNumber) throws Throwable;

	public Supplier getSupplierDetails(String maaaNumber) throws Throwable;

	public SupplierViewModel getSupplierVewModalDetails(Long supplierId, String maaaNumber, Long systemUserId)
			throws Throwable;

	public List<DashBoardViewModal> getBackOfficeEnquiryCompliantCount() throws Throwable;

	public List<WorkFlowGraphModal> getWorkFlowGraphData(String transactionType) throws Throwable;

	public Map<Long, String> getSuppliersMap() throws Throwable;

	public SummaryResponse<SuppliersBean> getSupplierMastersSummary(Pagination paginationObject,
			SearchSortContainer searchSortContainer) throws Throwable;

	public SupplierViewModel saveSupplierDetails(SuppliersBean supplierBean, DocumentBean documentBean, Long systemUserId)
			throws Throwable;
	
	public SummaryResponse<Address> getSupplierAddressSummary(Pagination pagination,
			SearchSortContainer searchSortContainer) throws Throwable;
	
	public Address getSupplierAddressDetails(Long id) throws Throwable;
}

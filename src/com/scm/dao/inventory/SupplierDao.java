package com.scm.dao.inventory;

import java.util.List;
import java.util.Map;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Supplier;
import com.scm.modal.BidSpecificationsBean;
import com.scm.modal.Pagination;
import com.scm.modal.RequisitionDetailBean;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SroBean;
import com.scm.modal.SuppliersBean;

public interface SupplierDao extends GenericDao<Supplier, Long> {

	public List<SroBean> getSupplierSRODetailsSummary(Pagination pagination, SearchSortContainer searchSortObj)
			throws Throwable;

	public int getSupplierSRODetailsCount(SearchSortContainer searchSortObj) throws Throwable;

	public List<RequisitionDetailBean> loadRequisitionDetails(String maaaNumber, Integer orderTypeId) throws Throwable;

	public List<RequisitionDetailBean> loadQuotationDetails(String maaaNumber, Integer orderTypeId) throws Throwable;
	
	public List<BidSpecificationsBean> loadBidSpecifications(String maaaNumber) throws Throwable;
	
	public Supplier getSupplierDetails(String maaaNumber) throws Throwable;
	
	public void importSupplierAsync(String maaaNumber) throws Throwable;
	
	public  Map<Integer, String> goBbbeeVerificationRegulatorsMap() throws Throwable ;
	
	public  Map<Integer, String> goBusinessStatusMap() throws Throwable;
	
	public  Map<Integer, String> goCountriesMap() throws Throwable;
	
	public  Map<Integer, String> goGovernmentTypesMap() throws Throwable;
	
	public  Map<Integer, String> goIdTypesMap() throws Throwable;
	
	public  Map<Integer, String> goSupplierStatesMap() throws Throwable;
	
	public  Map<Integer, String> goSupplierSubClassificationsMap() throws Throwable;
	
	public  Map<Integer, String> goSupplierClassificationsMap() throws Throwable;
	
	public  Map<Integer, String> goBbbeeTotalAnnualTurnoversMap() throws Throwable;
	
	public  Map<Integer, String> goBbbeeCertificateTypesMap() throws Throwable;
	
	public  Map<Integer, String> goBbbeeIrbaRegisteredAuditorsMap() throws Throwable;
	
	public  Map<Integer, String> goSanasBbbeeVerificationAgenciesMap() throws Throwable;
	
	public  Map<Integer, String> goBbbeeSectorChartersMap() throws Throwable;
	
	public  Map<Integer, String> goBbbeeStatusLevelOfContributorsMap() throws Throwable;
	
	public  Map<Integer, String> goUserCodeKeyMap(String codeKey) throws Throwable;
	
	public Map<Long, String> getSuppliersMap() throws Throwable;
	
	public Map<Long, String> getActiveSuppliersMap() throws Throwable;
	
	public List<SuppliersBean> getSupplierMastersSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable;

	public int getSupplierMastersCount(SearchSortContainer searchSortObj) throws Throwable;

}

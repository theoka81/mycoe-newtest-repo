package com.scm.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.scm.dao.domain.Address;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;

@Controller("addressAction")
@Scope("prototype")
public class AddressAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Object> data = new ArrayList<Object>();
	private Integer draw = 0, recordsTotal = 1, recordsFiltered = 0, length = 0, start = 0;
	private String error_custom;

	private Long supplierId;
	private Long addressId;
	
	private String supplierNumber;
	
	private boolean isPreferred;
	private boolean isActive;
	
	
	private String addressTypeCode;
	private String addressLine1;
	private String addressLine2;
	private String countryCode;
	private String provinceCode;
	private String districtCode;
	private String municipalityCode;
	private String cityCode;
	private String suburbCode;
	private String wardCode;
	private String postalCode;
	private boolean isPostalAddress;
	private boolean isDeliveryAddress;
	private boolean isPhysicalAddress;
	private boolean isPaymentAddress;
	
	private String field1;
	private String field2;
	private String field3;
	private String createdDate;
	private String editDate;
	private String xmlFileId;
	private String processedTimeStamp;
	
	@SkipValidation
	public String execute() {

		return SUCCESS;
	}

	@SkipValidation
	public String goLoadSupplierAddress() {
		logger.debug("In goLoadSupplierAddress...");
		try {
			data = new ArrayList<Object>();

			SearchSortContainer searchSortContainer = getSearchSortBean();

			SummaryResponse<Address> summary = serviceManager.getSupplierUIService()
					.getSupplierAddressSummary(getPaginationObject(), searchSortContainer);
			data.addAll(summary.getEntities());
			recordsTotal = summary.getTotalRecords();
			recordsFiltered = recordsTotal;
			// sends an random error to the JSON
			if ((Math.random() * 10 > 9)) {
				error_custom = "Random Error test";
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	@SkipValidation
	public String loadSupplierAddressDetails() {
		logger.debug("In loadSupplierAddressDetails...");
		try {
			Address addr = serviceManager.getSupplierUIService().getSupplierAddressDetails(addressId);
			supplierId = addr.getSupplierId();
			supplierNumber = addr.getSupplierNumber();
			addressLine1 = addr.getAddressLine1();
			addressLine2 = addr.getAddressLine2();
			addressTypeCode = addr.getAddressTypeCode();
			
			field1 = addr.getField1();
			field2 = addr.getField2();
			field3 = addr.getField3();
			xmlFileId = addr.getXmlFileId()+"";
			
			countryCode = addr.getCountryCode();
			cityCode = addr.getCityCode();
			provinceCode = addr.getPostalCode();
			suburbCode = addr.getSuburbCode();
			wardCode = addr.getWardCode();
			municipalityCode = addr.getMunicipalityCode();
			districtCode = addr.getDistrictCode();
			postalCode = addr.getPostalCode();
			
			
			isPreferred = addr.getIsPreferred()== null? false:addr.getIsPreferred();
			isActive = addr.getIsActive()==null?false:addr.getIsActive();
			isPaymentAddress = addr.getIsPaymentAddress()==null?false:addr.getIsPaymentAddress(); 
			isDeliveryAddress = addr.getIsDeliveryAddress()==null?false:addr.getIsDeliveryAddress();
			isPhysicalAddress = addr.getIsPhysicalAddress()==null?false:addr.getIsPhysicalAddress();
			isPostalAddress = addr.getIsPostalAddress()==null?false:addr.getIsPostalAddress();
			
			createdDate = addr.getCreatedDate() +"";
			editDate = addr.getEditDate() + "";
			processedTimeStamp = addr.getProcessedTimeStamp()+"";
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}

	private Pagination getPaginationObject() {
		Pagination pagination = new Pagination();
		pagination.setOffset(start);
		pagination.setSize(length);
		return pagination;
	}

	private SearchSortContainer getSearchSortBean() {
		String searchValue = "";
		String columnName = "";
		String order = "";
		HttpParameters map = ActionContext.getContext().getParameters();
		if (map.get("order[0][dir]") != null) {
			order = map.get("order[0][dir]").getValue();
		}

		if (map.get("search[value]") != null) {
			searchValue = map.get("search[value]").getValue();
		}
		if (map.get("order[0][column]") != null) {
			if (map.get("columns[" + map.get("order[0][column]").getValue() + "][data]") != null) {
				columnName = map.get("columns[" + map.get("order[0][column]").getValue() + "][data]").getValue();
			}
		}

		logger.info("searchValue:" + searchValue + " | sort columnName: " + columnName + " | sort order: " + order);
		SearchSortContainer searchSortBean = new SearchSortContainer();

		searchSortBean.setSearchValue(searchValue);
		searchSortBean.setSidx(columnName);
		searchSortBean.setSord(order);

		return searchSortBean;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Integer getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(Integer recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public Integer getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(Integer recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public String getError_custom() {
		return error_custom;
	}

	public void setError_custom(String error_custom) {
		this.error_custom = error_custom;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getSupplierNumber() {
		return supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public boolean isPreferred() {
		return isPreferred;
	}

	public void setPreferred(boolean isPreferred) {
		this.isPreferred = isPreferred;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getAddressTypeCode() {
		return addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getMunicipalityCode() {
		return municipalityCode;
	}

	public void setMunicipalityCode(String municipalityCode) {
		this.municipalityCode = municipalityCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getSuburbCode() {
		return suburbCode;
	}

	public void setSuburbCode(String suburbCode) {
		this.suburbCode = suburbCode;
	}

	public String getWardCode() {
		return wardCode;
	}

	public void setWardCode(String wardCode) {
		this.wardCode = wardCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public boolean isPostalAddress() {
		return isPostalAddress;
	}

	public void setPostalAddress(boolean isPostalAddress) {
		this.isPostalAddress = isPostalAddress;
	}

	public boolean isDeliveryAddress() {
		return isDeliveryAddress;
	}

	public void setDeliveryAddress(boolean isDeliveryAddress) {
		this.isDeliveryAddress = isDeliveryAddress;
	}

	public boolean isPhysicalAddress() {
		return isPhysicalAddress;
	}

	public void setPhysicalAddress(boolean isPhysicalAddress) {
		this.isPhysicalAddress = isPhysicalAddress;
	}

	public boolean isPaymentAddress() {
		return isPaymentAddress;
	}

	public void setPaymentAddress(boolean isPaymentAddress) {
		this.isPaymentAddress = isPaymentAddress;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getEditDate() {
		return editDate;
	}

	public void setEditDate(String editDate) {
		this.editDate = editDate;
	}

	public String getXmlFileId() {
		return xmlFileId;
	}

	public void setXmlFileId(String xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public String getProcessedTimeStamp() {
		return processedTimeStamp;
	}

	public void setProcessedTimeStamp(String processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

}

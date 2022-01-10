package com.scm.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.scm.dao.domain.SystemUser;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.modal.UserBean;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Object> data = new ArrayList<Object>();
	private Integer draw = 0, recordsTotal = 1, recordsFiltered = 0, length = 0, start = 0;
	private String error_custom;

	private Long systemUserId;
	private String firstName;
	private String lastName;
	private String userName;
	private String companyName;
	private String designation;
	private String emailAddress;
	private String systemUserTypeId;
	private String statusId;
	private String identificationNumber;
	private String mobileNumber;
	private String maaaNumber;
	private String code;
	
	private boolean isActive;
	private boolean isDeleted;
	private boolean isLocked;
	private boolean isPasswordReset;
	private boolean isTemporaryPassword;
	
	private Long createdBySystemUserId;
	private Long modifiedBySystemUserId;
	
	private String createdDateTime;
	private String modifiedDateTime;
	
	

	@SkipValidation
	public String execute() {

		return SUCCESS;
	}

	@SkipValidation
	public String goLoadSystemUsers() {
		logger.debug("In goLoadSystemUsers...");
		try {
			data = new ArrayList<Object>();

			SearchSortContainer searchSortContainer = getSearchSortBean();

			SummaryResponse<UserBean> summary = serviceManager.getUserUIService()
					.getSystemUsersSummary(getPaginationObject(), searchSortContainer);
			data.addAll(summary.getEntities());
			recordsTotal = summary.getTotalRecords();
			recordsFiltered = recordsTotal;
			// sends an random error to the JSON
			if ((Math.random() * 10 > 9)) {
				error_custom = "Random Error test";
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}

	@SkipValidation
	public String loadSystemUserDetails() {
		logger.debug("In loadSystemUserDetails...");
		try {
			SystemUser sysUser = serviceManager.getUserUIService().getUserDetailsBy(systemUserId);
			
			firstName = sysUser.getFirstName();
			lastName = sysUser.getLastName();
			userName = sysUser.getUserName();
			emailAddress = sysUser.getEmailAddress();
			mobileNumber = sysUser.getMobileNumber();
			maaaNumber = sysUser.getMaaaNumber();
			identificationNumber = sysUser.getIdentificationNumber();
			companyName = sysUser.getCompanyName();
			code = sysUser.getCode();
			designation = sysUser.getDesignation();
			systemUserTypeId = sysUser.getSystemUserTypeId();
			statusId = sysUser.getStatusId();
			
			isActive = sysUser.getIsActive()==null?false: sysUser.getIsActive();
			isDeleted = sysUser.getIsDeleted()==null?false: sysUser.getIsDeleted();
			isLocked = sysUser.getIsLocked()==null?false: sysUser.getIsLocked();
			isPasswordReset = sysUser.getIsPasswordReset()==null?false:sysUser.getIsPasswordReset();
			isTemporaryPassword = sysUser.getIsTemporaryPassword()==null?false:sysUser.getIsTemporaryPassword();
			
			createdBySystemUserId = sysUser.getSystemUser1()!= null?sysUser.getSystemUser1().getId():-1;
			modifiedBySystemUserId = sysUser.getSystemUser2()!= null?sysUser.getSystemUser2().getId():-1;
			
			createdDateTime = sysUser.getCreatedDateTime() + "";
			modifiedDateTime = sysUser.getModifiedDateTime() + "";
			
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

	public Long getSystemUserId() {
		return systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSystemUserTypeId() {
		return systemUserTypeId;
	}

	public void setSystemUserTypeId(String systemUserTypeId) {
		this.systemUserTypeId = systemUserTypeId;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public boolean isPasswordReset() {
		return isPasswordReset;
	}

	public void setPasswordReset(boolean isPasswordReset) {
		this.isPasswordReset = isPasswordReset;
	}

	public boolean isTemporaryPassword() {
		return isTemporaryPassword;
	}

	public void setTemporaryPassword(boolean isTemporaryPassword) {
		this.isTemporaryPassword = isTemporaryPassword;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMaaaNumber() {
		return maaaNumber;
	}

	public void setMaaaNumber(String maaaNumber) {
		this.maaaNumber = maaaNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Long getCreatedBySystemUserId() {
		return createdBySystemUserId;
	}

	public void setCreatedBySystemUserId(Long createdBySystemUserId) {
		this.createdBySystemUserId = createdBySystemUserId;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Long getModifiedBySystemUserId() {
		return modifiedBySystemUserId;
	}

	public void setModifiedBySystemUserId(Long modifiedBySystemUserId) {
		this.modifiedBySystemUserId = modifiedBySystemUserId;
	}

	public String getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(String modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

}

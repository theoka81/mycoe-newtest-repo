package com.scm.actions;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.scm.modal.DocumentBean;
import com.scm.service.common.ServiceManager;

@Controller("scmAction")
public class SCMAction extends ActionSupport
		implements ServletContextAware, ServletRequestAware, ServletResponseAware, SessionAware {

	
	protected ServletContext servletContext;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession sessionCtx;
	
	protected Long menuStatusId;
	protected Long menuConfigId;
	protected Long menuTransactionTypeId;
	protected String pageTitle;
	
	protected String hiddenChecklists;
	
	protected List<File> upload;
	protected List<String> uploadContentType;
	protected List<String> uploadFileName;
	
	protected String submitButton;
	
	@Autowired(required = true)
	@Qualifier("serviceManager")
	protected ServiceManager serviceManager;
	
	protected Logger logger = LogManager.getLogger("SCMCORE");
	
	public Map<String, Object> session;
	/**
	 * 
	 */
	private static final long serialVersionUID = 4707260393927606917L;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;		
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext= servletContext;		
	}

	public Long getMenuStatusId() {
		return menuStatusId;
	}

	public void setMenuStatusId(Long menuStatusId) {
		this.menuStatusId = menuStatusId;
	}

	public Long getMenuConfigId() {
		return menuConfigId;
	}

	public void setMenuConfigId(Long menuConfigId) {
		this.menuConfigId = menuConfigId;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public Long getMenuTransactionTypeId() {
		return menuTransactionTypeId;
	}

	public void setMenuTransactionTypeId(Long menuTransactionTypeId) {
		this.menuTransactionTypeId = menuTransactionTypeId;
	}

	public String getHiddenChecklists() {
		return hiddenChecklists;
	}

	public void setHiddenChecklists(String hiddenChecklists) {
		this.hiddenChecklists = hiddenChecklists;
	}
	public List<File> getUpload() {
		return upload;
	}

	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	public List<String> getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	public DocumentBean populateDocumentBean() {
		DocumentBean documentBean = new DocumentBean();
		documentBean.setChecklists(hiddenChecklists);
		documentBean.setFiles(upload);
		documentBean.setContentTypes(uploadContentType);
		documentBean.setFileNames(uploadFileName);
		
		return documentBean;
		
	}

	public String getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(String submitButton) {
		this.submitButton = submitButton;
	}
	
	
}

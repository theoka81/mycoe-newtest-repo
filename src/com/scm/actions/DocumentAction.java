package com.scm.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;

import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.scm.dao.domain.Document;

@Controller("documentAction")
@Scope("prototype")
public class DocumentAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6402907660493973555L;

	private Long userCodeId;
	private Long referenceId;
	private Long documentId;

	private boolean isSuccess;

	private List<Document> documentList = new ArrayList<Document>();

	@SkipValidation
	public String goGetDocument() {
		logger.debug("In goGetDocument...");
		try {
			Document d = serviceManager.getDocumentUIService().getDocumentDetails(documentId);

			// d.getContent()
			ServletOutputStream os = response.getOutputStream();
			if (d != null && d.getIsActive()) {
				response.setContentType(d.getContentType());
				response.setHeader("Content-disposition", "attachment;filename=" + d.getDocumentName());
				os.write(d.getContent());
				os.flush();
			}

		} catch (Throwable th) {
			th.printStackTrace();
		}

		return SUCCESS;
	}

	@SkipValidation
	public String goRenderDocumentDetails() {
		logger.debug("In goRenderDocumentDetails...");
		try {
			documentList = serviceManager.getDocumentUIService().renderDocumentDetails(userCodeId, referenceId);
		} catch (Throwable th) {
			th.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

	@SkipValidation
	public String goDeleteDocument() {
		logger.debug("In goDeleteDocument...");
		try {
			serviceManager.getDocumentUIService().deteleDocument(documentId,
					(Long) ActionContext.getContext().getSession().get("SESSION_USER_ID"));
		} catch (Throwable th) {
			th.printStackTrace();
		}

		return SUCCESS;
	}

	@SkipValidation
	public String goUploadAdditionalDocument() {
		logger.debug("In goUploadAdditionalDocument...");
		try {
			serviceManager.getDocumentUIService().addAdditionalDocument(referenceId, userCodeId, populateDocumentBean(),
					(Long) ActionContext.getContext().getSession().get("SESSION_USER_ID"));
		} catch (Throwable th) {
			th.printStackTrace();
		}

		return SUCCESS;
	}

	public Long getUserCodeId() {
		return userCodeId;
	}

	public void setUserCodeId(Long userCodeId) {
		this.userCodeId = userCodeId;
	}

	public Long getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public List<Document> getDocumentList() {
		return documentList;
	}

	public void setDocumentList(List<Document> documentList) {
		this.documentList = documentList;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}

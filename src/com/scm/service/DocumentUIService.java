package com.scm.service;

import java.util.List;

import com.scm.dao.domain.Document;
import com.scm.modal.DocumentBean;

public interface DocumentUIService {

	public Document getDocumentDetails(Long id) throws Throwable;

	public void deteleDocument(Long id, Long systemUserId) throws Throwable;

	public List<Document> renderDocumentDetails(Long userCodeId, Long referenceId) throws Throwable;

	public void addAdditionalDocument(Long referenceId, Long userCodeId, DocumentBean documentBean,
			Long systemUserId) throws Throwable;

}

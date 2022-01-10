package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Document;

public interface DocumentsDao  extends GenericDao<Document, Long>{

	public List<Document> getDocumentsDetails(Long supplierId) throws Throwable;
	
	public List<Document> getDocumentsDetails(Long userCodeId, Long referenceId) throws Throwable;
	
	public List<Document> getDocumentsDetails(String userCodeKey, Long referenceId) throws Throwable;
	
}

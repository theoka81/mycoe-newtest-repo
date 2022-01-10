package com.scm.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.domain.Document;
import com.scm.dao.domain.UserCode;
import com.scm.modal.DocumentBean;
import com.scm.service.DocumentUIService;
import com.scm.service.common.BaseUIservice;

@Service
public class DocumentUIServiceImpl extends BaseUIservice implements DocumentUIService {

	@Override
	@Transactional
	public Document getDocumentDetails(Long id) throws Throwable {
		return daoManager.getDocumentsDao().get(id);
	}

	@Override
	@Transactional
	public void deteleDocument(Long id, Long systemUserId) throws Throwable {
		Document d = daoManager.getDocumentsDao().get(id);
		if(d != null) {
			d.setIsDeleted(true);
			
			d.setModifiedBySystemUserId(systemUserId);
			
			Date date = new Date();
			Timestamp ts = new Timestamp(date.getTime());
			d.setModifiedDateTime(ts);
		}
	}

	@Override
	@Transactional
	public List<Document> renderDocumentDetails(Long userCodeId, Long referenceId) throws Throwable {
		String ucd = daoManager.getUserCodeDao().getUserCodeDetailsDesc(userCodeId);
		List<Document> dList = daoManager.getDocumentsDao().getDocumentsDetails(userCodeId, referenceId);
		if (dList != null && dList.size() > 0) {
			for (Document d : dList) {
				d.setUserCodeDesc(ucd);
			}
		}
		return dList;
	}

	@Override
	@Transactional
	public void addAdditionalDocument(Long referenceId, Long userCodeId, DocumentBean documentBean,
			Long systemUserId) throws Throwable {
		UserCode u = daoManager.getUserCodeDao().get(userCodeId);
		List<Document> dList = daoManager.getDocumentsDao().getDocumentsDetails(userCodeId, referenceId);
		if(dList != null)
		for(Document d: dList) {
			d.setIsActive(false);
		}
		for (int i = 0; i < documentBean.getFileNames().size(); i++) {
			Document d = new Document();
			d.setContentType(documentBean.getContentTypes().get(i));
			d.setDocumentName(documentBean.getFileNames().get(i));
			d.setContent(FileUtils.readFileToByteArray(documentBean.getFiles().get(i)));
			d.setFileSize(documentBean.getFiles().get(i).length());
			d.setCodeValue(u.getCodeValue());
			d.setUserCodeId(u.getId());
			d.setUserCodeDesc(u.getDescription());
			d.setIsActive(true);
			d.setIsDeleted(false);
			d.setReferenceId(referenceId);
			Date date = new Date();
			Timestamp ts = new Timestamp(date.getTime());
			d.setCreatedDateTime(ts);
			d.setModifiedDateTime(ts);
			d.setIsLocked(false);
			d.setCreatedBySystemUserId(systemUserId);

			d = daoManager.getDocumentsDao().save(d);
		}
	}

}

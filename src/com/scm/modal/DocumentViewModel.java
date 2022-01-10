package com.scm.modal;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scm.dao.domain.Document;
import com.scm.dao.domain.UserCode;

public class DocumentViewModel {

	private Long referenceId;
	private boolean isUploadView;
	private List<Document> documents = new ArrayList<Document>();
	private List<UserCode> documentCheckLists = new ArrayList<UserCode>();

	public Long getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

	public boolean isUploadView() {
		return isUploadView;
	}

	public void setUploadView(boolean isUploadView) {
		this.isUploadView = isUploadView;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<UserCode> getDocumentCheckLists() {
		return documentCheckLists;
	}

	public void setDocumentCheckLists(List<UserCode> documentCheckLists) {
		this.documentCheckLists = documentCheckLists;
	}
	
	public String getJsonStringDocumentCheck() {
		String jsonStr = "";
		try {
			List<DocumentCheckLists> lcDocumentCheckLists = new ArrayList<DocumentCheckLists>();
			DocumentCheckLists dc = null;
			for(UserCode uc: documentCheckLists) {
				dc = new DocumentCheckLists();
				dc.setId(uc.getId());
				dc.setDataList(this.referenceId+"");
				
				lcDocumentCheckLists.add(dc);
			}
			
			ObjectMapper ob = new ObjectMapper();
			jsonStr = ob.writeValueAsString(lcDocumentCheckLists);
			
		} catch(Throwable th) {
			th.printStackTrace();
		}
		return jsonStr;
	}
	
	public String getJsonStringDocumentCheckLists() {
		String jsonStr = "";
		try {
			List<DocumentCheckLists> lcDocumentCheckLists = new ArrayList<DocumentCheckLists>();
			DocumentCheckLists dc = null;
			for(UserCode uc: documentCheckLists) {
				dc = new DocumentCheckLists();
				dc.setId(uc.getId());
				dc.setDataList("referenceId="+uc.getId()+"&documentChecklistId="+this.referenceId);
				
				lcDocumentCheckLists.add(dc);
			}
			
			ObjectMapper ob = new ObjectMapper();
			jsonStr = ob.writeValueAsString(lcDocumentCheckLists);
			
		} catch(Throwable th) {
			th.printStackTrace();
		}
		return jsonStr;
	}

}

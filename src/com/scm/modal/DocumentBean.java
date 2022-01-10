package com.scm.modal;

import java.io.File;
import java.util.List;

public class DocumentBean {

	private String checklists;

	private List<File> files;
	private List<String> contentTypes;
	private List<String> fileNames;

	public String getChecklists() {
		return checklists;
	}

	public void setChecklists(String checklists) {
		this.checklists = checklists;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public List<String> getContentTypes() {
		return contentTypes;
	}

	public void setContentTypes(List<String> contentTypes) {
		this.contentTypes = contentTypes;
	}

	public List<String> getFileNames() {
		return fileNames;
	}

	public void setFileNames(List<String> fileNames) {
		this.fileNames = fileNames;
	}

}

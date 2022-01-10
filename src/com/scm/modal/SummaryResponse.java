package com.scm.modal;

import java.util.List;

public class SummaryResponse<T> {

	private ErrorStatus errorStatus;
	private int totalRecords;
	private List<T> entities;

	public ErrorStatus getErrorStatus() {
		return errorStatus;
	}

	public void setErrorStatus(ErrorStatus errorStatus) {
		this.errorStatus = errorStatus;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public List<T> getEntities() {
		return entities;
	}

	public void setEntities(List<T> entities) {
		this.entities = entities;
	}

}

package com.scm.modal;

public class TendersBean {

	private Long id;
	private String tenderDescription;
	private String tenderClosingDate;
	private String bidClosingDate;
	private String tenderType;
	private String tenderStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenderDescription() {
		return tenderDescription;
	}

	public void setTenderDescription(String tenderDescription) {
		this.tenderDescription = tenderDescription;
	}

	public String getTenderClosingDate() {
		return tenderClosingDate;
	}

	public void setTenderClosingDate(String tenderClosingDate) {
		this.tenderClosingDate = tenderClosingDate;
	}

	public String getBidClosingDate() {
		return bidClosingDate;
	}

	public void setBidClosingDate(String bidClosingDate) {
		this.bidClosingDate = bidClosingDate;
	}

	public String getTenderType() {
		return tenderType;
	}

	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}

	public String getTenderStatus() {
		return tenderStatus;
	}

	public void setTenderStatus(String tenderStatus) {
		this.tenderStatus = tenderStatus;
	}

}

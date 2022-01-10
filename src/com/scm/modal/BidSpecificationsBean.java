package com.scm.modal;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class BidSpecificationsBean {

	private Long tenderId;
	private Long tenderBidInvitationsId;

	private String tenderDescription;
	private Timestamp tenderClosingDate;
	private Timestamp bidClosingDate;
	private BigInteger estimatedBudget;
	public Long getTenderId() {
		return tenderId;
	}
	public void setTenderId(Long tenderId) {
		this.tenderId = tenderId;
	}
	public Long getTenderBidInvitationsId() {
		return tenderBidInvitationsId;
	}
	public void setTenderBidInvitationsId(Long tenderBidInvitationsId) {
		this.tenderBidInvitationsId = tenderBidInvitationsId;
	}
	public String getTenderDescription() {
		return tenderDescription;
	}
	public void setTenderDescription(String tenderDescription) {
		this.tenderDescription = tenderDescription;
	}
	public Timestamp getTenderClosingDate() {
		return tenderClosingDate;
	}
	public void setTenderClosingDate(Timestamp tenderClosingDate) {
		this.tenderClosingDate = tenderClosingDate;
	}
	public Timestamp getBidClosingDate() {
		return bidClosingDate;
	}
	public void setBidClosingDate(Timestamp bidClosingDate) {
		this.bidClosingDate = bidClosingDate;
	}
	public BigInteger getEstimatedBudget() {
		return estimatedBudget;
	}
	public void setEstimatedBudget(BigInteger estimatedBudget) {
		this.estimatedBudget = estimatedBudget;
	}
	
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public String getFormattedTenderClosingDate() {
		return tenderClosingDate!=null?df.format(tenderClosingDate):"";
	}

	public String getFormattedBidClosingDate() {
		return tenderClosingDate!=null?df.format(bidClosingDate):"";
	}
}

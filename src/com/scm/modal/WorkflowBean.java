package com.scm.modal;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class WorkflowBean {

	private Long id;
	private String stepNo;
	private String approvalTemplateDescription;
	private String workflowDescription;
	private String workflowDateStarted;
	private String workflowDateEnded;
	private String taskDateStarted;
	private String taskDateEnded;
	private String status;
	private String fullname;
	private String approvedMessage;
	private String modifiedDate;
	private String approvedBy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStepNo() {
		return stepNo;
	}
	public void setStepNo(String stepNo) {
		this.stepNo = stepNo;
	}
	public String getApprovalTemplateDescription() {
		return approvalTemplateDescription;
	}
	public void setApprovalTemplateDescription(String approvalTemplateDescription) {
		this.approvalTemplateDescription = approvalTemplateDescription;
	}
	public String getWorkflowDescription() {
		return workflowDescription;
	}
	public void setWorkflowDescription(String workflowDescription) {
		this.workflowDescription = workflowDescription;
	}
	public String getWorkflowDateStarted() {
		return workflowDateStarted;
	}
	public void setWorkflowDateStarted(String workflowDateStarted) {
		this.workflowDateStarted = workflowDateStarted;
	}
	public String getWorkflowDateEnded() {
		return workflowDateEnded;
	}
	public void setWorkflowDateEnded(String workflowDateEnded) {
		this.workflowDateEnded = workflowDateEnded;
	}
	public String getTaskDateStarted() {
		return taskDateStarted;
	}
	public void setTaskDateStarted(String taskDateStarted) {
		this.taskDateStarted = taskDateStarted;
	}
	public String getTaskDateEnded() {
		return taskDateEnded;
	}
	public void setTaskDateEnded(String taskDateEnded) {
		this.taskDateEnded = taskDateEnded;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getApprovedMessage() {
		return approvedMessage;
	}
	public void setApprovedMessage(String approvedMessage) {
		this.approvedMessage = approvedMessage;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	
}

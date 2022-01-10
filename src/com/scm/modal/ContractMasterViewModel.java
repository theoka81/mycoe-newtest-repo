package com.scm.modal;

import java.util.List;

import org.hibernate.sql.ast.Clause;

import com.scm.dao.domain.ClauseMapping;
import com.scm.dao.domain.ContractDetail;
import com.scm.dao.domain.ContractDetailsWork;
import com.scm.dao.domain.ContractMaster;
import com.scm.dao.domain.ContractMasterWork;
import com.scm.dao.domain.IPW;
import com.scm.dao.domain.SROe;

public class ContractMasterViewModel {

	private ContractMaster contractMaster;
	private ContractDetail contractDetails;
	private ContractMasterWork contractMasterWork;
	private ContractDetailsWork contractDetailsWork;
	private String workFlowStatus;
	private List<Clause> clauses;
	private List<ClauseMapping> contractClauses;
	private boolean isLocked;
	private DocumentViewModel documentViewModel;
	private List<ContractDetail> contractDetailsList;
	private String contractClausesString;
	private List<SROe> serviceRequestOrders;
	private SROe serviceRequestOrder;
	private IPW instructionsToPerformWork;
	
	private String message = "";

	public ContractMaster getContractMaster() {
		return contractMaster;
	}

	public void setContractMaster(ContractMaster contractMaster) {
		this.contractMaster = contractMaster;
	}

	public ContractDetail getContractDetails() {
		return contractDetails;
	}

	public void setContractDetails(ContractDetail contractDetails) {
		this.contractDetails = contractDetails;
	}

	public ContractMasterWork getContractMasterWork() {
		return contractMasterWork;
	}

	public void setContractMasterWork(ContractMasterWork contractMasterWork) {
		this.contractMasterWork = contractMasterWork;
	}

	public ContractDetailsWork getContractDetailsWork() {
		return contractDetailsWork;
	}

	public void setContractDetailsWork(ContractDetailsWork contractDetailsWork) {
		this.contractDetailsWork = contractDetailsWork;
	}

	public String getWorkFlowStatus() {
		return workFlowStatus;
	}

	public void setWorkFlowStatus(String workFlowStatus) {
		this.workFlowStatus = workFlowStatus;
	}

	public List<Clause> getClauses() {
		return clauses;
	}

	public void setClauses(List<Clause> clauses) {
		this.clauses = clauses;
	}

	public List<ClauseMapping> getContractClauses() {
		return contractClauses;
	}

	public void setContractClauses(List<ClauseMapping> contractClauses) {
		this.contractClauses = contractClauses;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public DocumentViewModel getDocumentViewModel() {
		return documentViewModel;
	}

	public void setDocumentViewModel(DocumentViewModel documentViewModel) {
		this.documentViewModel = documentViewModel;
	}

	public List<ContractDetail> getContractDetailsList() {
		return contractDetailsList;
	}

	public void setContractDetailsList(List<ContractDetail> contractDetailsList) {
		this.contractDetailsList = contractDetailsList;
	}

	public String getContractClausesString() {
		return contractClausesString;
	}

	public void setContractClausesString(String contractClausesString) {
		this.contractClausesString = contractClausesString;
	}

	public List<SROe> getServiceRequestOrders() {
		return serviceRequestOrders;
	}

	public void setServiceRequestOrders(List<SROe> serviceRequestOrders) {
		this.serviceRequestOrders = serviceRequestOrders;
	}

	public SROe getServiceRequestOrder() {
		return serviceRequestOrder;
	}

	public void setServiceRequestOrder(SROe serviceRequestOrder) {
		this.serviceRequestOrder = serviceRequestOrder;
	}

	public IPW getInstructionsToPerformWork() {
		return instructionsToPerformWork;
	}

	public void setInstructionsToPerformWork(IPW instructionsToPerformWork) {
		this.instructionsToPerformWork = instructionsToPerformWork;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

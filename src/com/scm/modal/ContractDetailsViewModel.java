package com.scm.modal;

import java.util.ArrayList;
import java.util.List;

import com.scm.dao.domain.Clause;
import com.scm.dao.domain.ClauseMapping;
import com.scm.dao.domain.ContractClause;
import com.scm.dao.domain.ContractDetail;
import com.scm.dao.domain.ContractDetailsWork;
import com.scm.dao.domain.Signatory;

public class ContractDetailsViewModel {

	public List<Clause> clauses = new ArrayList<Clause>();
	public List<ClauseMapping> contractClauses = new ArrayList<ClauseMapping>();
	public List<ContractClause> contractClausess = new ArrayList<ContractClause>();

	public ContractDetail contractDetails;
	public ContractDetailsWork contractDetailsWork;

	public Signatory signatory;

	public DocumentViewModel documentViewModel;
	
	private String message = "";

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

	public List<ContractClause> getContractClausess() {
		return contractClausess;
	}

	public void setContractClausess(List<ContractClause> contractClausess) {
		this.contractClausess = contractClausess;
	}

	public ContractDetail getContractDetails() {
		return contractDetails;
	}

	public void setContractDetails(ContractDetail contractDetails) {
		this.contractDetails = contractDetails;
	}

	public ContractDetailsWork getContractDetailsWork() {
		return contractDetailsWork;
	}

	public void setContractDetailsWork(ContractDetailsWork contractDetailsWork) {
		this.contractDetailsWork = contractDetailsWork;
	}

	public Signatory getSignatory() {
		return signatory;
	}

	public void setSignatory(Signatory signatory) {
		this.signatory = signatory;
	}

	public DocumentViewModel getDocumentViewModel() {
		return documentViewModel;
	}

	public void setDocumentViewModel(DocumentViewModel documentViewModel) {
		this.documentViewModel = documentViewModel;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

package com.scm.service.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.service.ContractUIService;
import com.scm.service.DocumentUIService;
import com.scm.service.EmailService;
import com.scm.service.InventoryUIService;
import com.scm.service.RequisitionDetailsEngineService;
import com.scm.service.StandardAgreementUIService;
import com.scm.service.SupplierMasterUIService;
import com.scm.service.SupplierUIService;
import com.scm.service.TendersUIService;
import com.scm.service.UserUIService;
import com.scm.service.WarehouseUIService;
import com.scm.service.WorkFlowEngineService;
import com.scm.service.WorkflowUIService;
import com.scm.ws.CsdApiService;

@Service("serviceManager")
public class ServiceManager {

	@Autowired(required = true)
	private SupplierMasterUIService supplierMasterUIService;
	
	@Autowired(required = true)
	private UserUIService userUIService;
	
	@Autowired(required = true)
	private SupplierUIService supplierUIService;
	
	@Autowired(required = true)
	private EmailService emailService;
	
	@Autowired(required = true)
	private InventoryUIService inventoryUIService;
	
	@Autowired(required = true)
	private WarehouseUIService warehouseUIService;
	
	@Autowired(required = true)
	private ContractUIService contractUIService;
	
	@Autowired(required = true)
	private WorkflowUIService workflowUIService;
	
	@Autowired(required = true)
	private CsdApiService csdApiService;
	
	@Autowired(required = true)
	private TendersUIService tendersUIService;

    @Autowired(required = true)
	private StandardAgreementUIService standardAgreementUIService;
    
    @Autowired(required = true)
    private DocumentUIService documentUIService;
    
    @Autowired(required = true)
    private RequisitionDetailsEngineService requisitionDetailsEngineService;
    
    @Autowired(required = true)
    private WorkFlowEngineService workFlowEngineService;

	public SupplierMasterUIService getSupplierMasterUIService() {
		return supplierMasterUIService;
	}

	public void setSupplierMasterUIService(SupplierMasterUIService supplierMasterUIService) {
		this.supplierMasterUIService = supplierMasterUIService;
	}

	public InventoryUIService getInventoryUIService() {
		return inventoryUIService;
	}

	public void setInventoryUIService(InventoryUIService inventoryUIService) {
		this.inventoryUIService = inventoryUIService;
	}

	public UserUIService getUserUIService() {
		return userUIService;
	}

	public void setUserUIService(UserUIService userUIService) {
		this.userUIService = userUIService;
	}

	public SupplierUIService getSupplierUIService() {
		return supplierUIService;
	}

	public void setSupplierUIService(SupplierUIService supplierUIService) {
		this.supplierUIService = supplierUIService;
	}

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public WarehouseUIService getWarehouseUIService() {
		return warehouseUIService;
	}

	public void setWarehouseUIService(WarehouseUIService warehouseUIService) {
		this.warehouseUIService = warehouseUIService;
	}

	
	public void setContractUIService(ContractUIService contractUIService) {
		this.contractUIService = contractUIService;
	}

	public ContractUIService getContractUIService() {
		return contractUIService;
	}

	public WorkflowUIService getWorkflowUIService() {
		return workflowUIService;
	}

	public void setWorkflowUIService(WorkflowUIService workflowUIService) {
		this.workflowUIService = workflowUIService;
	}

	public CsdApiService getCsdApiService() {
		return csdApiService;
	}

	public void setCsdApiService(CsdApiService csdApiService) {
		this.csdApiService = csdApiService;
	}

	public TendersUIService getTendersUIService() {
		return tendersUIService;
	}

	public void setTendersUIService(TendersUIService tendersUIService) {
		this.tendersUIService = tendersUIService;
	}  
	public StandardAgreementUIService getStandardAgreementUIService() {
		return standardAgreementUIService;
	}

	public void setStandardAgreementUIService(StandardAgreementUIService standardAgreementUIService) {
		this.standardAgreementUIService = standardAgreementUIService;
	}

	public DocumentUIService getDocumentUIService() {
		return documentUIService;
	}

	public void setDocumentUIService(DocumentUIService documentUIService) {
		this.documentUIService = documentUIService;
	}

	public RequisitionDetailsEngineService getRequisitionDetailsEngineService() {
		return requisitionDetailsEngineService;
	}

	public void setRequisitionDetailsEngineService(RequisitionDetailsEngineService requisitionDetailsEngineService) {
		this.requisitionDetailsEngineService = requisitionDetailsEngineService;
	}

	public WorkFlowEngineService getWorkFlowEngineService() {
		return workFlowEngineService;
	}

	public void setWorkFlowEngineService(WorkFlowEngineService workFlowEngineService) {
		this.workFlowEngineService = workFlowEngineService;
	}
	
}

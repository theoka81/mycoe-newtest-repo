package com.scm.modal;

import com.scm.dao.domain.InventoryCode;
import com.scm.dao.domain.InventoryDefinition;
import com.scm.dao.domain.InventoryDefinitionWork;
import com.scm.dao.domain.InventoryPricing;
import com.scm.dao.domain.InventorySpecification;
import com.scm.dao.domain.InventoryCodesWork;
import com.scm.dao.domain.InventoryWarehouseDefault;
import com.scm.dao.domain.UomConversion;

public class InventoryViewModel {

	InventoryDefinition inventoryDefinition;
	InventoryCode inventoryCode;
	InventoryDefinitionWork inventoryDefinitionWork;
	InventoryCodesWork inventoryCodesWork;
	InventorySpecification inventorySpecification;
	InventoryPricing inventoryPricing;
	InventoryWarehouseDefault inventoryWarehouseDefault;
	UomConversion uomConversion;
	DocumentViewModel documentViewModel = new DocumentViewModel();

	public InventoryDefinition getInventoryDefinition() {
		return inventoryDefinition;
	}

	public void setInventoryDefinition(InventoryDefinition inventoryDefinition) {
		this.inventoryDefinition = inventoryDefinition;
	}

	public InventoryCode getInventoryCode() {
		return inventoryCode;
	}

	public void setInventoryCode(InventoryCode inventoryCode) {
		this.inventoryCode = inventoryCode;
	}

	public InventoryDefinitionWork getInventoryDefinitionWork() {
		return inventoryDefinitionWork;
	}

	public void setInventoryDefinitionWork(InventoryDefinitionWork inventoryDefinitionWork) {
		this.inventoryDefinitionWork = inventoryDefinitionWork;
	}

	public InventoryCodesWork getInventoryCodesWork() {
		return inventoryCodesWork;
	}

	public void setInventoryCodesWork(InventoryCodesWork inventoryCodesWork) {
		this.inventoryCodesWork = inventoryCodesWork;
	}

	public InventorySpecification getInventorySpecification() {
		return inventorySpecification;
	}

	public void setInventorySpecification(InventorySpecification inventorySpecification) {
		this.inventorySpecification = inventorySpecification;
	}

	public InventoryPricing getInventoryPricing() {
		return inventoryPricing;
	}

	public void setInventoryPricing(InventoryPricing inventoryPricing) {
		this.inventoryPricing = inventoryPricing;
	}

	public InventoryWarehouseDefault getInventoryWarehouseDefault() {
		return inventoryWarehouseDefault;
	}

	public void setInventoryWarehouseDefault(InventoryWarehouseDefault inventoryWarehouseDefault) {
		this.inventoryWarehouseDefault = inventoryWarehouseDefault;
	}

	public UomConversion getUomConversion() {
		return uomConversion;
	}

	public void setUomConversion(UomConversion uomConversion) {
		this.uomConversion = uomConversion;
	}

	public DocumentViewModel getDocumentViewModel() {
		return documentViewModel;
	}

	public void setDocumentViewModel(DocumentViewModel documentViewModel) {
		this.documentViewModel = documentViewModel;
	}

}

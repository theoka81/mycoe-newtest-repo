package com.scm.modal;

import java.util.ArrayList;
import java.util.List;

import com.scm.dao.domain.Accreditation;
import com.scm.dao.domain.AccreditationBody;
import com.scm.dao.domain.Address;
import com.scm.dao.domain.Association;
import com.scm.dao.domain.BankAccount;
import com.scm.dao.domain.Bbbee;
import com.scm.dao.domain.CededSupplier;
import com.scm.dao.domain.CommodityGroup;
import com.scm.dao.domain.CommodityItem;
import com.scm.dao.domain.CommodityLocation;
import com.scm.dao.domain.CommodityProvince;
import com.scm.dao.domain.Contact;
import com.scm.dao.domain.ContactTypeList;
import com.scm.dao.domain.Director;
import com.scm.dao.domain.DirectorFlag;
import com.scm.dao.domain.FundingContact;
import com.scm.dao.domain.OwnershipNonNatural;
import com.scm.dao.domain.Supplier;
import com.scm.dao.domain.SupplierCode;
import com.scm.dao.domain.SupplierCodesWork;
import com.scm.dao.domain.SupplierContact;
import com.scm.dao.domain.SupplierFlag;
import com.scm.dao.domain.SupplierFlagDetail;
import com.scm.dao.domain.SupplierIndustryClassification;
import com.scm.dao.domain.SupplierMaster;
import com.scm.dao.domain.SupplierMasterWork;
import com.scm.dao.domain.Taxes;
import com.scm.dao.domain.UserCode;

public class SupplierViewModel {

	Supplier supplier = new Supplier();
	SupplierMaster supplierMaster = new SupplierMaster();
	SupplierCode supplierCodes = new SupplierCode();
	UserCode takeOn = new UserCode();
	List<Address> addresses = new ArrayList<Address>();
	List<Accreditation> accreditations = new ArrayList<Accreditation>();
	List<Association> associations = new ArrayList<Association>();
	List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
	Bbbee bbbee = new Bbbee();
	List<Contact> contact = new ArrayList<Contact>();
	List<Director> directors = new ArrayList<Director>();
	List<SupplierIndustryClassification> supplierIndustryClassifications = new ArrayList<SupplierIndustryClassification>();
	List<Taxes> taxes = new ArrayList<Taxes>();
	List<SupplierFlag> supplierFlags = new ArrayList<SupplierFlag>();
	List<SupplierFlagDetail> supplierFlagDetails = new ArrayList<SupplierFlagDetail>();
	List<AccreditationBody> accreditationBodies = new ArrayList<AccreditationBody>();
	List<CommodityGroup> commodityGroups = new ArrayList<CommodityGroup>();
	List<CommodityItem> commodityItems = new ArrayList<CommodityItem>();
	List<CommodityLocation> commodityLocations = new ArrayList<CommodityLocation>();
	List<CommodityProvince> commodityProvinces = new ArrayList<CommodityProvince>();
	List<ContactTypeList> contactTypeList = new ArrayList<ContactTypeList>();
	List<DirectorFlag> directorFlags = new ArrayList<DirectorFlag>();
	List<FundingContact> fundingContacts = new ArrayList<FundingContact>();
	List<OwnershipNonNatural> OwnershipNonNatural = new ArrayList<OwnershipNonNatural>();
	DocumentViewModel documentViewModel = new DocumentViewModel();
	CededSupplier cededSupplier = new CededSupplier();
	SupplierContact supplierContact = new SupplierContact();
	String message = "";
	boolean successfulRegistration = false;
	boolean isPending = false;
	
	SupplierMasterWork supplierMasterWork = new SupplierMasterWork();
	
	SupplierCodesWork supplierCodesWork = new SupplierCodesWork();

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public SupplierMaster getSupplierMaster() {
		return supplierMaster;
	}

	public void setSupplierMaster(SupplierMaster supplierMaster) {
		this.supplierMaster = supplierMaster;
	}

	public SupplierCode getSupplierCodes() {
		return supplierCodes;
	}

	public void setSupplierCodes(SupplierCode supplierCodes) {
		this.supplierCodes = supplierCodes;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Accreditation> getAccreditations() {
		return accreditations;
	}

	public void setAccreditations(List<Accreditation> accreditations) {
		this.accreditations = accreditations;
	}

	public List<Association> getAssociations() {
		return associations;
	}

	public void setAssociations(List<Association> associations) {
		this.associations = associations;
	}

	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public Bbbee getBbbee() {
		return bbbee;
	}

	public void setBbbee(Bbbee bbbee) {
		this.bbbee = bbbee;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	public List<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}

	public List<SupplierIndustryClassification> getSupplierIndustryClassifications() {
		return supplierIndustryClassifications;
	}

	public void setSupplierIndustryClassifications(
			List<SupplierIndustryClassification> supplierIndustryClassifications) {
		this.supplierIndustryClassifications = supplierIndustryClassifications;
	}

	public List<Taxes> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<Taxes> taxes) {
		this.taxes = taxes;
	}

	public List<SupplierFlag> getSupplierFlags() {
		return supplierFlags;
	}

	public void setSupplierFlags(List<SupplierFlag> supplierFlags) {
		this.supplierFlags = supplierFlags;
	}

	public List<SupplierFlagDetail> getSupplierFlagDetails() {
		return supplierFlagDetails;
	}

	public void setSupplierFlagDetails(List<SupplierFlagDetail> supplierFlagDetails) {
		this.supplierFlagDetails = supplierFlagDetails;
	}

	public List<AccreditationBody> getAccreditationBodies() {
		return accreditationBodies;
	}

	public void setAccreditationBodies(List<AccreditationBody> accreditationBodies) {
		this.accreditationBodies = accreditationBodies;
	}

	public List<CommodityGroup> getCommodityGroups() {
		return commodityGroups;
	}

	public void setCommodityGroups(List<CommodityGroup> commodityGroups) {
		this.commodityGroups = commodityGroups;
	}

	public List<CommodityItem> getCommodityItems() {
		return commodityItems;
	}

	public void setCommodityItems(List<CommodityItem> commodityItems) {
		this.commodityItems = commodityItems;
	}

	public List<CommodityLocation> getCommodityLocations() {
		return commodityLocations;
	}

	public void setCommodityLocations(List<CommodityLocation> commodityLocations) {
		this.commodityLocations = commodityLocations;
	}

	public List<CommodityProvince> getCommodityProvinces() {
		return commodityProvinces;
	}

	public void setCommodityProvinces(List<CommodityProvince> commodityProvinces) {
		this.commodityProvinces = commodityProvinces;
	}

	public List<ContactTypeList> getContactTypeList() {
		return contactTypeList;
	}

	public void setContactTypeList(List<ContactTypeList> contactTypeList) {
		this.contactTypeList = contactTypeList;
	}

	public List<DirectorFlag> getDirectorFlags() {
		return directorFlags;
	}

	public void setDirectorFlags(List<DirectorFlag> directorFlags) {
		this.directorFlags = directorFlags;
	}

	public List<FundingContact> getFundingContacts() {
		return fundingContacts;
	}

	public void setFundingContacts(List<FundingContact> fundingContacts) {
		this.fundingContacts = fundingContacts;
	}

	public List<OwnershipNonNatural> getOwnershipNonNatural() {
		return OwnershipNonNatural;
	}

	public void setOwnershipNonNatural(List<OwnershipNonNatural> ownershipNonNatural) {
		OwnershipNonNatural = ownershipNonNatural;
	}

	public DocumentViewModel getDocumentViewModel() {
		return documentViewModel;
	}

	public void setDocumentViewModel(DocumentViewModel documentViewModel) {
		this.documentViewModel = documentViewModel;
	}

	public SupplierContact getSupplierContact() {
		return supplierContact;
	}

	public void setSupplierContact(SupplierContact supplierContact) {
		this.supplierContact = supplierContact;
	}

	public SupplierMasterWork getSupplierMasterWork() {
		return supplierMasterWork;
	}

	public void setSupplierMasterWork(SupplierMasterWork supplierMasterWork) {
		this.supplierMasterWork = supplierMasterWork;
	}

	public SupplierCodesWork getSupplierCodesWork() {
		return supplierCodesWork;
	}

	public void setSupplierCodesWork(SupplierCodesWork supplierCodesWork) {
		this.supplierCodesWork = supplierCodesWork;
	}

	public CededSupplier getCededSupplier() {
		return cededSupplier;
	}

	public void setCededSupplier(CededSupplier cededSupplier) {
		this.cededSupplier = cededSupplier;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccessfulRegistration() {
		return successfulRegistration;
	}

	public void setSuccessfulRegistration(boolean successfulRegistration) {
		this.successfulRegistration = successfulRegistration;
	}

	public UserCode getTakeOn() {
		return takeOn;
	}

	public void setTakeOn(UserCode takeOn) {
		this.takeOn = takeOn;
	}

	public boolean isPending() {
		return isPending;
	}

	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}

}

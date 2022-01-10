
package com.scm.ws.impl.data;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IsPreferred",
    "BankAccountID",
    "AccountHolder",
    "BankAccountStatusCode",
    "BankAccountStatusName",
    "BankAccountTypeCode",
    "BankAccountTypeName",
    "IsForeignBankAccount",
    "BankName",
    "BankCode",
    "BranchName",
    "BranchNumber",
    "AccountNumber",
    "CountryCode",
    "CountryName",
    "AddressLine1",
    "AddressLine2",
    "ZipCode",
    "CreatedDate",
    "EditDate"
})
@Generated("jsonschema2pojo")
public class BankAccount {

    @JsonProperty("IsPreferred")
    private Boolean isPreferred;
    @JsonProperty("BankAccountID")
    private Integer bankAccountID;
    @JsonProperty("AccountHolder")
    private String accountHolder;
    @JsonProperty("BankAccountStatusCode")
    private String bankAccountStatusCode;
    @JsonProperty("BankAccountStatusName")
    private String bankAccountStatusName;
    @JsonProperty("BankAccountTypeCode")
    private String bankAccountTypeCode;
    @JsonProperty("BankAccountTypeName")
    private String bankAccountTypeName;
    @JsonProperty("IsForeignBankAccount")
    private Object isForeignBankAccount;
    @JsonProperty("BankName")
    private String bankName;
    @JsonProperty("BankCode")
    private String bankCode;
    @JsonProperty("BranchName")
    private String branchName;
    @JsonProperty("BranchNumber")
    private String branchNumber;
    @JsonProperty("AccountNumber")
    private String accountNumber;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("CountryName")
    private String countryName;
    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("AddressLine2")
    private String addressLine2;
    @JsonProperty("ZipCode")
    private String zipCode;
   
    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp createdDate;
    
    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp editDate;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("IsPreferred")
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    @JsonProperty("IsPreferred")
    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    @JsonProperty("BankAccountID")
    public Integer getBankAccountID() {
        return bankAccountID;
    }

    @JsonProperty("BankAccountID")
    public void setBankAccountID(Integer bankAccountID) {
        this.bankAccountID = bankAccountID;
    }

    @JsonProperty("AccountHolder")
    public String getAccountHolder() {
        return accountHolder;
    }

    @JsonProperty("AccountHolder")
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @JsonProperty("BankAccountStatusCode")
    public String getBankAccountStatusCode() {
        return bankAccountStatusCode;
    }

    @JsonProperty("BankAccountStatusCode")
    public void setBankAccountStatusCode(String bankAccountStatusCode) {
        this.bankAccountStatusCode = bankAccountStatusCode;
    }

    @JsonProperty("BankAccountStatusName")
    public String getBankAccountStatusName() {
        return bankAccountStatusName;
    }

    @JsonProperty("BankAccountStatusName")
    public void setBankAccountStatusName(String bankAccountStatusName) {
        this.bankAccountStatusName = bankAccountStatusName;
    }

    @JsonProperty("BankAccountTypeCode")
    public String getBankAccountTypeCode() {
        return bankAccountTypeCode;
    }

    @JsonProperty("BankAccountTypeCode")
    public void setBankAccountTypeCode(String bankAccountTypeCode) {
        this.bankAccountTypeCode = bankAccountTypeCode;
    }

    @JsonProperty("BankAccountTypeName")
    public String getBankAccountTypeName() {
        return bankAccountTypeName;
    }

    @JsonProperty("BankAccountTypeName")
    public void setBankAccountTypeName(String bankAccountTypeName) {
        this.bankAccountTypeName = bankAccountTypeName;
    }

    @JsonProperty("IsForeignBankAccount")
    public Object getIsForeignBankAccount() {
        return isForeignBankAccount;
    }

    @JsonProperty("IsForeignBankAccount")
    public void setIsForeignBankAccount(Object isForeignBankAccount) {
        this.isForeignBankAccount = isForeignBankAccount;
    }

    @JsonProperty("BankName")
    public String getBankName() {
        return bankName;
    }

    @JsonProperty("BankName")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @JsonProperty("BankCode")
    public String getBankCode() {
        return bankCode;
    }

    @JsonProperty("BankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    @JsonProperty("BranchName")
    public String getBranchName() {
        return branchName;
    }

    @JsonProperty("BranchName")
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @JsonProperty("BranchNumber")
    public String getBranchNumber() {
        return branchNumber;
    }

    @JsonProperty("BranchNumber")
    public void setBranchNumber(String branchNumber) {
        this.branchNumber = branchNumber;
    }

    @JsonProperty("AccountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("CountryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("CountryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("AddressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("AddressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("AddressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("AddressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("ZipCode")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("ZipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getEditDate() {
        return editDate;
    }

    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setEditDate(Timestamp editDate) {
        this.editDate = editDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

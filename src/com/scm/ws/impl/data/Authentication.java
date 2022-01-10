package com.scm.ws.impl.data;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Token", "TokenCreatedDateTime", "TokenExpireDateTime", "LockoutEnabled", "IsSuspended",
		"IsAccountActive", "IsAccountVerified", "IsPasswordExpired", "SuspendedUntil", "IsTermsAndConditionsAccepted",
		"isFraudMessagesAccepted", "FraudMsgAcceptedDate", "isPhishingMessageAccepted", "PhishingMsgAcceptedDate",
		"IsProcessRegAccepted", "isOTPAccepted", "isOosUser", "SelectedOTPoption", "requireOosLoginOTP" })
@Generated("jsonschema2pojo")
public class Authentication {

	@JsonProperty("Token")
	private String token;
	@JsonProperty("TokenCreatedDateTime")
	private String tokenCreatedDateTime;
	@JsonProperty("TokenExpireDateTime")
	private String tokenExpireDateTime;
	@JsonProperty("LockoutEnabled")
	private Boolean lockoutEnabled;
	@JsonProperty("IsSuspended")
	private Boolean isSuspended;
	@JsonProperty("IsAccountActive")
	private Boolean isAccountActive;
	@JsonProperty("IsAccountVerified")
	private Boolean isAccountVerified;
	@JsonProperty("IsPasswordExpired")
	private Boolean isPasswordExpired;
	@JsonProperty("SuspendedUntil")
	private String suspendedUntil;
	@JsonProperty("IsTermsAndConditionsAccepted")
	private Boolean isTermsAndConditionsAccepted;
	@JsonProperty("isFraudMessagesAccepted")
	private Boolean isFraudMessagesAccepted;
	@JsonProperty("FraudMsgAcceptedDate")
	private String fraudMsgAcceptedDate;
	@JsonProperty("isPhishingMessageAccepted")
	private Boolean isPhishingMessageAccepted;
	@JsonProperty("PhishingMsgAcceptedDate")
	private String phishingMsgAcceptedDate;
	@JsonProperty("IsProcessRegAccepted")
	private Boolean isProcessRegAccepted;
	@JsonProperty("isOTPAccepted")
	private Boolean isOTPAccepted;
	@JsonProperty("isOosUser")
	private Boolean isOosUser;
	@JsonProperty("SelectedOTPoption")
	private Object selectedOTPoption;
	@JsonProperty("requireOosLoginOTP")
	private Boolean requireOosLoginOTP;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Token")
	public String getToken() {
		return token;
	}

	@JsonProperty("Token")
	public void setToken(String token) {
		this.token = token;
	}

	@JsonProperty("TokenCreatedDateTime")
	public String getTokenCreatedDateTime() {
		return tokenCreatedDateTime;
	}

	@JsonProperty("TokenCreatedDateTime")
	public void setTokenCreatedDateTime(String tokenCreatedDateTime) {
		this.tokenCreatedDateTime = tokenCreatedDateTime;
	}

	@JsonProperty("TokenExpireDateTime")
	public String getTokenExpireDateTime() {
		return tokenExpireDateTime;
	}

	@JsonProperty("TokenExpireDateTime")
	public void setTokenExpireDateTime(String tokenExpireDateTime) {
		this.tokenExpireDateTime = tokenExpireDateTime;
	}

	@JsonProperty("LockoutEnabled")
	public Boolean getLockoutEnabled() {
		return lockoutEnabled;
	}

	@JsonProperty("LockoutEnabled")
	public void setLockoutEnabled(Boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	@JsonProperty("IsSuspended")
	public Boolean getIsSuspended() {
		return isSuspended;
	}

	@JsonProperty("IsSuspended")
	public void setIsSuspended(Boolean isSuspended) {
		this.isSuspended = isSuspended;
	}

	@JsonProperty("IsAccountActive")
	public Boolean getIsAccountActive() {
		return isAccountActive;
	}

	@JsonProperty("IsAccountActive")
	public void setIsAccountActive(Boolean isAccountActive) {
		this.isAccountActive = isAccountActive;
	}

	@JsonProperty("IsAccountVerified")
	public Boolean getIsAccountVerified() {
		return isAccountVerified;
	}

	@JsonProperty("IsAccountVerified")
	public void setIsAccountVerified(Boolean isAccountVerified) {
		this.isAccountVerified = isAccountVerified;
	}

	@JsonProperty("IsPasswordExpired")
	public Boolean getIsPasswordExpired() {
		return isPasswordExpired;
	}

	@JsonProperty("IsPasswordExpired")
	public void setIsPasswordExpired(Boolean isPasswordExpired) {
		this.isPasswordExpired = isPasswordExpired;
	}

	@JsonProperty("SuspendedUntil")
	public String getSuspendedUntil() {
		return suspendedUntil;
	}

	@JsonProperty("SuspendedUntil")
	public void setSuspendedUntil(String suspendedUntil) {
		this.suspendedUntil = suspendedUntil;
	}

	@JsonProperty("IsTermsAndConditionsAccepted")
	public Boolean getIsTermsAndConditionsAccepted() {
		return isTermsAndConditionsAccepted;
	}

	@JsonProperty("IsTermsAndConditionsAccepted")
	public void setIsTermsAndConditionsAccepted(Boolean isTermsAndConditionsAccepted) {
		this.isTermsAndConditionsAccepted = isTermsAndConditionsAccepted;
	}

	@JsonProperty("isFraudMessagesAccepted")
	public Boolean getIsFraudMessagesAccepted() {
		return isFraudMessagesAccepted;
	}

	@JsonProperty("isFraudMessagesAccepted")
	public void setIsFraudMessagesAccepted(Boolean isFraudMessagesAccepted) {
		this.isFraudMessagesAccepted = isFraudMessagesAccepted;
	}

	@JsonProperty("FraudMsgAcceptedDate")
	public String getFraudMsgAcceptedDate() {
		return fraudMsgAcceptedDate;
	}

	@JsonProperty("FraudMsgAcceptedDate")
	public void setFraudMsgAcceptedDate(String fraudMsgAcceptedDate) {
		this.fraudMsgAcceptedDate = fraudMsgAcceptedDate;
	}

	@JsonProperty("isPhishingMessageAccepted")
	public Boolean getIsPhishingMessageAccepted() {
		return isPhishingMessageAccepted;
	}

	@JsonProperty("isPhishingMessageAccepted")
	public void setIsPhishingMessageAccepted(Boolean isPhishingMessageAccepted) {
		this.isPhishingMessageAccepted = isPhishingMessageAccepted;
	}

	@JsonProperty("PhishingMsgAcceptedDate")
	public String getPhishingMsgAcceptedDate() {
		return phishingMsgAcceptedDate;
	}

	@JsonProperty("PhishingMsgAcceptedDate")
	public void setPhishingMsgAcceptedDate(String phishingMsgAcceptedDate) {
		this.phishingMsgAcceptedDate = phishingMsgAcceptedDate;
	}

	@JsonProperty("IsProcessRegAccepted")
	public Boolean getIsProcessRegAccepted() {
		return isProcessRegAccepted;
	}

	@JsonProperty("IsProcessRegAccepted")
	public void setIsProcessRegAccepted(Boolean isProcessRegAccepted) {
		this.isProcessRegAccepted = isProcessRegAccepted;
	}

	@JsonProperty("isOTPAccepted")
	public Boolean getIsOTPAccepted() {
		return isOTPAccepted;
	}

	@JsonProperty("isOTPAccepted")
	public void setIsOTPAccepted(Boolean isOTPAccepted) {
		this.isOTPAccepted = isOTPAccepted;
	}

	@JsonProperty("isOosUser")
	public Boolean getIsOosUser() {
		return isOosUser;
	}

	@JsonProperty("isOosUser")
	public void setIsOosUser(Boolean isOosUser) {
		this.isOosUser = isOosUser;
	}

	@JsonProperty("SelectedOTPoption")
	public Object getSelectedOTPoption() {
		return selectedOTPoption;
	}

	@JsonProperty("SelectedOTPoption")
	public void setSelectedOTPoption(Object selectedOTPoption) {
		this.selectedOTPoption = selectedOTPoption;
	}

	@JsonProperty("requireOosLoginOTP")
	public Boolean getRequireOosLoginOTP() {
		return requireOosLoginOTP;
	}

	@JsonProperty("requireOosLoginOTP")
	public void setRequireOosLoginOTP(Boolean requireOosLoginOTP) {
		this.requireOosLoginOTP = requireOosLoginOTP;
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
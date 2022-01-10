package com.scm.ws.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.internal.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scm.common.cache.SCMProperties;
import com.scm.dao.common.DaoManager;
import com.scm.dao.domain.Address;
import com.scm.dao.domain.AddressType;
import com.scm.dao.domain.BankAccount;
import com.scm.dao.domain.Bbbee;
import com.scm.dao.domain.BusinessStatus;
import com.scm.dao.domain.City;
import com.scm.dao.domain.CommodityGroup;
import com.scm.dao.domain.CommodityItem;
import com.scm.dao.domain.CommodityLocation;
import com.scm.dao.domain.CommodityProvince;
import com.scm.dao.domain.Contact;
import com.scm.dao.domain.Country;
import com.scm.dao.domain.Director;
import com.scm.dao.domain.District;
import com.scm.dao.domain.GovernmentType;
import com.scm.dao.domain.IdType;
import com.scm.dao.domain.Municipality;
import com.scm.dao.domain.Supplier;
import com.scm.dao.domain.SupplierClassification;
import com.scm.dao.domain.SupplierMaster;
import com.scm.dao.domain.SupplierSubClassification;
import com.scm.dao.domain.Taxes;
import com.scm.modal.SupplierViewModel;
import com.scm.ws.CsdApiService;
import com.scm.ws.impl.data.Authentication;
import com.scm.ws.impl.data.SupplierAddress;
import com.scm.ws.impl.data.SupplierCommodity;
import com.scm.ws.impl.data.SupplierCommodityItem;
import com.scm.ws.impl.data.SupplierCommodityLocation;
import com.scm.ws.impl.data.SupplierCommodityProvince;
import com.scm.ws.impl.data.SupplierContact;
import com.scm.ws.impl.data.SupplierDetailsFull;
import com.scm.ws.impl.data.SupplierDirector;

@Service
public class CsdApiServiceImpl implements CsdApiService {

	String authenticationXml = SCMProperties.get("csdapi_authentication_xml");
	// "<AuthenticationRequest xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'
	// xmlns:xsd='http://www.w3.org/2001/XMLSchema'><AcceptTermsandConditions>true</AcceptTermsandConditions><Email>{0}</Email><Password>{1}</Password></AuthenticationRequest>";
	String supplierXml = SCMProperties.get("csdapi__supplier_xml");
	// "<GetSupplierDetailRequest
	// xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'
	// xmlns:xsd='http://www.w3.org/2001/XMLSchema'><SupplierNumber>{0}</SupplierNumber></GetSupplierDetailRequest>";

	String username = SCMProperties.get("csdapi_username");// "Mashudu.matakanyi@ekurhuleni.gov.za";
	String password = SCMProperties.get("csdapi_password");// "Mash#12@81";

	@Autowired(required = true)
	CsdApiLoggingInterceptor csdApiLoggingInterceptor;

	@Autowired(required = true)
	DaoManager daoManager;

	private Logger logger = LogManager.getLogger("SCMCORE");

	@Override
	public String authenticate() throws Throwable {

		String baseUri = SCMProperties.get("csdapi_authentication_uri");// "https://api.csd.gov.za/api/Authenticate";
		ResponseEntity<Authentication> responseEnt = null;
		RestTemplate restTemplate = new RestTemplate();

		int timeout = 5 * 60000;
		restTemplate.setInterceptors(Collections.singletonList(csdApiLoggingInterceptor));

		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setReadTimeout(timeout);
		factory.setConnectTimeout(timeout);
		restTemplate.setRequestFactory(factory);
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

		UriComponentsBuilder componentBuilder = UriComponentsBuilder.fromHttpUrl(baseUri).queryParam("format", "xml");
		UriComponents uriComp = componentBuilder.build();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

		String xmlentity = authenticationXml;
		xmlentity = xmlentity.replace("{0}", username);
		xmlentity = xmlentity.replace("{1}", password);

		HttpEntity<String> entity = new HttpEntity<String>(xmlentity, headers);
		responseEnt = restTemplate.exchange(uriComp.toString(), HttpMethod.POST, entity, Authentication.class);
		Authentication response = responseEnt.getBody();
		printResponseEntity(response, "authenticate");
		return response.getToken();
	}

	@Override
	public SupplierDetailsFull getSupplier(String token, String supplierNo) throws Throwable {

		String baseUri = SCMProperties.get("csdapi__supplier_uri");// "https://api.csd.gov.za/api/Supplier/GetSupplierDetailsFull";
		ResponseEntity<SupplierDetailsFull> responseEnt = null;
		RestTemplate restTemplate = new RestTemplate();

		int timeout = 5 * 60000;
		restTemplate.setInterceptors(Collections.singletonList(csdApiLoggingInterceptor));

		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setReadTimeout(timeout);
		factory.setConnectTimeout(timeout);
		restTemplate.setRequestFactory(factory);
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

		UriComponentsBuilder componentBuilder = UriComponentsBuilder.fromHttpUrl(baseUri).queryParam("format", "xml");
		UriComponents uriComp = componentBuilder.build();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		headers.setBearerAuth(token);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

		String xmlentity = supplierXml;
		xmlentity = xmlentity.replace("{0}", supplierNo);

		HttpEntity<String> entity = new HttpEntity<String>(xmlentity, headers);
		responseEnt = restTemplate.exchange(uriComp.toString(), HttpMethod.POST, entity, SupplierDetailsFull.class);
		SupplierDetailsFull response = responseEnt.getBody();
		printResponseEntity(response, "getSupplier");
		return response;
	}

	private void printResponseEntity(Object entity, String operationName) {
		ObjectMapper mapper = new ObjectMapper();

		if (entity != null) {
			try {
				logger.info("\n################################ RESPONSE DATA for the method::" + operationName
						+ " is ################################\n" + mapper.writeValueAsString(entity)
						+ "\n****************************************************************************");
			} catch (Throwable e) {
				logger.error("Unexpected errorcode returns " + e);
			}
		}
	}

	@Override
	@Transactional
	public void mapSupplierDto(SupplierViewModel svm, SupplierDetailsFull supplierDetailsFull) throws Throwable {
		// TODO Auto-generated method stub
		Supplier supplier = daoManager.getSupplierDao()
				.getSupplierDetails(supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
		if (supplier == null) {
			supplier = new Supplier();
		}
		supplier.setCsdId(-1l);
		supplier.setSupplierNumber(supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
		supplier.setUniqueRegistrationReferenceNumber(authenticationXml);
		supplier.setIsActive(supplierDetailsFull.getSupplierIdentificationDetails().getIsActive());
		supplier.setSupplierInactiveReason(
				supplierDetailsFull.getSupplierIdentificationDetails().getSupplierInactiveReason());
		supplier.setSupplierInactiveDate(
				supplierDetailsFull.getSupplierIdentificationDetails().getSupplierInactiveDate());
		// SupplierStateCode
		supplier.setIsAssociated(supplierDetailsFull.getSupplierIdentificationDetails().getIsAssociated());
		supplier.setSupplierTypeCode(supplierDetailsFull.getSupplierIdentificationDetails().getSupplierTypeCode());
		SupplierClassification supplierClassification = daoManager.getSupplierClassificationsDao()
				.getSupplierClassificationByCode(
						supplierDetailsFull.getSupplierIdentificationDetails().getSupplierTypeCode());
		supplier.setSupplierClassification(supplierClassification);
		supplier.setSupplierSubTypeCode(
				supplierDetailsFull.getSupplierIdentificationDetails().getSupplierSubTypeCode());

		SupplierSubClassification supplierSubClassification = daoManager.getSupplierSubClassificationsDao()
				.getSupplierSubClassificationByCode(
						supplierDetailsFull.getSupplierIdentificationDetails().getSupplierSubTypeCode());

		supplier.setSupplierSubClassification(supplierSubClassification);

		supplier.setGovernmentTypeCode(supplierDetailsFull.getSupplierIdentificationDetails().getGovernmentTypeCode());

		GovernmentType governmentType = daoManager.getGovernmentTypesDao().getGovernmentTypeByCode(
				supplierDetailsFull.getSupplierIdentificationDetails().getGovernmentTypeCode());

		supplier.setGovernmentTypeId(governmentType.getGovernmentTypeId());

		supplier.setCountryOfOriginCode(
				supplierDetailsFull.getSupplierIdentificationDetails().getCountryOfOriginCode());

		Country country = daoManager.getCountryDao()
				.getCountryByCode(supplierDetailsFull.getSupplierIdentificationDetails().getCountryOfOriginCode());
		supplier.setCountryOfOriginId(country.getCountryId());

		supplier.setLegalName(supplierDetailsFull.getSupplierIdentificationDetails().getLegalName());
		supplier.setTradingName(supplierDetailsFull.getSupplierIdentificationDetails().getTradingName());
		supplier.setIdTypeCode(supplierDetailsFull.getSupplierIdentificationDetails().getIDTypeCode());

		IdType idType = daoManager.getIdTypesDao()
				.getIdTypeByCode(supplierDetailsFull.getSupplierIdentificationDetails().getIDTypeCode());

		supplier.setIdTypeId(idType.getIdTypeId());
		supplier.setSaIdNumber(supplierDetailsFull.getSupplierIdentificationDetails().getSAIDNumber());

		supplier.setForeignIdNumber(supplierDetailsFull.getSupplierIdentificationDetails().getForeignIDNumber());
		supplier.setForeignPassportNumber(
				supplierDetailsFull.getSupplierIdentificationDetails().getForeignPassportNumber());
		supplier.setWorkPermitNumber(supplierDetailsFull.getSupplierIdentificationDetails().getWorkPermitNumber());
		supplier.setSaCompanyNumber(supplierDetailsFull.getSupplierIdentificationDetails().getSACompanyNumber());
		supplier.setRegistrationDate(supplierDetailsFull.getSupplierIdentificationDetails().getRegistrationDate());
		supplier.setForeignCompanyRegistrationNumber(
				supplierDetailsFull.getSupplierIdentificationDetails().getForeignCompanyRegistrationNumber());
		supplier.setSaTrustRegistrationNumber(
				supplierDetailsFull.getSupplierIdentificationDetails().getSATrustRegistrationNumber());

		supplier.setForeignTrustRegistrationNumber(
				supplierDetailsFull.getSupplierIdentificationDetails().getForeignTrustRegistrationNumber());

		supplier.setNonProfitOrganisationNumber(
				supplierDetailsFull.getSupplierIdentificationDetails().getNonProfitOrganisation());
		supplier.setOosIdNumber(supplierDetailsFull.getSupplierIdentificationDetails().getOoSIDNumber());
		// DateOperationsStarted
		supplier.setHaveBankAccount(supplierDetailsFull.getSupplierIdentificationDetails().getHaveBankAccount());
		supplier.setBusinessStatusCode(supplierDetailsFull.getSupplierIdentificationDetails().getBusinessStatusCode());

		BusinessStatus businessStatus = daoManager.getBusinessStatusDao().getBusinessStatusByCode(
				supplierDetailsFull.getSupplierIdentificationDetails().getBusinessStatusCode());

		supplier.setBusinessStatusId(businessStatus.getBusinessStatusId());

		supplier.setBusinessStatusLastVerificationDate(
				supplierDetailsFull.getSupplierIdentificationDetails().getBusinessStatusLastVerificationDate());
		// IsListedOnStockExchange
		// IsOwnedByNaturalSAPerson
		// TotalAnnualTurnoverCode
		// FinancialYearStartDate
		supplier.setCreatedDate(supplierDetailsFull.getSupplierIdentificationDetails().getCreatedDate());
		supplier.setEditDate(supplierDetailsFull.getSupplierIdentificationDetails().getEditDate());

		svm.setSupplier(supplier);

		List<Address> addressList = new ArrayList<Address>();

		if (supplierDetailsFull.getSupplierAddressDetails() != null
				&& supplierDetailsFull.getSupplierAddressDetails().getSupplierAddressList() != null
				&& supplierDetailsFull.getSupplierAddressDetails().getSupplierAddressList().size() > 0) {
			for (SupplierAddress suppAddress : supplierDetailsFull.getSupplierAddressDetails()
					.getSupplierAddressList()) {
				Address addr = new Address();

				addr.setSupplierId(svm.getSupplier().getId());
				addr.setSupplierNumber(supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
				addr.setAddressLine1(suppAddress.getAddressLine1());
				addr.setAddressLine2(suppAddress.getAddressLine2());
				addr.setAddressTypeCode(suppAddress.getAddressTypeCode());

				AddressType addrType = daoManager.getAddressTypesDao()
						.getAddressTypeByCode(suppAddress.getAddressTypeCode());
				addr.setAddressType(addrType);
				addr.setCityCode(suppAddress.getCityCode());

				City city = daoManager.getCitiesDao().getCityByCode(suppAddress.getCityCode());
				addr.setCity(city);
				addr.setCountryCode(suppAddress.getCountryCode());

				addr.setCountry(daoManager.getCountryDao().getCountryByCode(suppAddress.getCountryCode()));
				addr.setDistrictCode(suppAddress.getDistrictCode());
				District district = daoManager.getDistrictsDao().getDistrictByCode(suppAddress.getDistrictCode());
				addr.setDistrict(district);

				addr.setMunicipalityCode(suppAddress.getMunicipalityCode());

				Municipality municipality = daoManager.getMunicipalitiesDao()
						.getMunicipalityByCode(suppAddress.getMunicipalityCode());

				addr.setMunicipality(municipality);
				addr.setProvinceCode(suppAddress.getProvinceCode());
				addr.setProvince(daoManager.getProvincesDao().getProvinceByCode(suppAddress.getProvinceCode()));
				addr.setSuburbCode(suppAddress.getSuburbCode());
				addr.setSuburb(daoManager.getSuburbsDao().getSuburbByCode(suppAddress.getSuburbCode()));
				addr.setWardCode(suppAddress.getWardCode());
				addr.setWard(daoManager.getWardsDao().getWardByCode(suppAddress.getWardCode()));
				addr.setPostalCode(suppAddress.getPostalCode());
				addr.setIsDeliveryAddress(suppAddress.getIsDeliveryAddress());
				addr.setIsPaymentAddress(suppAddress.getIsPaymentAddress());
				addr.setIsPhysicalAddress(suppAddress.getIsPhysicalAddress());
				addr.setIsPostalAddress(suppAddress.getIsPostalAddress());
				addr.setIsPreferred(suppAddress.getIsPreferred());
				addr.setIsActive(suppAddress.getIsActive());

				addressList.add(addr);
			}
			svm.setAddresses(addressList);

			if (supplierDetailsFull.getSupplierBBBEEDetails() != null
					&& supplierDetailsFull.getSupplierBBBEEDetails().getCreatedDate().getYear() > 1900) {

				Bbbee bbbee = daoManager.getBbbeeDao()
						.getBbbeeDetails(supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
				if (bbbee == null) {
					bbbee = new Bbbee();
				}
				bbbee.setSupplierId(svm.getSupplier().getId());
				bbbee.setSupplierNumber(supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
				bbbee.setAccessFinancialServicesScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getAccessFinancialServicesScore() + "");
				bbbee.setBlackOwnership(supplierDetailsFull.getSupplierBBBEEDetails().getBlackOwnership() + "");
				bbbee.setBlackWomanOwnership(
						supplierDetailsFull.getSupplierBBBEEDetails().getBlackWomanOwnership() + "");
				bbbee.setCertificateExpiryDate(
						supplierDetailsFull.getSupplierBBBEEDetails().getCertificateExpiryDate());
				bbbee.setCertificateIssueDate(supplierDetailsFull.getSupplierBBBEEDetails().getCertificateIssueDate());
				bbbee.setCertificateNumber(supplierDetailsFull.getSupplierBBBEEDetails().getCertificateNumber());
				bbbee.setCertificateSignDate(supplierDetailsFull.getSupplierBBBEEDetails().getCertificateSignDate());
				bbbee.setCertificateSignedBy(supplierDetailsFull.getSupplierBBBEEDetails().getCertificateSignedBy());
				bbbee.setCertificateTypeCode(supplierDetailsFull.getSupplierBBBEEDetails().getCertificateTypeCode());

				bbbee.setBbbeeCertificateType(daoManager.getBbbeeCertificateTypeDao().getBbbeeCertificateTypeByCode(
						supplierDetailsFull.getSupplierBBBEEDetails().getCertificateTypeCode()));

				bbbee.setEconomicDevelopmentScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getEconomicDevelopmentScore() + "");
				bbbee.setEmploymentEquityScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getEmploymentEquityScore() + "");

				bbbee.setEmpoweringSupplier(supplierDetailsFull.getSupplierBBBEEDetails().getEmpoweringSupplier());
				bbbee.setEmpowermentFinancingScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getEmpowermentFinancingScore() + "");
				bbbee.setEnterpriseDevelopmentScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getEnterpriseSupplierDevelopmentScore() + "");
				bbbee.setForeignOwnershipScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getForeignOwnershipScore() + "");
				bbbee.setIrbaRegisteredAuditorCode(
						supplierDetailsFull.getSupplierBBBEEDetails().getIRBARegisteredAuditorCode());
				bbbee.setBbbeeIrbaRegisteredAuditor(
						daoManager.getBbbeeIrbaRegisteredAuditorsDao().getBbbeeIrbaRegisteredAuditorByCode(
								supplierDetailsFull.getSupplierBBBEEDetails().getIRBARegisteredAuditorCode()));
				bbbee.setIsAcceptUnderstandAffidavid(
						supplierDetailsFull.getSupplierBBBEEDetails().getIsAcceptUnderstandAffidavid());
				bbbee.setLandOwnershipScore(supplierDetailsFull.getSupplierBBBEEDetails().getLandOwnershipScore() + "");
				bbbee.setManagementControlScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getManagementControlScore() + "");
				bbbee.setOwnershipScore(supplierDetailsFull.getSupplierBBBEEDetails().getOwnershipScore() + "");
				bbbee.setPreferentialProcurementScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getPreferentialProcurementScore() + "");
				bbbee.setSanasAccreditedAgencyCode(
						supplierDetailsFull.getSupplierBBBEEDetails().getSANASAccreditedAgencyCode());
				bbbee.setSanasBbbeeVerificationAgency(
						daoManager.getSanasBbbeeVerificationAgenciesDao().getSanasBbbeeVerificationAgencyByCode(
								supplierDetailsFull.getSupplierBBBEEDetails().getSANASAccreditedAgencyCode()));

				bbbee.setSectorCharterCode(supplierDetailsFull.getSupplierBBBEEDetails().getSectorCharterCode());
				bbbee.setBbbeeSectorCharter1(daoManager.getBbbeeSectorChartersDao().getBbbeeSectorCharterByCode(
						supplierDetailsFull.getSupplierBBBEEDetails().getSectorCharterCode()));

				bbbee.setSkillsDevelopmentScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getSkillsDevelopmentScore() + "");
				bbbee.setSocioEconomicDevelopmentScore(
						supplierDetailsFull.getSupplierBBBEEDetails().getSocioEconomicDevelopmentScore() + "");
				bbbee.setStatusLevelOfContributorCode(
						supplierDetailsFull.getSupplierBBBEEDetails().getStatusLevelOfContributorCode());
				bbbee.setBbbeeStatusLevelOfContributor(
						daoManager.getBbbeeStatusLevelOfContributorsDao().getBbbeeStatusLevelOfContributorByCode(
								supplierDetailsFull.getSupplierBBBEEDetails().getStatusLevelOfContributorCode()));

				svm.setBbbee(bbbee);
			}

			if (supplierDetailsFull.getSupplierBankingDetails() != null
					&& supplierDetailsFull.getSupplierBankingDetails().getBankAccountList() != null
					&& supplierDetailsFull.getSupplierBankingDetails().getBankAccountList().size() > 0) {

				List<BankAccount> bankAccountList = new ArrayList<BankAccount>();

				for (com.scm.ws.impl.data.BankAccount banking : supplierDetailsFull.getSupplierBankingDetails()
						.getBankAccountList()) {
					BankAccount localBankAccount = new BankAccount();

					localBankAccount.setSupplierId(svm.getSupplier().getId());
					localBankAccount.setSupplierNumber(
							supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
					localBankAccount.setAccountHolder(
							banking.getAccountHolder().length() > 32 ? banking.getAccountHolder().substring(0, 32)
									: banking.getAccountHolder());
					localBankAccount.setAccountNumber(banking.getAccountNumber());
					localBankAccount.setAddressLine1(banking.getAddressLine1());
					localBankAccount.setAddressLine2(banking.getAddressLine2());
					localBankAccount.setBankAccountStatusCode(banking.getBankAccountStatusCode());
					localBankAccount.setBankVerificationStatus(daoManager.getBankVerificationStatusDao()
							.getBankVerificationStatusDetails(banking.getBankAccountStatusCode()));

					localBankAccount.setBankAccountTypeCode(banking.getBankAccountTypeCode());
					localBankAccount.setBankAccountType(daoManager.getBankAccountTypesDao()
							.getBankAccountTypesDetails(banking.getBankAccountTypeCode()));
					// BankAccountVerificationDate =
					// dto.SupplierBankingDetails.BankAccountList.MasterBankAccountDetail.BankAccountVerificationDate.ToString(),
					localBankAccount.setBankCode(banking.getBankCode());
					localBankAccount.setBank(daoManager.getBanksDao().getBankDetails(banking.getBankCode()));

					localBankAccount.setBankName(banking.getBankName());
					localBankAccount.setBranchName(banking.getBranchName());
					localBankAccount.setBranchNumber(banking.getBranchNumber());
					localBankAccount.setCountryCode(banking.getCountryCode());
					localBankAccount.setCountry(daoManager.getCountryDao().getCountryByCode(banking.getCountryCode()));
					// FirstName =
					// dto.SupplierBankingDetails.BankAccountList.MasterBankAccountDetail.FirstName.ToString(),
					// FundingContacts =
					// dto.SupplierBankingDetails.BankAccountList.MasterBankAccountDetail.FundingContacts.ToString(),
					// Initials =
					// dto.SupplierBankingDetails.BankAccountList.MasterBankAccountDetail.Initials.ToString(),
					localBankAccount.setIsForeignBankAccount(false);
					// IsIdentifierLinkedAtBank =
					// bool.Parse(dto.SupplierBankingDetails.BankAccountList.MasterBankAccountDetail.IsIdentifierLinkedAtBank.ToString()),
					localBankAccount.setIsPreferredAccount(banking.getIsPreferred());
					// IsActive =
					// bool.Parse(dto.SupplierBankingDetails.BankAccountList.MasterBankAccountDetail.IsActive.ToString()),
					// IsSharedFundingAccount =
					// bool.Parse(dto.SupplierBankingDetails.BankAccountList.MasterBankAccountDetail.IsSharedFundingAccount.ToString()),
					// LastName =
					// dto.SupplierBankingDetails.BankAccountList.MasterBankAccountDetail.LastName.ToString(),
					// Title =
					// dto.SupplierBankingDetails.BankAccountList.MasterBankAccountDetail.Title.ToString(),
					localBankAccount.setEditDate(banking.getEditDate());
					localBankAccount.setCreatedDate(banking.getCreatedDate());
					localBankAccount.setZipCode(banking.getZipCode());

					bankAccountList.add(localBankAccount);
				}
				svm.setBankAccounts(bankAccountList);
			}

			if (supplierDetailsFull.getSupplierTaxDetails() != null
					&& supplierDetailsFull.getSupplierTaxDetails().getCreatedDate().getYear() > 1900) {

				List<Taxes> taxList = new ArrayList<Taxes>();
				Taxes tax = new Taxes();
				tax.setSupplierId(svm.getSupplier().getId());
				tax.setSupplierNumber(supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
				tax.setIsRegistered(supplierDetailsFull.getSupplierTaxDetails().getIsRegistered());
				// IsVatVendor
				tax.setIncomeTaxNumber(supplierDetailsFull.getSupplierTaxDetails().getIncomeTaxNumber());
				tax.setField1(supplierDetailsFull.getSupplierTaxDetails().getTaxClearanceCertificateExpiryDate());
				tax.setPayeNumber(supplierDetailsFull.getSupplierTaxDetails().getPAYENumber());
				tax.setVatNumber(supplierDetailsFull.getSupplierTaxDetails().getVATNumber());
				// IsPinProvided
				tax.setIsValidCertificate(supplierDetailsFull.getSupplierTaxDetails().getIsValidCertificate());
				tax.setValidationResponse(supplierDetailsFull.getSupplierTaxDetails().getValidationResponse());
				tax.setLastVerificationDate(supplierDetailsFull.getSupplierTaxDetails().getLastVerificationDate());
				tax.setCreatedDate(supplierDetailsFull.getSupplierTaxDetails().getCreatedDate());
				tax.setEditDate(supplierDetailsFull.getSupplierTaxDetails().getEditDate());

				taxList.add(tax);
				svm.setTaxes(taxList);

			}

			if (supplierDetailsFull.getSupplierDirectorDetails() != null
					&& supplierDetailsFull.getSupplierDirectorDetails().getSupplierDirectors() != null) {
				List<Director> directorList = new ArrayList<Director>();
				for (SupplierDirector sd : supplierDetailsFull.getSupplierDirectorDetails().getSupplierDirectors()) {
					if (sd.getCreatedDate().getYear() > 1900) {
						Director director = new Director();

						director.setSupplierId(svm.getSupplier().getId());
						director.setSupplierNumber(
								supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
						director.setName(sd.getName());
						director.setSurname(sd.getSurname());
						director.setAppointmentDate(sd.getAppointmentDate());
						director.setIsActive(sd.getIsActive());
						director.setCountryTypeCode(sd.getCountryTypeCode());
						director.setCountry(daoManager.getCountryDao().getCountryByCode(sd.getCountryTypeCode()));

						director.setIdTypeCode(sd.getIDTypeCode());
						director.setIdType(daoManager.getIdTypesDao().getIdTypeByCode(sd.getIDTypeCode()));
						director.setDirectorStatusTypeCode(sd.getDirectorStatusTypeCode());
						director.setDirectorStatus(daoManager.getDirectorStatusDao()
								.getDirectorStatusDetails(sd.getDirectorStatusTypeCode()));

						director.setSaIdNumber(sd.getSAIDNumber());
						director.setForeignIdNumber(sd.getForeignIDNUmber());
						director.setForeignPassportNumber(sd.getForeignPassportNumber());
						director.setWorkPermitNumber(sd.getWorkPermitNumber());
						director.setIsOwner(false);
						// CellphoneNumber
						// Email
						// GenderCode
						// EthnicGroup
						// ownershipPercentage
						// ownershipDemographics
						director.setCreatedDate(sd.getCreatedDate());
						director.setEditDate(sd.getEditDate());

						directorList.add(director);
					}
				}
				svm.setDirectors(directorList);
			}

			if (supplierDetailsFull.getSupplierContactDetails() != null
					&& supplierDetailsFull.getSupplierContactDetails().getSupplierContacts() != null) {
				List<Contact> contactList = new ArrayList<Contact>();
				for (SupplierContact sc : supplierDetailsFull.getSupplierContactDetails().getSupplierContacts()) {
					if (sc.getCreatedDate().getYear() > 1900) {
						Contact contact = new Contact();

						contact.setSupplierId(svm.getSupplier().getId());
						contact.setSupplierNumber(
								supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
						contact.setIsPreferred(sc.getIsPreferred());
						contact.setName(sc.getName());
						contact.setSurname(sc.getSurname());
						idType = daoManager.getIdTypesDao().getIdTypeByCode(sc.getIdentificationTypeCode());
						contact.setIdTypeId(idType == null ? 0 : idType.getIdTypeId());
						contact.setSaIdNumber(sc.getSAIDNumber());
						contact.setForeignIdNumber(sc.getForeignIDNumber());
						contact.setForeignPassportNumber(sc.getForeignPassportNumber());
						contact.setWorkPermitNumber(sc.getWorkPermit());
						contact.setPreferCellphone(sc.getPreferCellphone());
						contact.setPreferEmail(sc.getPreferEmail());
						contact.setPreferFax(sc.getPreferFax());
						contact.setPreferPostal(sc.getPreferPostal());
						contact.setPreferSms(sc.getPreferSMS());
						contact.setPreferTelephone(sc.getPreferTelephone());
						contact.setEmailAddress(sc.getEmailAddress());
						contact.setCellphoneNumber(sc.getCellphoneNumber());
						contact.setFaxNumber(sc.getFaxNumber());
						contact.setTelephoneNumber(sc.getTelephoneNumber());
						// TollFreeNumber
						// WebsiteAddress
						// FundingPartnerLegalName
						contact.setCreatedDate(sc.getCreatedDate());
						contact.setEditDate(sc.getEditDate());
						contact.setField1(sc.getContactTypeCode());
						contact.setField2(sc.getContactTypeName());

						contactList.add(contact);
					}
				}
				svm.setContact(contactList);
			}

			if (supplierDetailsFull.getSupplierCommodityDetails() != null
					&& supplierDetailsFull.getSupplierCommodityDetails().getSupplierCommodityList() != null
					&& supplierDetailsFull.getSupplierCommodityDetails().getSupplierCommodityList().size() > 0) {

				List<CommodityGroup> commodityGroupList = new ArrayList<CommodityGroup>();
				List<CommodityItem> commodityItemList = new ArrayList<CommodityItem>();
				List<CommodityLocation> commodityLocationList = new ArrayList<CommodityLocation>();
				List<CommodityProvince> commodityProvinceList = new ArrayList<CommodityProvince>();
				for (SupplierCommodity sc : supplierDetailsFull.getSupplierCommodityDetails()
						.getSupplierCommodityList()) {

					CommodityGroup commodityGrp = new CommodityGroup();
					commodityGrp.setId(Long.valueOf(sc.getCommodityGroupID()));
					commodityGrp.setName(sc.getName());
					commodityGrp.setDescription(sc.getDescription());
					commodityGrp.setSupplierId(svm.getSupplier().getId());
					commodityGrp.setSupplierNumber(
							supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
					commodityGrp.setNationWide(sc.getNationWide());
					commodityGrp.setProvinceWide(sc.getProvinceWide());
					commodityGrp.setIsActive(sc.getIsActive());
					commodityGrp.setCreatedDate(sc.getCreatedDate());
					commodityGrp.setEditDate(sc.getEditDate());
					Date date = new Date();
					Timestamp ts = new Timestamp(date.getTime());
					commodityGrp.setProcessedTimeStamp(ts);
					
					commodityGroupList.add(commodityGrp);

					for (SupplierCommodityItem sci : sc.getSupplierCommodityItems()) {

						CommodityItem commodityItem = new CommodityItem();

						commodityItem.setSupplierId(svm.getSupplier().getId());
						commodityItem.setSupplierNumber(
								supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
						commodityItem.setCommodityGroupId(
								Long.valueOf(sc.getCommodityGroupID() == null ? 0l : sc.getCommodityGroupID()));

						commodityItem.setCommodityCode(Long
								.valueOf(StringHelper.isEmpty(sci.getCommodityCode()) ? "0" : sci.getCommodityCode()));
						commodityItem.setProcessedTimeStamp(ts);
						commodityItemList.add(commodityItem);
					}
					
					for(SupplierCommodityLocation scl: sc.getSupplierCommodityLocations()) {
						CommodityLocation cl = new CommodityLocation();
						cl.setCommodityGroupId(
								Long.valueOf(sc.getCommodityGroupID() == null ? 0l : sc.getCommodityGroupID()));
						cl.setSupplierId(svm.getSupplier().getId());
						cl.setSupplierNumber(
								supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
						cl.setWardCode(Long
								.valueOf(StringHelper.isEmpty(scl.getWardCode()) ? "0" : scl.getWardCode()));
						cl.setWardId(Integer
								.parseInt(StringHelper.isEmpty(scl.getWardNumber()) ? "0" : scl.getWardNumber()));
						cl.setProcessedTimeStamp(ts);
						commodityLocationList.add(cl);
					}
					
					for(SupplierCommodityProvince scp: sc.getSupplierCommodityProvinces()) {
						CommodityProvince cp = new CommodityProvince();
						cp.setProvinceCode(Long
								.valueOf(StringHelper.isEmpty(scp.getProvinceCode()) ? "0" : scp.getProvinceCode()));
						cp.setCommodityGroupId(
								Long.valueOf(sc.getCommodityGroupID() == null ? 0l : sc.getCommodityGroupID()));
						cp.setSupplierId(svm.getSupplier().getId());
						cp.setSupplierNumber(
								supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber());
						cp.setProcessedTimeStamp(ts);
						commodityProvinceList.add(cp);
					}
					
				}
				svm.setCommodityGroups(commodityGroupList);
				svm.setCommodityItems(commodityItemList);
				svm.setCommodityLocations(commodityLocationList);
				svm.setCommodityProvinces(commodityProvinceList);

			}

			/*
			 * Later : 
			 * svm.Accredation 
			 * svm.Associations 
			 * svm.SupplierFlags 
			 * svm.DirectorFlags
			 */

			// COE data checks - if no data setup the models.
			if (StringHelper.isNotEmpty(svm.getSupplier().getSupplierNumber())) {
				svm.setSupplierMaster(daoManager.getSupplierMasterDao()
						.getSupplierMasterDetails(svm.getSupplier().getSupplierNumber(), false));
				if (svm.getSupplierMaster() == null) {
					svm.setSupplierMaster(new SupplierMaster());
					svm.getSupplierMaster().setSupplierRefNo(svm.getSupplier().getSupplierNumber());
				}
			}

		}

	}

}

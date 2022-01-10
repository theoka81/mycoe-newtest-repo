package com.scm.service.impl;

import org.springframework.stereotype.Service;

import com.scm.dao.domain.SupplierCode;
import com.scm.dao.domain.SupplierCodesWork;
import com.scm.dao.domain.SupplierMaster;
import com.scm.dao.domain.SupplierMasterWork;
import com.scm.service.common.BaseUIservice;

@Service("cloneHelper")
public class CloneHelper extends BaseUIservice {

	public SupplierMasterWork Copy(SupplierMaster w) throws Throwable {

		if (w == null)
			throw new Exception("Invalid supplier master work item when cloning.");

		SupplierMasterWork smw = daoManager.getSupplierMasterWorkDao().get(w.getId());

		if (smw == null)
			smw = new SupplierMasterWork();

		smw.setOriginalId(w.getId());
		smw.setCluster(w.getCluster());
		smw.setUserCode1(w.getUserCode1());
		smw.setCompany(w.getCompany());
		smw.setUserCode2(w.getUserCode2());
		smw.setSystemUser1(w.getSystemUser1());
		smw.setCreatedDateTime(w.getCreatedDateTime());
		smw.setDeliveryInstructions(w.getDeliveryInstructions());
		smw.setDepartment(w.getDepartment());
		smw.setUserCode3(w.getUserCode3());
		// smw.setId(w.getId());
		smw.setIsActive(w.getIsActive());
		smw.setIsDeleted(w.getIsDeleted());
		smw.setIsLocked(w.getIsLocked());
		smw.setLastInvoiceDate(w.getLastInvoiceDate());
		smw.setLastPaymentDate(w.getLastPaymentDate());
		smw.setSystemUser2(w.getSystemUser2());
		smw.setModifiedDateTime(w.getModifiedDateTime());
		smw.setParentNo(w.getParentNo());
		smw.setPaymentInstrument(w.getPaymentInstrument());
		smw.setUserCode4(w.getUserCode4());
		smw.setPaymentTerms(w.getPaymentTerms());
		smw.setUserCode5(w.getUserCode5());
		smw.setPrintMessage(w.getPrintMessage());
		smw.setUserCode6(w.getUserCode6());
		smw.setRemitType(w.getRemitType());
		smw.setUserCode7(w.getUserCode7());
		smw.setUserCode8(w.getUserCode8());
		smw.setSupplierCode(w.getSupplierCode());
		smw.setUserCode9(w.getUserCode9());
		smw.setSupplierHold(w.getSupplierHold());
		smw.setUserCode10(w.getUserCode10());
		smw.setSupplierRefId(w.getSupplierRefId());
		smw.setSupplierRefNo(w.getSupplierRefNo());
		smw.setSupplierStatus(w.getSupplierStatus());
		smw.setSupplierType(w.getSupplierType());
		smw.setUserCode11(w.getUserCode11());
		smw.setSupplierXRef1(w.getSupplierXRef1());
		smw.setSupplierXRef2(w.getSupplierXRef2());
		smw.setSupplierXRef3(w.getSupplierXRef3());
		smw.setUnit(w.getUnit());
		smw.setUserCode12(w.getUserCode12());
		smw.setIsApplicationSubmitted(w.getIsApplicationSubmitted());
		smw.setIsCsdRegistered(w.getIsCsdRegistered());

		return smw;
	}

	public SupplierCodesWork Copy(SupplierCode w) throws Throwable {

		if (w == null)
			throw new Exception("Invalid supplier master work item when cloning.");

		SupplierCodesWork scw = daoManager.getSupplierCodesWorkDao().get(w.getId());
		if (scw == null)
			scw = new SupplierCodesWork();

		scw.setOriginalId(w.getId());
		scw.setCategoryCode1(w.getCategoryCode1());
		scw.setCategoryCode10(w.getCategoryCode10());
		scw.setUserCode1(w.getUserCode1());
		scw.setCategoryCode11(w.getCategoryCode11());
		scw.setUserCode2(w.getUserCode2());
		scw.setCategoryCode12(w.getCategoryCode12());
		scw.setUserCode3(w.getUserCode3());
		scw.setCategoryCode13(w.getCategoryCode13());
		scw.setUserCode4(w.getUserCode4());
		scw.setCategoryCode14(w.getCategoryCode14());
		scw.setUserCode5(w.getUserCode5());
		scw.setCategoryCode15(w.getCategoryCode15());
		scw.setUserCode6(w.getUserCode6());
		scw.setCategoryCode16(w.getCategoryCode16());
		scw.setUserCode7(w.getUserCode7());
		scw.setCategoryCode17(w.getCategoryCode17());
		scw.setUserCode8(w.getUserCode8());
		scw.setCategoryCode18(w.getCategoryCode18());
		scw.setUserCode9(w.getUserCode9());
		scw.setCategoryCode19(w.getCategoryCode19());
		scw.setUserCode10(w.getUserCode10());
		scw.setUserCode11(w.getUserCode11());
		scw.setCategoryCode2(w.getCategoryCode2());
		scw.setCategoryCode20(w.getCategoryCode20());
		scw.setUserCode12(w.getUserCode12());
		scw.setUserCode13(w.getUserCode13());
		scw.setCategoryCode3(w.getCategoryCode3());
		scw.setUserCode14(w.getUserCode14());
		scw.setCategoryCode4(w.getCategoryCode4());
		scw.setUserCode15(w.getUserCode15());
		scw.setCategoryCode5(w.getCategoryCode5());
		scw.setUserCode16(w.getUserCode16());
		scw.setCategoryCode6(w.getCategoryCode6());
		scw.setUserCode17(w.getUserCode17());
		scw.setCategoryCode7(w.getCategoryCode7());
		scw.setUserCode18(w.getUserCode18());
		scw.setCategoryCode8(w.getCategoryCode8());
		scw.setUserCode19(w.getUserCode19());
		scw.setCategoryCode9(w.getCategoryCode9());
		scw.setUserCode20(w.getUserCode20());
		scw.setSystemUser1(w.getSystemUser1());
		scw.setCreatedDateTime(w.getCreatedDateTime());
		// scw.setId(w.getId());
		scw.setIsActive(w.getIsActive());
		scw.setIsDeleted(w.getIsDeleted());
		scw.setIsLocked(w.getIsLocked());
		scw.setSystemUser2(w.getSystemUser2());
		scw.setModifiedDateTime(w.getModifiedDateTime());
		scw.setSupplierId(w.getSupplierId());

		return scw;

	}

	public SupplierMaster copy(SupplierMasterWork smw) throws Throwable{
		
		if (smw == null)
			throw new Exception("Invalid supplier master work item when cloning.");
		
		SupplierMaster sm = daoManager.getSupplierMasterDao().get(smw.getOriginalId());
		if (sm == null) {
			sm = new SupplierMaster();
		}

		sm.setCluster(smw.getCluster());
		sm.setUserCode1(smw.getUserCode1());

		sm.setCompany(smw.getCompany());
		sm.setUserCode2(smw.getUserCode2());
		sm.setSystemUser1(smw.getSystemUser2());
		sm.setCreatedDateTime(smw.getCreatedDateTime());
		sm.setDeliveryInstructions(smw.getDeliveryInstructions());
		sm.setDepartment(smw.getDepartment());
		sm.setUserCode3(smw.getUserCode3());
		// sm.setId(smw.getOriginalId());
		sm.setIsActive(smw.getIsActive());
		sm.setIsDeleted(smw.getIsDeleted());
		sm.setIsLocked(smw.getIsLocked());
		sm.setLastInvoiceDate(smw.getLastInvoiceDate());
		sm.setLastPaymentDate(smw.getLastPaymentDate());
		sm.setSystemUser2(smw.getSystemUser1());
		sm.setModifiedDateTime(smw.getModifiedDateTime());
		sm.setParentNo(smw.getParentNo());
		sm.setPaymentInstrument(smw.getPaymentInstrument());
		sm.setUserCode4(smw.getUserCode4());
		sm.setPaymentTerms(smw.getPaymentTerms());
		sm.setUserCode5(smw.getUserCode5());
		sm.setPrintMessage(smw.getPrintMessage());
		sm.setUserCode6(smw.getUserCode6());
		sm.setRemitType(smw.getRemitType());
		sm.setUserCode7(smw.getUserCode7());
		sm.setUserCode8(smw.getUserCode8());
		sm.setSupplierCode(smw.getSupplierCode());
		sm.setUserCode9(smw.getUserCode9());
		sm.setSupplierHold(smw.getSupplierHold());
		sm.setUserCode10(smw.getUserCode10());
		sm.setSupplierRefId(smw.getSupplierRefId());
		sm.setSupplierRefNo(smw.getSupplierRefNo());
		sm.setSupplierStatus(smw.getSupplierStatus());
		sm.setSupplierType(smw.getSupplierType());
		sm.setUserCode11(smw.getUserCode11());
		sm.setSupplierXRef1(smw.getSupplierXRef1());
		sm.setSupplierXRef2(smw.getSupplierXRef2());
		sm.setSupplierXRef3(smw.getSupplierXRef3());
		sm.setUnit(smw.getUnit());
		sm.setUserCode12(smw.getUserCode12());
		sm.setIsApplicationSubmitted(smw.getIsApplicationSubmitted());
		sm.setIsCsdRegistered(smw.getIsCsdRegistered());

		return sm;
	}

	public SupplierCode copy(SupplierCodesWork w) throws Throwable {

		if (w == null)
			throw new Exception("Invalid supplier codes work item when cloning.");

		SupplierCode sm = daoManager.getSupplierCodesDao().get(w.getOriginalId());
		if (sm == null) {
			sm = new SupplierCode();
		}

		sm.setCategoryCode1(w.getCategoryCode1());
		sm.setCategoryCode10(w.getCategoryCode10());
		sm.setUserCode1(w.getUserCode1());
		sm.setCategoryCode11(w.getCategoryCode11());
		sm.setUserCode2(w.getUserCode2());
		sm.setCategoryCode12(w.getCategoryCode12());
		sm.setUserCode3(w.getUserCode3());
		sm.setCategoryCode13(w.getCategoryCode13());
		sm.setUserCode4(w.getUserCode4());
		sm.setCategoryCode14(w.getCategoryCode14());
		sm.setUserCode5(w.getUserCode5());
		sm.setCategoryCode15(w.getCategoryCode15());
		sm.setUserCode6(w.getUserCode6());
		sm.setCategoryCode16(w.getCategoryCode16());
		sm.setUserCode7(w.getUserCode7());
		sm.setCategoryCode17(w.getCategoryCode17());
		sm.setUserCode8(w.getUserCode8());
		sm.setCategoryCode18(w.getCategoryCode18());
		sm.setUserCode9(w.getUserCode9());
		sm.setCategoryCode19(w.getCategoryCode19());
		sm.setUserCode10(w.getUserCode10());
		sm.setUserCode11(w.getUserCode11());
		sm.setCategoryCode2(w.getCategoryCode2());
		sm.setCategoryCode20(w.getCategoryCode20());
		sm.setUserCode12(w.getUserCode12());
		sm.setUserCode13(w.getUserCode13());
		sm.setCategoryCode3(w.getCategoryCode3());
		sm.setUserCode14(w.getUserCode14());
		sm.setCategoryCode4(w.getCategoryCode4());
		sm.setUserCode15(w.getUserCode15());
		sm.setCategoryCode5(w.getCategoryCode5());
		sm.setUserCode16(w.getUserCode16());
		sm.setCategoryCode6(w.getCategoryCode6());
		sm.setUserCode17(w.getUserCode17());
		sm.setCategoryCode7(w.getCategoryCode7());
		sm.setUserCode18(w.getUserCode18());
		sm.setCategoryCode8(w.getCategoryCode8());
		sm.setUserCode19(w.getUserCode19());
		sm.setCategoryCode9(w.getCategoryCode9());
		sm.setUserCode20(w.getUserCode20());
		sm.setSystemUser1(w.getSystemUser1());
		sm.setCreatedDateTime(w.getCreatedDateTime());
		//sm.setId(w.getOriginalId());
		sm.setIsActive(w.getIsActive());
		sm.setIsDeleted(w.getIsDeleted());
		sm.setIsLocked(w.getIsLocked());
		sm.setSystemUser2(w.getSystemUser2());
		sm.setModifiedDateTime(w.getModifiedDateTime());
		sm.setSupplierId(w.getSupplierId());

		return sm;
	}
	
}

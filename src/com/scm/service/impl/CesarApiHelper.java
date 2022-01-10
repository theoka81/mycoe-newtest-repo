package com.scm.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.cesar.domain.Tb_EmailQueue;
import com.scm.dao.cesar.domain.Tb_SmsQueue;
import com.scm.service.common.BaseUIservice;

@Service("cesarApiHelper")
public class CesarApiHelper extends BaseUIservice {
	
	@Transactional(value="cesarTransactionManager", propagation = Propagation.REQUIRED)
	public void sendMail(String emailAddr, String subject, String body) {
		try {
			Tb_EmailQueue emailQueue = new Tb_EmailQueue();
			emailQueue.setApplicationId(1);
			
			emailQueue.setEmailAccountId(5);
			emailQueue.setReferenceId("");
			emailQueue.setToList(emailAddr);
			emailQueue.setSubject(subject);
			emailQueue.setBody(body);
			emailQueue.setIsHtml(true);
			Date date = new Date();  
	        Timestamp ts=new Timestamp(date.getTime()); 
			emailQueue.setQueueDateTime(ts);
			emailQueue.setHasAttachments(false);
			emailQueue.setFailureCount(3);
			
			daoManager.getEmailDao().save(emailQueue);
			//daoManager.getEmailDao().flush();
		}catch(Throwable th) {
			th.printStackTrace();
		}
	}
	
	@Transactional(value="cesarTransactionManager", propagation = Propagation.REQUIRED)
	public void sendSms(String mobileNo, String text) {
		try {
			Tb_SmsQueue smsQueue = new Tb_SmsQueue();
			smsQueue.setApplicationId(1);
			smsQueue.setSmsAccountId(1);
			smsQueue.setReferenceTypeId(1);
			smsQueue.setReferenceId("1");
			smsQueue.setMobileNumber(mobileNo);
			smsQueue.setTextMessage(text);
			Date date = new Date();  
	        Timestamp ts=new Timestamp(date.getTime()); 
			smsQueue.setQueueDateTime(ts);
			smsQueue.setFailureCount(3);
			
			daoManager.getSmsDao().save(smsQueue);
			//daoManager.getSmsDao().flush();
		}catch(Throwable th) {
			th.printStackTrace();
		}
	}

}

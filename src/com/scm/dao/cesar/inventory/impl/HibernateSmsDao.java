package com.scm.dao.cesar.inventory.impl;

import org.springframework.stereotype.Repository;

import com.scm.dao.cesar.domain.Tb_SmsQueue;
import com.scm.dao.cesar.inventory.SmsDao;
import com.scm.dao.common.impl.HibernateGenericCesarDao;

@Repository
public class HibernateSmsDao extends HibernateGenericCesarDao<Tb_SmsQueue, Integer> implements SmsDao{

}

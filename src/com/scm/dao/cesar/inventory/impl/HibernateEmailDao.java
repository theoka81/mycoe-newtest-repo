package com.scm.dao.cesar.inventory.impl;

import org.springframework.stereotype.Repository;

import com.scm.dao.cesar.domain.Tb_EmailQueue;
import com.scm.dao.cesar.inventory.EmailDao;
import com.scm.dao.common.impl.HibernateGenericCesarDao;

@Repository
public class HibernateEmailDao extends HibernateGenericCesarDao<Tb_EmailQueue, Integer> implements EmailDao{

}

package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.transform.Transformers;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.InventoryDefinition;
import com.scm.dao.domain.SystemUser;
import com.scm.dao.domain.WarehouseDetail;
import com.scm.dao.domain.WarehouseInventoryDefinition;
import com.scm.dao.inventory.InventoryDao;
import com.scm.dao.inventory.WarehouseDao;
import com.scm.dao.inventory.WarehouseInventoryDao;
import com.scm.modal.GenericDropDownBean;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.util.DesEncrypter;

@SuppressWarnings("deprecation")
@Repository
public class HibernateWarehouseInventoryDefinitionsDao extends HibernateGenericDao<WarehouseInventoryDefinition, Long>
		implements WarehouseInventoryDao {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@Transactional

	public List<WarehouseInventoryDefinition> getExistingWarehouseInve(Long warehouseId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("warehouseId", warehouseId));
		crit.add(Restrictions.eq("isActive", true));
		List<WarehouseInventoryDefinition> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}
	
	

	
}

package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.transform.Transformers;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.InventoryDefinition;
import com.scm.dao.domain.WarehouseDetail;
import com.scm.dao.domain.WarehouseInventoryDefinition;
import com.scm.dao.inventory.InventoryDao;
import com.scm.dao.inventory.WarehouseDao;
import com.scm.modal.GenericDropDownBean;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

@SuppressWarnings("deprecation")
@Repository
public class HibernateWarehouseDao extends HibernateGenericDao<WarehouseDetail, Long>
		implements WarehouseDao {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@Transactional

	public List<GenericDropDownBean> getActiveWarehouses() throws Throwable {
		StringBuilder queryStr = new StringBuilder();
		queryStr.append("select i.Id as id, Warehousedescription as name from Warehousedetails i "
				+ " , UserCodes s where s.id=i.Statusid"
				+ "   and i.IsActive=1 and s.Description='Active'");
		
		
		Query query = getSession().createSQLQuery(queryStr.toString()).addScalar("id", new LongType())
				.addScalar("name", new StringType());
	
		
		List<GenericDropDownBean> smList = query.setResultTransformer(Transformers.aliasToBean(GenericDropDownBean.class)).list();
		return smList;
	}

	
	
	

	

}

package com.scm.dao.inventory.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.hibernate.Query;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.transform.Transformers;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.InventoryDefinition;
import com.scm.dao.inventory.InventoryDao;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

@SuppressWarnings("deprecation")
@Repository
public class HibernateInventoryDao extends HibernateGenericDao<InventoryDefinition, Long>
		implements InventoryDao {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@Transactional
	public List<InventoryDefinitionsBean> getInventoryDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable {
		StringBuilder queryStr = new StringBuilder();
		queryStr.append("select i.Id as id, ItemId as itemId,ItemNo as itemNo, "
				+ "ItemDescription as itemDescription,s.Description as itemStatus,st.Description as stockType from InventoryDefinitions I "
				+ " left join UserCodes s on s.id=i.itemStatusId"
				+ " left join UserCodes st on st.id=i.StockTypeId  where i.IsActive=1");
		if (searchSortObj != null) {
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
					queryStr.append(" and Id =" + searchSortObj.getSearchValue() );
			}

			if (StringHelper.isNotEmpty(searchSortObj.getSidx()) && StringHelper.isNotEmpty(searchSortObj.getSord())) {
				if (searchSortObj.getSidx().equalsIgnoreCase("Id")) {
					queryStr.append(" order by Id " + searchSortObj.getSord());
				} else {
					queryStr.append(" order by modifiedDateTime desc");
				}
			} else {
				queryStr.append(" order by modifiedDateTime desc");
			}
		}
		Query query = getSession().createSQLQuery(queryStr.toString()).addScalar("id", new LongType())
				.addScalar("itemId", new LongType())
				.addScalar("itemNo", new StringType())
				.addScalar("itemDescription", new StringType())
				.addScalar("itemStatus", new StringType())
				.addScalar("stockType", new StringType());
		if (pagination != null) {
			if (pagination.getOffset() > 0) {
				query.setFirstResult(pagination.getOffset());
			}
			if (pagination.getSize() > 0) {
				query.setMaxResults(pagination.getSize());
			}
		}
		List<InventoryDefinitionsBean> smList = query.setResultTransformer(Transformers.aliasToBean(InventoryDefinitionsBean.class)).list();
		return smList;
	}

	@SuppressWarnings({ "rawtypes" })
	@Override
	@Transactional
	public int getInventoryDetailsCount(SearchSortContainer searchSortObj) throws Throwable {

		int count = 0;
		StringBuilder queryStr = new StringBuilder();
		queryStr.append(" select count(*) from InventoryDefinitions sm where sm.isActive=1 ");
		if (searchSortObj != null) {
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
					queryStr.append(" and sm.cluster like '%" + searchSortObj.getSearchValue() + "%'");
			}

		}
		Query query = getSession().createSQLQuery(queryStr.toString());
		Integer obj = (Integer) query.uniqueResult();
		if (obj != null) {
			count = obj.intValue();
		}
		return count;
	}

	@Override
	public Long getInventoryDefinitionsCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from InventoryDefinition");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Long, String> getInventoryDefinitionsMap() throws Throwable {

		String qryStr = "select idef.id as id, "
				+ " concat(coalesce(cast(idef.id as java.lang.String), '') , ' ',  coalesce(idef.itemNo, '') , ' ' , coalesce(idef.shortDescription, '')) as textName "
				+ " from  InventoryPricing ip inner join ip.inventoryDefinition idef where ip.price is not null "
				+ " and idef.productFamilyId is not null ";

		Query<Tuple> query = getSession().createQuery(qryStr, Tuple.class);

		Map<Long, String> orginMap = query.getResultList().stream()
				.collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).longValue(),
						tuple -> ((String) tuple.get("textName")).toString().trim()));

		return orginMap;

	}
}

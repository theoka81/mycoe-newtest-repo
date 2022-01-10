package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BbbeeStatusLevelOfContributor;

public interface BbbeeStatusLevelOfContributorsDao extends GenericDao<BbbeeStatusLevelOfContributor, Integer>{

	public BbbeeStatusLevelOfContributor getBbbeeStatusLevelOfContributorByCode(String code) throws Throwable;
}

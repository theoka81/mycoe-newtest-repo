package com.scm.common.cache;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

public class SCMPropertiesLoader extends PropertiesLoaderUtils {
	
	private Properties scmProperties;
	
	private String scmPropFileName;
	
	public Properties getScmProperties() {
		try {
			if(scmProperties == null || scmProperties.size() == 0) {
				scmProperties = loadAllProperties(scmPropFileName);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		return scmProperties;
	}
	
	public void reloadProperties() {
		try {
			scmProperties = loadAllProperties(scmPropFileName);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void setScmProperties(Properties scmProperties) {
		this.scmProperties = scmProperties;
	}

	public String getScmPropFileName() {
		return scmPropFileName;
	}

	public void setScmPropFileName(String scmPropFileName) {
		this.scmPropFileName = scmPropFileName;
	}
	
	

}

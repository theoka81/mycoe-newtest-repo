package com.scm.common.cache;

import org.hibernate.internal.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("scmProperties")
public class SCMProperties {

	private static SCMPropertiesLoader propertiesLoader;

	public static final String[] ON = { "Y", "on", "true", "yes", "1" };
	public static final String[] OFF = { "N", "off", "false", "no", "0" };

	public static String get(String propertyKey) {
		if (propertiesLoader == null) {
			return null;
		}
		String value = propertiesLoader.getScmProperties().getProperty(propertyKey);

		return (StringHelper.isEmpty(value) ? "" : value);
	}

	public static String get(String propertyKey, String defaultValue) {
		if (propertiesLoader == null) {
			return null;
		}
		String value = propertiesLoader.getScmProperties().getProperty(propertyKey);
		return value == null ? defaultValue : value;
	}

	public static SCMPropertiesLoader getPropertiesLoader() {
		return propertiesLoader;
	}

	@Autowired(required = true)
	public void setPropertiesLoader(SCMPropertiesLoader propertiesLoader) {
		SCMProperties.propertiesLoader = propertiesLoader;
	}
	
	public static boolean isOn(String state) {
		if(!isEmpty(state.trim())) {
			for(int i = 0; i < ON.length; i++) {
				if(ON[i].equalsIgnoreCase(state.trim()))
					return true;
			}
		}
		return false;
	}

	public static boolean isEmpty(String value) {
		if(value == null || value.length() == 0) {
			return true;
		}
		return false;
	}
	
	public static void flushAllProperties() {
		propertiesLoader.reloadProperties();
	}
}

package com.gwz.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropertyUtil {

	public static String getProperty(String pro, String key) {

		Properties properties = new Properties();
		
		InputStream stream = MyPropertyUtil.class.getClassLoader().getResourceAsStream(pro);
		try {
			properties.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String property = properties.getProperty(key);
		
		return property;
	}

}

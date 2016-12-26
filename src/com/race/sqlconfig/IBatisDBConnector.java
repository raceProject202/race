package com.race.sqlconfig;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IBatisDBConnector {

	protected static SqlMapClient client;

	static {
		try {
			String resource = "com/race/sqlconfig/SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			System.out.println(resource);
			System.out.println(reader);
			client = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static SqlMapClient getSqlMapInstance(){
		return client;
	}
}

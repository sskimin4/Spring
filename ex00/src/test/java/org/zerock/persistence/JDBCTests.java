package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	@Test
	public void testConnection() throws Exception{
		Class clz = Class.forName("org.mariadb.jdbc.Driver");
		
		Connection con = 
				DriverManager.getConnection("jdbc:mariadb://localhost:3306/book_ex","zerock","zerock");
		
		log.info(con);
		con.close();
	}
	
	
}

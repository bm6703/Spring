package net.websnet.dbtest;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

@Log4j
public class DataSourceTest {
	@Setter(onMethod_=@Autowired)//롬북을 이용하기에 setter, inject도 주입이다
	//@Inject
	private DataSource dataSource;
	
	@Test
	public void testConn() {
		try {
			Connection con = dataSource.getConnection();
			log.info(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

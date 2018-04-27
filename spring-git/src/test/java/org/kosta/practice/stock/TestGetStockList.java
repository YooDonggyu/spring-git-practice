package org.kosta.practice.stock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.practice.model.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class TestGetStockList {
	
	
	@Autowired
	private CustomerService cs;
	
	@Test
	public void testGetStockList() {
		System.out.println(cs.getStockList());
	}
}

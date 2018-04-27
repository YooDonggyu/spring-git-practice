package org.kosta.practice.share;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.practice.model.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring-model.xml")
//@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class TestFindShareListById {

	@Autowired
	private CustomerService cs;
	
	@Test
	public void testFindShareListById() {
		System.out.println(cs.findShareListById("java"));
	}
}

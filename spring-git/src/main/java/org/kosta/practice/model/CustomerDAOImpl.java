package org.kosta.practice.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SqlSessionTemplate template;
	
	@Override
	public CustomerVO login(CustomerVO vo) {
		return template.selectOne("customer.login", vo);
	}
	
}

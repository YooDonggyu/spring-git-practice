package org.kosta.practice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	@Override
	public CustomerVO login(CustomerVO vo) {
		return dao.login(vo);
	}
}

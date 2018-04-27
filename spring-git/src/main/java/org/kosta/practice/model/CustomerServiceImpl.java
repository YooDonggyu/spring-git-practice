package org.kosta.practice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO cdao;
	
	@Autowired
	private StockDAO sdao;
	
	@Autowired
	private ShareDAO hdao;
	
	@Override
	public CustomerVO login(CustomerVO vo) {
		return cdao.login(vo);
	}

	@Override
	public List<StockVO> getStockList() {
		return sdao.getStockList();
	}

	@Override
	public List<ShareVO> findShareListById(String id) {
		return hdao.findShareListById(id);
	}
}

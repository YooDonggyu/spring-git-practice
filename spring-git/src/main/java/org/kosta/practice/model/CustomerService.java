package org.kosta.practice.model;

import java.util.List;

public interface CustomerService {

	CustomerVO login(CustomerVO vo);


	List<StockVO> getStockList();


	List<ShareVO> findShareListById(String id);

}
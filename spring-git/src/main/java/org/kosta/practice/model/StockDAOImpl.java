package org.kosta.practice.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StockDAOImpl implements StockDAO {
	
	@Autowired
	private SqlSessionTemplate template;
	
	@Override
	public List<StockVO> getStockList(){
		return template.selectList("stock.getStockList");
	}
}

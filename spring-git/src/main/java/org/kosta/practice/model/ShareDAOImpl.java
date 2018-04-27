package org.kosta.practice.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShareDAOImpl implements ShareDAO {
	@Autowired
	private SqlSessionTemplate template;
	
	
	@Override
	public List<ShareVO> findShareListById(String id){
		return template.selectList("share.findShareListById", id);
	}
}

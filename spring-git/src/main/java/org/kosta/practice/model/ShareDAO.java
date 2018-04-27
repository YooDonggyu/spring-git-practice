package org.kosta.practice.model;

import java.util.List;

public interface ShareDAO {

	List<ShareVO> findShareListById(String id);

}
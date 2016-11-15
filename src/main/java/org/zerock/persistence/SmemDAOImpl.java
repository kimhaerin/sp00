package org.zerock.persistence;

import org.springframework.stereotype.Repository;
import org.zerock.domain.SmemVO;

@Repository
public class SmemDAOImpl extends AbstractDAO<SmemVO, String> implements SmemDAO {

	public SmemDAOImpl(){
	this.NAME = "org.zerock.dao.SmemMapper";
	}
}

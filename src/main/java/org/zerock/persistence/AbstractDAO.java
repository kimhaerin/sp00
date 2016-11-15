package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.zerock.domain.TestVO;

public abstract class AbstractDAO<E, K> implements GenericDAO<E, K> {

	@Inject
	protected SqlSession sqlSession;

	protected String NAME;

	@Override
	public void create(E vo) throws Exception {

		sqlSession.insert(NAME + ".create", vo);

	}

	@Override
	public E read(K id) throws Exception {
		return sqlSession.selectOne(NAME + ".read", id);

	}

	@Override
	public void update(E vo) throws Exception {
		sqlSession.update(NAME + ".update", vo);

	}

	@Override
	public void delete(K id) throws Exception {
		sqlSession.delete(NAME + ".delete", id);

	}

}

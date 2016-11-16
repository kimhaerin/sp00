package org.zerock.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.SmemVO;
import org.zerock.domain.TestVO;
import org.zerock.persistence.SmemDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })

public class TestDAOTester {

	@Autowired
	private SmemDAO dao;

	// @Test
	// public void testDAO1(){
	// System.out.println(dao);
	// }
	//
	// @Test
	// public void testInsert() throws Exception{
	//
	// TestVO vo = new TestVO();
	// vo.setTname("kjs");
	// dao.create(vo);
	//
	// }
	//
	// @Test
	// public void testRead() throws Exception{
	//
	// TestVO vo = new TestVO();
	// dao.read(2);
	//
	// }

	@Test
	public void memInsert() throws Exception {

		SmemVO vo = new SmemVO();
		vo.setUserid("user06");
		vo.setUserpw("user06");
		dao.create(vo);

	}

	@Test
	public void memRead() throws Exception {
		SmemVO vo = new SmemVO();
		dao.read("user06");
	}

	@Test
	public void memList() throws Exception {
		SmemVO vo = new SmemVO();
		dao.list();
	}

	@Test
	public void memUpdate() throws Exception {
		SmemVO vo = new SmemVO();
		vo.setUserid("qqqq");
		vo.setUserpw("qweqweqweewqewqeqwe");
		dao.update(vo);
	}

	@Test
	public void memDelete() throws Exception {
		SmemVO vo = new SmemVO();
		dao.delete("user06");
	}

}

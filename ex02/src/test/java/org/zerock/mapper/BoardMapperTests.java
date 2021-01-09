package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		log.info("--------------------");
		boardMapper.getList();
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setTitle("Test 테스트");
		vo.setContent("Content 테스트");
		vo.setWriter("HHMIN");
		boardMapper.insert(vo);
		log.info("after insert "+ vo.getBno());
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO vo = new BoardVO();
		vo.setTitle("Testkey 테스트");
		vo.setContent("Contentkey 테스트");
		vo.setWriter("HHMIN");
		boardMapper.insertSelectKey(vo);
		log.info("after insert selectkey "+ vo.getBno());
		
	}

	@Test
	public void testRead() {
		BoardVO vo = boardMapper.read(9);
		log.info("--------------READ-------------");
		log.info(vo);
	}
	
	@Test
	public void testDelete() {
		int count = boardMapper.delete(5);
		log.info("-------------DEL-------------");
		log.info("count: "+count);
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		vo.setTitle("Updated Title");
		vo.setContent("Updated content");
		vo.setWriter("HHMIN");
		vo.setBno(9);
		
		int count = boardMapper.update(vo);
		log.info("-------------UPDATE-------------");
		log.info("count: "+count);
	}
	
}

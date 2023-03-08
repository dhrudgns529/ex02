package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	BoardMapper boardMapper;
	
//	@Test
//	public void testInsert() {
//		BoardVO boardVO = new BoardVO();
//		boardVO.setTitle("새로운 내용");
//		boardVO.setContent("작성한 내용");
//		boardVO.setWriter("user000");
//		
//		boardMapper.insert(boardVO);
//		log.info(boardVO);
//	}
	
//	@Test
//	public void testInsertSelectKey() {
//		BoardVO boardVO = new BoardVO();
//		boardVO.setTitle("새로운 내용2");
//		boardVO.setContent("작성한 내용2");
//		boardVO.setWriter("user03");
//		
//		boardMapper.insertSelectKey(boardVO);
//		
//		log.info(boardVO);
//	}
	
//	@Test
//	public void testList() {
//		List<BoardVO> list =boardMapper.getList();
//		list.forEach(board -> log.info(board));
//	}
	
//	@Test
//	public void testRead() {
//		log.info(boardMapper.read(1L));
//	}
	
//	@Test
//	public void testPaging() {
//		Criteria cri = new Criteria();
//		
//		List<BoardVO> list = boardMapper.getListWithPaging(cri);
//		
//		list.forEach(board -> log.info(board));
//	}
	
	@Test
	public void testSearch() {
		Criteria cri = new Criteria();
		cri.setKeyword("새로");
		cri.setType("TC");
		cri.setPageNum(1);
		List<BoardVO> list = boardMapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
}

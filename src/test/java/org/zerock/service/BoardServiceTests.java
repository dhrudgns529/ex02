package org.zerock.service;

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
public class BoardServiceTests {
	
	@Autowired
	private BoardService boardService;
	
//	@Test
//	public void registerTest() {
//		BoardVO boardVO = new BoardVO();
//		boardVO.setTitle("제목");
//		boardVO.setContent("내용");
//		boardVO.setWriter("글쓴이");
//		
//		boardService.register(boardVO);
//		log.info("생성된 글번호:" + boardVO.getBno());
//	}
	
//	@Test
//	public void getTest() {
//		boardService.get(2L);
//	}
	
//	@Test
//	public void modifyTest() {
//		BoardVO boardVO = new BoardVO();
//		boardVO.setBno(1L);
//		boardVO.setTitle("제목");
//		boardVO.setContent("내용");
//		boardVO.setWriter("글쓴이수정");
//		boardService.modify(boardVO);
//	}
	
//	@Test
//	public void removeTest() {
//		boardService.remove(14L);
//	}
	
	@Test
	public void getListTest() {
		log.info(boardService.getList());
	}
}

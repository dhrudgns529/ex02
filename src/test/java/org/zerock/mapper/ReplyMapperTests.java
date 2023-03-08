package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Autowired
	private ReplyMapper mapper;
	
	private Long[] bnoArr = {28L, 29L, 30L, 31L, 32L};
	
//	@Test
//	public void testCreate() {
//		IntStream.range(0, 10).forEach(i -> {
//			ReplyVO vo = new ReplyVO();
//			
//			vo.setBno(bnoArr[i%5]);
//			vo.setReply("댓글 테스트" + i);
//			vo.setReplyer("replyer" + i);
//			
//			mapper.insert(vo);
//		});
//	}

//	@Test
//	public void testRead() {
//		log.info(mapper.read(1L));
//	}
	
//	@Test
//	public void testDelete() {
//		log.info(mapper.delete(6L));
//	}
//	
//	
//	@Test
//	public void testUpdate() {
//		ReplyVO vo = mapper.read(4L);
//		vo.setReply("Update Reply");
//		log.info(mapper.update(vo));
//	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 31L);
		replies.forEach(reply -> log.info(reply));
	}
}

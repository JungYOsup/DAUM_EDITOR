package com.hk.answerboard.service;

import java.util.List;

import com.hk.answerboard.dtos.AnswerDto;

public interface IAnsService {
	
	//글목록 조회: select문
	public List<AnswerDto> getAllList();
	//글쓰기(새로운글): insert문
	public boolean insertBoard(AnswerDto dto);
	//글조회수:update문
	public boolean readCount(int seq);
	//글상세보기: select문
	public AnswerDto getBoard(int seq);
	//글수정하기: update문
	public boolean updateBoard(AnswerDto dto); 
	//글삭제하기: update문
	
	//글여러개삭제하기: update문 - 트랜젝션처리
	public boolean mulDelBoard(String[] seq);
	
	//답글달기: update문/insert문 - 트랜젝션처리
	public boolean replyBoard(AnswerDto dto); //update와 insert가 한번에 실행되게 하나의 메서드로 정의
	
	public AnswerDto getBoardAjax(int seq);
}

package com.hk.answerboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hk.answerboard.daos.IAnswerDao;
import com.hk.answerboard.dtos.AnswerDto;

@Service
public class AnsService implements IAnsService{

	@Autowired
	private IAnswerDao AnswerDao;
	
	@Override
	public List<AnswerDto> getAllList() {
		return AnswerDao.getAllList();
	}

	@Override
	public boolean insertBoard(AnswerDto dto) {
		return AnswerDao.insertBoard(dto);
	}

	@Override
	public boolean readCount(int seq) {
		return AnswerDao.readCount(seq);
	}

	@Override
	public AnswerDto getBoard(int seq) {
		return AnswerDao.getBoard(seq);
	}

	@Override
	public boolean updateBoard(AnswerDto dto) {
		return AnswerDao.updateBoard(dto);
	}
	
//	@Transactional
	@Override
	public boolean mulDelBoard(String[] seq) {
		return AnswerDao.mulDelBoard(seq);
	}
	
//	@Transactional
	@Override
	public boolean replyBoard(AnswerDto dto) {
		int count=0;
		AnswerDao.replyBoardUpdate(dto.getSeq());
		count=AnswerDao.replyBoardInsert(dto);
		return count>0?true:false;
	}

	@Override
	public AnswerDto getBoardAjax(int seq) {
		return AnswerDao.getBoardAjax(seq);
	}
	
}

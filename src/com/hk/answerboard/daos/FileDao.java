package com.hk.answerboard.daos;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.answerboard.dtos.FileDto;


@Repository
public class FileDao implements IFileDao{
	
	@Autowired
	SqlSessionTemplate SqlSession;
	private String namespace="com.hk.fileupload.";
	
	@Override
	public boolean fileupload(FileDto dto) {
		int count=0;
		count=SqlSession.insert(namespace+"insertFile",dto);
		return count>0?true:false;
	}

	@Override
	public List<FileDto> fileList() {
		return SqlSession.selectList(namespace+"listFile");
	}

	@Override
	public FileDto getFile(int seq) {
		return SqlSession.selectOne(namespace+"getFile",seq);
	}

}

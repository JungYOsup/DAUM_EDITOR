package com.hk.answerboard.daos;

import java.util.List;

import com.hk.answerboard.dtos.FileDto;


public interface IFileDao {
	
	public boolean fileupload(FileDto dto);
	public List<FileDto> fileList();
	public FileDto getFile(int seq);
}

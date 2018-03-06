package com.hk.answerboard.dtos;

import java.io.Serializable;
import java.sql.Date;

public class FileDto implements Serializable{
	
	private static final long serialVersionUID = -7279690439374784775L;
	private int seq;
	private String originalName;
	private String modifyName;
	private long filesize;
	private Date f_regdate;
	private String f_delflag;
	
	
	public FileDto() {
	}
	
	public FileDto(int seq, String originalName, String modifyName, long filesize, Date f_regdate, String f_delflag) {
		super();
		this.seq = seq;
		this.originalName = originalName;
		this.modifyName = modifyName;
		this.filesize = filesize;
		this.f_regdate = f_regdate;
		this.f_delflag = f_delflag;
	}


	public int getSeq() {
		return seq;
	}


	public void setSeq(int seq) {
		this.seq = seq;
	}


	public String getOriginalName() {
		return originalName;
	}


	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}


	public String getModifyName() {
		return modifyName;
	}


	public void setModifyName(String modifyName) {
		this.modifyName = modifyName;
	}


	public long getFilesize() {
		return filesize;
	}


	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}


	public Date getF_regdate() {
		return f_regdate;
	}


	public void setF_regdate(Date f_regdate) {
		this.f_regdate = f_regdate;
	}


	public String getF_delflag() {
		return f_delflag;
	}


	public void setF_delflag(String f_delflag) {
		this.f_delflag = f_delflag;
	}

	@Override
	public String toString() {
		return "FileDto [seq=" + seq + ", originalName=" + originalName + ", modifyName=" + modifyName + ", filesize="
				+ filesize + ", f_regdate=" + f_regdate + ", f_delflag=" + f_delflag + "]";
	}
	
	
	
	
	
	
	

}

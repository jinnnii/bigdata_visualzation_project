package com.kej.bitc.dto;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo;
	private String title;
	private String content;
	private String createId;
	private String createDate;
	private String updateid;
	private String updateDate;
	private int hitCnt;
	
}

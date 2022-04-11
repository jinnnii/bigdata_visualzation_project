package com.kej.demo1.domain;

import java.util.List;

import lombok.Data;

@Data
public class BoardVO {
	private int bno;
	private String title;
	private String writer;
	private String content;
	private List<FileVO> fileList;
}

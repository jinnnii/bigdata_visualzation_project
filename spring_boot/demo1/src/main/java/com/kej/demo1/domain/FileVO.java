package com.kej.demo1.domain;

import lombok.Data;

@Data
public class FileVO {
	private int fno;
	private int bno;
	private String savefolder;
	private String originfile;
	private String savefile;
	private String filetype;
}

package com.kej.boardsystem01.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageVO {
	private int totPage; //total page
	private int blockSize;
	private int startPage;
	private int endPage;
	private int curPage;
	
	public PageVO(int count, int curPage, int pageSize) {
		totPage = count/pageSize+(count%pageSize==0?0:1);
		blockSize=3;
		startPage = ((curPage-1)/blockSize)*blockSize+1;
		endPage = startPage+blockSize-1;
		
		if(endPage>totPage) endPage= totPage;
		setBlockSize(blockSize);
		setCurPage(curPage);
		setEndPage(endPage);
		setStartPage(startPage);
		setTotPage(totPage);
	}
	
}

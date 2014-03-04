package com.fudan.rserp.util;

import java.util.List;

public class PageSet {
	private int score;//质量检测项目用于存放当页分数的变量
	private int totalSize;//总数
	private int totalPage;//总页数	private int currPage = 1;//当前页	private int prePage;//上一页	private int nextPage;//下一页	private int pageSize = 10;//单页数	private int turnPage = 1;//跳转页	@SuppressWarnings("rawtypes")
	private List resultList;//返回结果

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
		this.totalPage = this.totalSize / this.pageSize;
		if((this.totalSize % this.pageSize) > 0)
			this.totalPage = this.totalPage + 1;
		if(this.totalSize == 0){
			this.currPage = 1;
			this.prePage = 0;
			this.nextPage = 0;
		}else{
			if(this.currPage == 0)
				this.currPage = 1;
		}
	}

	public int getTotalPage() {
		if(totalSize == 0){	
			return 1;
		}else{
			return totalPage;
		}
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getPrePage() {
		if(this.currPage == 0)
			this.prePage = 0;
		else if(this.currPage == 1)
			this.prePage = 1;
		else
			this.prePage = this.currPage - 1;
		
		return this.prePage;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		if(this.currPage == 0)
			this.nextPage = 0;
		else
			this.nextPage = this.currPage + 1;
		
		if(this.totalPage < this.nextPage)
			this.nextPage = this.totalPage;
		
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTurnPage() {
		return turnPage;
	}

	public void setTurnPage(int turnPage) {
		this.turnPage = turnPage;
		if(turnPage > this.totalPage)
			this.turnPage = this.totalPage;
	}

	@SuppressWarnings("rawtypes")
	public List getResultList() {
		return resultList;
	}

	@SuppressWarnings("rawtypes")
	public void setResultList(List resultList) {
		this.resultList = resultList;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

}

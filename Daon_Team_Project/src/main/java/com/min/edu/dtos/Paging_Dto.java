package com.min.edu.dtos;

import java.io.Serializable;

public class Paging_Dto implements Serializable{

	private static final long serialVersionUID = -3672200237439199799L;
	private int pageList; // 출력할 페이지 번호갯수  [화면에 뜰 페이지 갯수 5=<1,2,3,4,5>]
	private int index;    // 출력할 페이지 번호 1,2,3페이지 [내가 보고 있는 페이지의 번호] 1~5 6~10 
	private int pageNum;  // 출력할 페이지 시작 번호 [1,6,11 처음 시작페이지를 알수 있는 번호] 1 6
	private int listNum;  // 출력할 리스트 갯수 [ 한 페이지에 보일 게시글의 수 ]
	private int total;    // 리스트의 총 갯수 [ 총 게시글의 수]
	
	//dto를 session으로 만듬, new가 안됨 , 첫번째에 new가 되면 기본 세팅으로 만들어줌
	//그걸 session으로 만들어서 static처럼 사용
	//나중에 이걸 bean으로 만들어서 사용
	// ↓ 연산자 블럭(static 연산 생성자)
	{
		pageList = 5;
		index = 0;
		pageNum = 1;
		listNum = 5;
	}

	public Paging_Dto() {
		super();
	}
	
	//화면에서 받는 값은 String이라서 타입을 String으로 씀
	public Paging_Dto(String index,String pageNum, String listNum) {
		if (index != null) {
			this.index = Integer.parseInt(index);
		}
		if (pageNum != null) {
			this.index = Integer.parseInt(index);
		}
		if (listNum != null) {
			this.index = Integer.parseInt(index);
		}
	}
	
	//글 리스트중 시작 번호
	public int getStart() {
		return index*listNum+1;
	}
	//글 리스트중 끝 번호
	public int getEnd() {
		return (index*listNum)+listNum;
	}
//	<1~5><6~10><11~15> 1,2,3,4,5
	//카운트
	public int getCount() {
		// temp : 남은 전체 글의 갯수전체글에서 앞에 쓰여진 글을 뺀 글의 수 / 음수가 나오면 마지막 페이지 
		//         전체글수 - 출력리스트*(출력할 페이지의 시작번호-1):  ex)90-5*(1-1)  / 90-5(6-1)=65개의 글/  
		//          75  - 5*(1-1) = temp :  75
		//      	75  - 5*(6-1) = temp : 50
		//          75   - 5(11-1) = temp: 25
		int temp = total-listNum*(pageNum-1);
		//          5/5 = 1
		       //  6  / 5   min =1
              
		int min = temp/listNum; 
		// 15
		// 10
		// 5
		//글이 딱 떨어지지않고 1개때문에 페이지가 1 늘어남
		         //min = 6로 바뀜
		      
		if (temp%listNum != 0) {
			min++;
		}
		
		// count : for문이 돌아야할 반복 횟수 
		int count = 0; 
		//글의 첫번째 페이지가 5개 미만일때
		//    1 <=  5 
		if (temp <= listNum) { 
			count = pageNum;
		}else if (min<=pageList) {
			      // 5 + 6-1  = 10 
			count = min+pageNum-1;
		}else {         
			count = pageList+pageNum-1;
			        // 5     +1 -1 = 5
		}
		return count;
	}

	public int getPageList() {
		return pageList;
	}

	public void setPageList(int pageList) {
		this.pageList = pageList;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getListNum() {
		return listNum;
	}

	public void setListNum(int listNum) {
		this.listNum = listNum;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Paging_Dto [화면에 뜰 페이지 갯수=" + pageList + ", 내가 보고 있는 페이지의 번호=" + index + ", 처음 시작페이지를 알수 있는 번호=" + pageNum + ", 한 페이지에 보일 게시글의 수=" + listNum
				+ ", 총 게시글의 수=" + total + "]";
	}
	
	
	
}

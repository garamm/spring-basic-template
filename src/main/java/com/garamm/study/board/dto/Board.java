package com.garamm.study.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Board {

	int seq;
	String title;
	String contents;
	String insertDate;
	String updateDate;
	String deleteYn;
	
	String type;
	String searchStr;
	String startDate;
	String endDate;
	
}

package com.onerivet.deskbook.models.payload;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class RequestHistoryDto {
	
	
	private int id;
	
	private String name;
	
	private LocalDate requestDate;
	
	private  LocalDate requestFor;
	
	private String emailId;
	
	private FloorDto floorNo;
	
	private String deskNo;
	
	private int Status;
	
	
	

}

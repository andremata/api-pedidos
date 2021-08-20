package com.example.demo.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Request {
	
	private Long id;
	private String subject;
	private String description;
	private Date criationDate;
}

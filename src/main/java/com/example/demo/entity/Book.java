package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="bktab")
public class Book
{
	@Id
	private Integer bid;
	private String bname;	
	
	public Book()
	{		
	}
	public Book(Integer bid, String bname)
	{
		this.bid=bid;
		this.bname=bname;		
	}
}
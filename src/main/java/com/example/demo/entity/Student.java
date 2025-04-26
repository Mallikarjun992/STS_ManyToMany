package com.example.demo.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="stdtab")
public class Student
{
	@Id
	private Integer sid;
	private String sname;
	
	@ManyToMany
	@JoinTable(name="stbktab",
	joinColumns = @JoinColumn(name="sidFk"),
	inverseJoinColumns = @JoinColumn(name="bidFk"))
	private Set<Book> bobs;
	public Student()
	{		
	}
	public Student(Integer sid, String sname, Set<Book> s1)
	{
		this.sid=sid;
		this.sname=sname;
		this.bobs=s1;
	}
}
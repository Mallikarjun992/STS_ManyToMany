package com.example.demo.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner
{
	@Autowired	
	private StudentRepository srepo;
	
	@Autowired
	private BookRepository brepo;
	
	@Override
	public void run(String... args) throws Exception
	{
		Book bk1 = new Book(50,"DS");
		Book bk2 = new Book(60,"SB");
		Book bk3 = new Book(70,"HB");
		
		brepo.save(bk1);
		brepo.save(bk2);
		brepo.save(bk3);
		
		Set<Book> s1 = Set.of(bk1,bk3);
		Set<Book> s2 = Set.of(bk2,bk3);
		
		Student st1 = new Student(101,"SAM",s1);
		Student st2 = new Student(102,"JHON",s2);
		
		srepo.save(st1);
		srepo.save(st2);
	}
}
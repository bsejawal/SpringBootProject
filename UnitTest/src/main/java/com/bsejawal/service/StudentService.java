package com.bsejawal.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bsejawal.dao.IStudent;

public class StudentService {
	
	@Autowired
	IStudent student;
	public int getStudentCount(){
		int count2 = 2;
		return studentCountHelper()+count2;
	}
	
	public int studentCountHelper(){
		System.out.println("reached inside");
		return 4;
	}
}

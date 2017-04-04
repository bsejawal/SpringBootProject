package com.bsejawal.dao;

import org.springframework.stereotype.Repository;

import com.bsejawal.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface IStudent extends JpaRepository<Student, Long> {

}

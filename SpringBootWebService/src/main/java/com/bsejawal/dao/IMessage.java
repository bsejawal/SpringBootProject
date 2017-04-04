package com.bsejawal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bsejawal.entities.Message;


@Repository
public interface IMessage extends JpaRepository<Message, Integer>{
	

}

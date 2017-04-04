package com.bsejawal.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bsejawal.spring.aop.service.ShapeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
//    	ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/bsejawal/spring/aop/bean/xmlfile/beans.xml");
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/bsejawal/spring/aop/bean/xmlfile/beans.xml");
    	
//    	Person person = context.getBean("person", Person.class);
//    	System.out.println(person);
//    	person.speak();
//        System.out.println( "Hello World!" );
    	
    	
    	ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
    	System.out.println(shapeService.getCircle().getName());
    	
    	((ClassPathXmlApplicationContext) context).close();
    }
}

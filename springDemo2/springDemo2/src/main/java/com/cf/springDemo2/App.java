package com.cf.springDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext actx=new ClassPathXmlApplicationContext("spring-mybean.xml");
    	Emp e=(Emp) actx.getBean("emp");
    	System.out.println(e);
    }
}

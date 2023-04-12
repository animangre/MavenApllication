package com.soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.beans.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/soft/cnfg/applicationContext.xml");
        System.out.println("IOC container started......");
        
        Person genrator = (Person) context.getBean("p1");
        System.out.println(genrator);
    }
}

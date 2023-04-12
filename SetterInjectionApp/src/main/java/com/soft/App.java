package com.soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.beans.WelcomeMessageGenrator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/soft/cnfg/applicationContext.xml");
    	System.out.println("IOC Container Started......");
    	
    	WelcomeMessageGenrator generator =  (WelcomeMessageGenrator) context.getBean("messageGenerator");
    	System.out.println("Message::"+generator.messageGenerator("Ganesh"));
    }
}

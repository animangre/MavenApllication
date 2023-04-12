package com.soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.beans.WelcomeMessageGenerator;

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
    	
    	WelcomeMessageGenerator generator = (WelcomeMessageGenerator) context.getBean("messageGenerator");
    	System.out.println("Message::"+generator.messageGenerator("Ganesh"));
    }
}

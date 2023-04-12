package com.soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.beans.Welcome;

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
        Welcome genrator = (Welcome) context.getBean("q");
        System.out.println( genrator);
        
    }
}

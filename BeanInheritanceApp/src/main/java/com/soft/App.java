package com.soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.beans.Mobile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/soft/cnfg/applicationContext.xml");
        System.out.println("IOC container started.........");
        Mobile mo = (Mobile) context.getBean("mobile1");
        System.out.println(mo.hashCode());
        System.out.println(mo);
        Mobile mo1 = (Mobile) context.getBean("mobile1");
        System.out.println(mo1.hashCode());
        System.out.println(mo1);
    }
}

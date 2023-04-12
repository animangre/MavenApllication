package com.soft;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.soft.bean.WelcomeMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource resource = new ClassPathResource("com/soft/cfgn/applicationContext.xml");
//        
//      //  start ioc
////        XmlBeanFactory factory = new XmlBeanFactory(resource);
        BeanFactory factory = new XmlBeanFactory(resource);
//    	ApplicationContext factory = new ClassPathXmlApplicationContext("com/soft/cfgn/applicationContext.xml");
        System.out.println("ioc container started......");
        
        WelcomeMessage message = (WelcomeMessage) factory.getBean("wlcmsg");
        System.out.println(message.showmessage());
    }
}

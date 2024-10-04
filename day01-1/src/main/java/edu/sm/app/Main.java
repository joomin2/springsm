package edu.sm.app;

import edu.sm.cust.service.CustService;
import edu.sm.dto.Cust;
import edu.sm.frame.SMService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        SMService<String, Cust> service = null;
        //형변환을 하지않으면 object 타입으로 나온다
        service = (SMService<String, Cust>) factory.getBean("custService");
        service.remove("id01");

    }
}
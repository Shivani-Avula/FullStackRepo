package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbeans.NameGenerator;

public class DependencyInjectionTest {
    public static void main(String[] args) {
    	FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");

        NameGenerator generator = (NameGenerator) ctx.getBean("nm");
        String result = generator.showName("hello");
        System.out.println("Result: " + result);
        ctx.close();
    }
}

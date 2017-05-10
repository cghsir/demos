package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cghsir.dubbo.demo.DemoService;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
 
        DemoService demoService = (DemoService)context.getBean("demoService"); // ��ȡԶ�̷������
        String hello = demoService.sayHello("world"); // ִ��Զ�̷���
 
        System.out.println( hello ); // ��ʾ���ý��
	}
}

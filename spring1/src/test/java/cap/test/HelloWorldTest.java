package cap.test;

import cap.service.HelloWorld;
import cap.service.impl.HelloWorldImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void testSayhi(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.sayHi("赵春华"));
    }

    @Test
    public void testSayhi2(){
        HelloWorld helloWorld = new HelloWorldImpl();
        System.out.println(helloWorld.sayHi("zch330"));
    }

}

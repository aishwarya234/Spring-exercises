package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotations.Customer;;

public class CustomerApplication {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("annotations/SpringAnnotation.xml");
		Customer c=ctx.getBean("cust",Customer.class);
		
		System.out.println(c.getCode()+" "+c.getName());
	}
}

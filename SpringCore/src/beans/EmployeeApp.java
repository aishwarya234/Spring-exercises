package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Employee e=(Employee)ctx.getBean("std1");
		//e.setEmpid(250);
		e.setEmpname("Aishwarya");
		System.out.println(e.getEmpid()+" "+e.getEmpname());
		Employee e1=(Employee)ctx.getBean("std1");
		System.out.println(e1.getEmpid()+" "+e1.getEmpname()+e1.getSkills());
	}
}

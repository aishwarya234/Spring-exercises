package mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import beans.Employee;

@Repository
public class EmployeeDaoImpl {

public List<Employee>getEmpls(){
	List<Employee> emplist=new ArrayList<Employee>();
	emplist.add(new Employee(101,"aaaa",50000));
	emplist.add(new Employee(102,"bbb",60000));
	emplist.add(new Employee(103,"cccc",70000));
	return emplist;
	
}
}

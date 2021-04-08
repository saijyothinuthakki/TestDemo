import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DeleteEmpRecord {
	
	public static void main(String[] args)
	{
		//ApplicationContext as IOC Container
		
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		
		EmployeeDAO employeedao = (EmployeeDAO)applicationContext.getBean("empdao");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		
		int id=sc.nextInt();
		
		Employee emp=new Employee();
		
	     emp.setId(id);
		employeedao.deleteemp(emp);
		
		System.out.println("Employee record "+id+ " is deletd succsesfully");
		
		
		
	}


}

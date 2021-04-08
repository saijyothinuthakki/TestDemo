import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DisplayEmpbyId {
	
	public static void main(String[] args)
	{
		//ApplicationContext as IOC Container
		
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		
		EmployeeDAO employeedao = (EmployeeDAO)applicationContext.getBean("empdao");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		
		int id=sc.nextInt();
		
		Employee emp=employeedao.displayempbyid(id);
		
		System.out.println("Employee Id:"+emp.getId());
		System.out.println("Employee name:"+emp.getName());
		System.out.println("Employee gender:"+emp.getGender());
		System.out.println("Employee department:"+emp.getDepartment());
		System.out.println("Employee salary:"+emp.getSalary());
		
		
		
		
		
	   
		
		
		
	}

}

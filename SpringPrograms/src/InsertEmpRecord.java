import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class InsertEmpRecord {
	
	public static void main(String[] args)
	{
		//ApplicationContext as IOC Container
		
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		
		EmployeeDAO employeedao = (EmployeeDAO)applicationContext.getBean("empdao");
		
		Employee emp=new Employee();
		
		emp.setName("N.NAGA LAKSHMI");
		emp.setGender("female");
		emp.setDepartment("SSC");
		emp.setSalary(25000.00);
		
		employeedao.insertemp(emp);
		
		System.out.println("Employee Record Inserted Successfully");
		
		
	}

}

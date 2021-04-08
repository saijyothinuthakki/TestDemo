import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UpdateEmpRecord {
	
	public static void main(String[] args)
	{
		//ApplicationContext as IOC Container
		
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		
		EmployeeDAO employeedao = (EmployeeDAO)applicationContext.getBean("empdao");
		
		Employee emp=new Employee();
		
		emp.setId(1);
		emp.setName("SAI JYOTHI");
		emp.setGender("female");
		emp.setDepartment("aeronautical");
		emp.setSalary(50000);
		
		
		employeedao.updateemp(emp);
		
		System.out.println("Employee Record Inserted Succesfully");
		
	}

}

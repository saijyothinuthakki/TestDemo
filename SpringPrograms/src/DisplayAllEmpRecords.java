import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DisplayAllEmpRecords {
	
	public static void main(String[] args) {
	
	ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/applicationContext.xml");
	
	EmployeeDAO employeedao = (EmployeeDAO)applicationContext.getBean("empdao");
	
	List<Employee> list= employeedao.displayall();
	
	System.out.println("Displaying All Emp Records");
	
	int i=1;
	
	for(Employee emp: list) {
		
		System.out.println("*****Employee Records"+i+"*****");
		System.out.println("Employee Id:"+emp.getId());
		System.out.println("Employee name:"+emp.getName());
		System.out.println("Employee gender:"+emp.getGender());
		System.out.println("Employee salary:"+emp.getSalary());
		System.out.println("Employee Department:"+emp.getDepartment());
		
		
		i++;
	}
	
	
	
	
	
	
	
	
	
	}
	

}

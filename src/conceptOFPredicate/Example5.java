package conceptOFPredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Example5 {

	public static void main(String[] args) 
	{
		ArrayList<Employee> l= new ArrayList<Employee>();
		l.add(new Employee("pavin", 10000));
		l.add(new Employee("ashish", 20000));
		l.add(new Employee("chnadu", 30000));
		l.add(new Employee("pramod", 40000));
		l.add(new Employee("mama", 50000));
		Predicate<Employee>p=e->e.salary>30000;
		for (Employee e1 : l) {
			
			if(e1.salary>30000)
			{
				System.out.println(e1.name+":"+e1.salary);
			}
		}

	}

}



class Employee
{
	String name;
	double salary;
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
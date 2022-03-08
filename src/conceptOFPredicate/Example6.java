package conceptOFPredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Example6 {

	public static void main(String[] args) 
	{
		ArrayList<Employee> l= new ArrayList<Employee>();
		l.add(new Employee("pavin", 10000));
		l.add(new Employee("ashish", 20000));
		l.add(new Employee("chnadu", 30000));
		l.add(new Employee("pramod", 40000));
		l.add(new Employee("mamamama", 50000));
		// to many condition are checked by just one line of code
		Predicate<Employee>p=e->e.salary>30000 && e.name.length()>3 && e.name.length()<10;
		for (Employee e1 : l) {
			
			if(p.test(e1))
			{
				System.out.println(e1.name+":"+e1.salary);
			}
		}

	}

}



class Employee1
{
	String name;
	double salary;
	Employee1(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
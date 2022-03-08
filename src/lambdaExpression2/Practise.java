package lambdaExpression2;

public class Practise 
{
	
	
     //static i I=()->System.out.println("implementation of interface m1 method");

	public static void main(String[] args) 
	{
		
		
		pravin p= Employee::new;
		Employee e=p.get("pravin");
		
		
	}

}
interface pravin
{
	public Employee get(String s);
	//public Employee get();
	
}
class Employee
{
	Employee(String s)
	{
		System.out.println("1--argument constructor "+ s);
	}
}
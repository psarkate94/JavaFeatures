package ConstructorReference;

public class Example3 {

	public static void main(String[] args) 
	{
		pravin p=student::new;
		student s= p.get("pravin");
		//student s= p.get();
		

	}

}
interface pravin
{
	public student get(String s);
	//public student get();
}
class student
{
	student()
	{
		System.out.println("0-argument cons");
	}
	student(String s)
	{
		System.out.println("1- argument cons");
	}
}
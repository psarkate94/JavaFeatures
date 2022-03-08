package lambdaExpression;

public class Example1 implements it
{

	@Override
	public void m2() 
	{
		System.out.println("overriding interface mehtod in child class");
		
	}
	public static void m1()
	{
		System.out.println("child class m1 method");
	}
	public static void main(String [] args)
	{
		System.out.println("child  main mehtod");
		Example1 m= new Example1();
		m.m2();
		m.m1();
	}

}

interface it
{

	public void m2();
	public static void m1()
	{
		System.out.println("interface static m1 method");
	}
	public static void main(String [] args)
	{
		System.out.println("interface main mehtod");
	}
}
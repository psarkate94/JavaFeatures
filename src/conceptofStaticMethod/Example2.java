package conceptofStaticMethod;

public class Example2
{

	public static void main(String[] args) 
	{
		// Without implements keyword 
		b.m1();

	}

}
interface b
{
	static void m1()
	{
		System.out.println("static mehtod of interface");
	}
}
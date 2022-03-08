package conceptofStaticMethod;

public class Example1 implements a 
{
        //With implements keyword 

	public static void main(String[] args) 
	{
		
		String s=a.m1();
		System.out.println(s);

	}

}
interface a
{
	static String  m1()
	{
		System.out.println("static mehtod of interface");
		return "xgchv";
	}
}
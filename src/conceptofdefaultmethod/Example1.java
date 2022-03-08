package conceptofdefaultmethod;



public class Example1 implements it
{
	public void m1()
	{
		System.out.println("Implementation of m1 method");
	}
	public void m2()
	{
		System.out.println("Implementation of m2 method");
	}

	public static void main(String[] args)
	{
		Example1 v= new Example1();

		v.m1();
		v.m2();
		//v.m3();
	}
	
}
interface it
{
	public void m1();
	public void m2();
	//public void m3();// if we add this method after implementation then we will get CE
	
	// to avoid this we can use default method concept
	/*default void m3()
	{
		System.out.println("default method");
	}*/
	
}
package conceptofdefaultmethod;

public class Example4 implements left,right
{
	
	public void m1()
	{
		//System.out.println("overridding m1 method");
		// now i don't want to override m1 method i want to call letf  specific method
		left.super.m1();
		System.out.println(left.a);
		//now i want to call letf  specific method
		right.super.m1();
	}
	

	public static void main(String[] args) 
	{
		Example4 v= new Example4();
		v.m1();
		
	}

}
interface left
{
	static int a=10;
	default void m1()
	{
		System.out.println("Left m1 emthod");
	}
	
}
interface right
{
	default void m1()
	{
		System.out.println("Right m1 emthod");
	}
	
}
package conceptofdefaultmethod;

// overridding Default method
public class Example2 
{
	 default void m1()// modifier should be public while overridding default method replace default with public 
	{
		System.out.println("overridding default method");
	}

	public static void main(String[] args) 
	{
		
		Example2 v= new Example2();
		v.m1();
	}

}
interface it1
{
	default void m1()
	{
		System.out.println("default method ");
	}
}
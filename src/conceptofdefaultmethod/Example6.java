package conceptofdefaultmethod;

public class Example6 implements a,b
{

	public void p()
	{
		a.super.p();
		b.super.p();
		
	}
	public static void main(String[] args) 
	{
		Example6 e= new Example6();
		e.p();

	}

}
interface a
{
	default void p()
	{
		System.out.println("default method of interface a");
	}
}
interface b
{
	default void p()
	{
		System.out.println("default method of interface b");
	}
}
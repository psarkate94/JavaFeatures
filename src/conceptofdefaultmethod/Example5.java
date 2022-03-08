package conceptofdefaultmethod;

public class Example5 implements a1
{
	public void m3()
	{
		System.out.println("overridding m3  method");
		
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example5 v= new Example5();
		v.m3();
		v.m1();
		a1.m4();
		
		
		
	}

}
interface a1
{
	default void m1(){System.out.println("a1 default method");}
	abstract void m3();
	public static void m4()
	{
		System.out.println("static method");
	}
	
	
}

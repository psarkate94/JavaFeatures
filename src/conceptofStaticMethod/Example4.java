package conceptofStaticMethod;

public class Example4 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pravin p= ()->System.out.println("ZKSFJhijfghj");
		p.m1();
		p.m3();
		pravin.m2();
	pravin.main(null);
	}

}
interface pravin
{

	abstract void m1();
	static void m2()
	{
		System.out.println("static method m2");
	}
	default void m3()
	{
		System.out.println("default method");
	}
	public static void main(String[] args)
	{
		System.out.println("interface main method");
	}
}
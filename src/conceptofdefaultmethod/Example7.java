package conceptofdefaultmethod;

public class Example7 implements f
{
	public String m2()
	{
		System.out.println("overrided m2 method");
		return "pravin";
	}
	public void m3()
	{
		System.out.println("override m3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example7 v= new Example7();
		v.m2();
		v.m3();
		v.m1();
	}

}

interface f
{
	default String  m1()
	{
		System.out.println("default method of interface f");
		return "pravin";
	}
	 void m2();
	 void m3();
	
}
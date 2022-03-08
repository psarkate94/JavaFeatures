package conceptofStaticMethod;

public class Example5 {

	public static void main(String[] args) {
		// all r static so need to define inside class 
		it.m1();
		it.m2();
		it.m3();
		it.m4();
		System.out.println(it.a);

	}

}
interface it
{
	int a=10;
	public static void m1()
	{
		int a=10;
		System.out.println("m1 static interface method");
	}
	public static void m2()
	{
		System.out.println("m2 static interface method");
	}
	public static void m3()
	{
		System.out.println("m3 static interface method");
	}
	public static void m4()
	{
		System.out.println("m4 static interface method");
	}
}
package conceptofStaticMethod;


//note: scope of static method of interface is within interface only so we can't override static method to implementation class
public class Scopeofstaticmethodofimterface implements it1,it2
{
	public static void m1()
	{
		System.out.println("class static method");
	}

	public static void main(String[] args)
	{
		Scopeofstaticmethodofimterface v= new Scopeofstaticmethodofimterface();
		v.m1();

	}

}

interface it1
{
	public static void m1()
	{
		System.out.println("it static method");
	}
}
interface it2
{
	public static void m1()
	{
		System.out.println("it2 static method");
	}
}
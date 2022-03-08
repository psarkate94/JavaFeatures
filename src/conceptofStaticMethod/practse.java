package conceptofStaticMethod;

public class practse implements f
{

	public void m1()
	{
		System.out.println("override method");
	}
	public static void main(String[] args) 
	{
		practse v= new practse();
		v.m1();
		//v.main(args);
	}

}
interface f
{
	public void m1();
	public static void main(String[] args)
	{
		System.out.println("interface main method");
	}
}
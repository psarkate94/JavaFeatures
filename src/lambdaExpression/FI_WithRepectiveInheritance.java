package lambdaExpression;
@FunctionalInterface
public interface FI_WithRepectiveInheritance 
{
	public void m1();

}
interface a extends FI_WithRepectiveInheritance
{
	
}

class B implements a

{
	public void m1()
	{
		System.out.println("m1 method");
	}
	public static void main(String [] args)
	{
		System.out.println("main mehtod");
	}
}

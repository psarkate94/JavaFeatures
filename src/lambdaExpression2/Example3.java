package lambdaExpression2;

public class Example3 
{

	public static void main(String[] args) 
	{
		
		it1 t=( a, b)-> a+b;
		System.out.println("Addition of two number is:"+t.add(10, 20));
	
	}

	
}
interface it1
{
	public int add(int a,int b);
}
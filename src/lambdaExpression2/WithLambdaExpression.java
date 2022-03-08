package lambdaExpression2;

public class WithLambdaExpression 
{
	
	
	public static void main(String[] args) 
	{
		it i=()->System.out.println("hello --by Lambda Expression");
		i.m1();
	}

	
}
interface it 
{
	public void m1();

}

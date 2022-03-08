package lambdaExpression2;

public class WithoutLambdaExpression implements WithoutLambda
{
	public void m1()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) 
	{
		/*WithoutLambdaExpression n= new WithoutLambdaExpression();
		n.m1();*/
		
// parent can hold child reference 
		WithoutLambda p= new WithoutLambdaExpression();
		p.m1();
	}
}
interface WithoutLambda 
{
	public void m1();

}

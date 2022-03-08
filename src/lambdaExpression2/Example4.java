package lambdaExpression2;

public class Example4 {

	public static void main(String[] args) 
	{

		a A=n->n*n;
		System.out.println("Square of number is:"+A.squareit(5));
		System.out.println("Square of number is:"+A.squareit(6));
		System.out.println("Square of number is:"+A.squareit(7
				));
	}

}
interface a
{
	public int squareit(int n);
}
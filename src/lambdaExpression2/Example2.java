package lambdaExpression2;

public class Example2 
{
	

	public static void main(String[] args) {
		//add a=(int c,int b)->System.out.println("addition of two number is "+(c+b));
		// compiler can able to grap type of varibale so need to specify type of variable
	add a=( c, b)->System.out.println("addition of two number is "+(c+b));
	//	add a=( c, b)->c*b;
		a.m1(10, 20);
		a.m1(100, 200);
		a.m1(1000, 2000);
		a.m1(10, (int) 20.5);

		
	}

}
interface add
{
	public void m1(int c,int b);
}
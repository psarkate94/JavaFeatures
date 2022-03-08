package conceptOFPredicate;
import java.util.function.Predicate;

public class Example7 {

	public static void main(String[] args) 
	{
		int[] x= {0,5,10,15,20,25,30,35};
		Predicate<Integer>p1=i->i%2==0;
		Predicate<Integer>p2=i->i>10;
		
		// using and(),or() and negate()
		System.out.println("The numbers whihc is even and >10 are");
		for (int X1 : x)
		{
			if(p1.and(p2).test(X1))
			{
				System.out.println(X1);
			}
			
		}
		System.out.println("The numbers whihc is even or >10 are");
		for (int X1 : x)
		{
			if(p1.or(p2).test(X1))
			{
				System.out.println(X1);
			}
			
		}
		
		System.out.println("using negate() to get odd numbers (opposite of p1)");
		System.out.println("The numbers whihc r not even");
		for (int X1 : x)
		{
			if(p1.negate().test(X1))
			{
				System.out.println(X1);
			}
			
		}
		
	}

}

package lambdaExpression;

import java.util.function.*;

public class Example1UisngLambdaexpression {

	public static void main(String[] args) 
	{
		//Function<Integer,Integer>--
		/*which value i have to provide interger 
		 * which value ur going to  provide at the  output integer
		 * 
		 */
		
		Function<Integer,Integer> f=i->i*i;
		System.out.println("the square of 4 is "+f.apply(40));
		System.out.println("the square of 5 is "+f.apply(50));

	}

}

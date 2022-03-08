package ConceptofFunction;

import java.util.function.Function;

public class Example1
{
	//Function<Inputtype,ReturnType> 
	//See below example

	public static void main(String[] args) 
	{
		Function<Integer,Integer>f=i->i*i;
		System.out.println(f.apply(10));
		System.out.println(f.apply(05));
		System.out.println(f.apply(15));

		 
	}

}

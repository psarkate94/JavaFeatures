package ConceptofFunction;

import java.util.function.Function;

public class Example3
{
	//Function<Inputtype,ReturnType> 
	//See below example

	public static void main(String[] args) 
	{
		Function<String,String>f=s->s.toUpperCase();
		System.out.println(f.apply("pravin"));
		System.out.println(f.apply("pravinkumar"));

	}

}

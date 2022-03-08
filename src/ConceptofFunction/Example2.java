package ConceptofFunction;

import java.util.function.Function;

public class Example2 {

	public static void main(String[] args)
	{
		Function<String,Integer>f=s->s.length();
		System.out.println(f.apply("pravin"));
		System.out.println(f.apply("vishnu"));
		System.out.println(f.apply("pravin sarkate"));
		
	}

}

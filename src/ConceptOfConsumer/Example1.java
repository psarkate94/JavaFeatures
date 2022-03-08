package ConceptOfConsumer;

import java.util.function.Consumer;

public class Example1 {

	public static void main(String[] args) 
	{
		Consumer<String> c= s->System.out.println(s);
		c.accept("Pravin");
		c.accept("pravin sarkate");

	}

}

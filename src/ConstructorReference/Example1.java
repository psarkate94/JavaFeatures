package ConstructorReference;

public class Example1 {

	public static void main(String[] args)
	{
		a A=sample::new;// interface get method refer sample class constructor
		sample s=A.get();
		

	}

}
//interface has to be functional interface
interface a
{
	public  sample get();
}
class sample
{
	sample()
	{
		System.out.println("sample constructor execution");
	}
}

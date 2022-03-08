package methodAndConstructorConcept;

public class Example2 {
	
	public   void m1()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args) 
	{
		Example2 exam= new Example2();
		it t=exam::m1;
		t.add();
		exam.m1();

	}

}
interface it1
{
	public void add();
}
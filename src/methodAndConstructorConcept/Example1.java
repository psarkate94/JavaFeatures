package methodAndConstructorConcept;

public class Example1 {
	
	public  static void m1()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		it t=Example1::m1; // interface it add method internally refers example1 class  m1 method
		t.add();
		m1();

	}

}
interface it
{
	public void add();
}
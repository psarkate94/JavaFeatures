package methodAndConstructorConcept;

public class Example4 {
	
	// for method reference argument must be same other parameter doesn't matter
	
	private  static int  m1(int a)
	{
		System.out.println("m1 method");
		return 10;
	}

	public static void main(String[] args) {
		it t=Example4::m1;
		t.add();
		m1(10);

	}

}
interface it3
{
	public void add();
}
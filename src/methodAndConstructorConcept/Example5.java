package methodAndConstructorConcept;

public class Example5 {
	
	private  static int  m1(int a)
	{
		System.out.println("m1 method");
		return 10;
	}

	public static void main(String[] args) {
		it21 t=Example5::m1;
		t.add(10);
		m1(20);
		/*it t=()->System.out.println("zdhfzkj");
		t.add();*/ //lambda expression 

	}

}
interface it21
{
	public void add(int a);
}
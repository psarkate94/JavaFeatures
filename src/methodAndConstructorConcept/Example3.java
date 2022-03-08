package methodAndConstructorConcept;

public class Example3 {
	
	private  static int  m1()
	{
		System.out.println("m1 method");
		return 10;
	}

	public static void main(String[] args) {
		it t=Example3::m1;
		t.add();
		m1();
		/*it t=()->System.out.println("zdhfzkj");
		t.add();*/ //lambda expression 

	}

}
interface it2
{
	public void add();
}
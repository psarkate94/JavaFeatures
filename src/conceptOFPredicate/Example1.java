package conceptOFPredicate;

public class Example1 
{
	public static  boolean test(int i)
	{
		if(i%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// for above method lambda expression would be
	/*(int i)->i%2==0
			i->i%2==0*/
	public static void main(String[] args) {
		
		System.out.println("the given number is:"+test(10));
	}

}

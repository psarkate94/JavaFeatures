package conceptofdefaultmethod;

public class Example3 implements it2
{
	/*see interface having default method we trying to implement in implementation class
	but not getting any suggestion like hashcode need to implement because it is in object class.*/
	
	
	/*public int hashcode()
	{
		System.out.println("object class");
		return 10;
	}*/

	public static void main(String[] args) {
		/*Example3 v= new Example3();
		v.hashCode();*/
	}

}
interface it2
{
	default int hashcode()
	{
		return 10;
	}
}
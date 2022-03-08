package ConstructorReference;

public class Example2 {

	public static void main(String[] args)
	{
		a1 A1=sample1::new;
		sample1 s=A1.get("pravin");
		sample1 s1=A1.get("vishnu");
		sample1 s2=A1.get("Sarkate");
		

	}

}
interface a1
{
	public  sample1 get(String s);
}
class sample1
{
	sample1(String s)
	{
		System.out.println("sample constructor execution:"+s);
	}
}

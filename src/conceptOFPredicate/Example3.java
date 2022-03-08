package conceptOFPredicate;

import java.util.function.Predicate;

//Write predicate to check wheather length of String is >5 or not
public class Example3 {

	//Predicate<Input type which u want to provide>
	
	public static void main(String[] args) 
	{
		String s[]= {"ashisha","negghgaj","pravinkumatr","sarkaterk","joshijek","vishu"};
		Predicate<String>p=s1->s1.length()>7;
		//System.out.println(p.test("pravinkumar"));
		for (String string : s) {
			if(p.test(string))
			{
				System.out.println(string);
			}
		}
		

	}

}

package lambdaExpression;
@FunctionalInterface
public interface It 
{
	public void m1();
	public void m4();//comment this method so interface can act as FI
	public default void m2()
	{
		
	}
	public static int  m3(int a)
	{
		return 'c';
	}

}

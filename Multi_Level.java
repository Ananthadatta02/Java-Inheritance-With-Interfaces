package interface_with_inheritance;
interface Sample3
{
	void test1();
}
interface Sample4 extends Sample3
{
	void test2();
}
interface Sample5 extends Sample4
{
	void test3();
}
class Demo2 implements Sample5
{

	@Override
	public void test1() 
	{
		System.out.println("Test1 Method..");
	}
	@Override
	public void test2() 
	{
		System.out.println("Test2 Method..");	
	}
	@Override
	public void test3() 
	{
		System.out.println("Test3 Method..");	
	}
}
public class Multi_Level 
{
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.test1();
		d.test2();
		d.test3();
	}
}

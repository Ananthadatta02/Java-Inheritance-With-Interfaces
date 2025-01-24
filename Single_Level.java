package interface_with_inheritance;

interface Sample1
{
	void test1();
}
interface Sample2 extends Sample1
{
	void test2();
}
class Demo1 implements Sample2
{

	@Override
	public void test1() 
	{
		System.out.println("Test1 Method");
	}

	@Override
	public void test2() 
	{
		System.out.println("Test2 Method");
	}
}
public class Single_Level 
{
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.test1();
		d.test2();
	}
}

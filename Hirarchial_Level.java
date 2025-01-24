package interface_with_inheritance;

interface Sample6
{
	void test1();
}
interface Sample7 extends Sample6
{
	void test2();
}
interface Sample8 extends Sample6
{
	void test3();
}
class Demo3 implements Sample7
{

	@Override
	public void test1() {
		System.out.println("Test1 method..");	
	}
	@Override
	public void test2() {
		System.out.println("Test2 method..");
	}
}
class Demo4 implements Sample8
{

	@Override
	public void test1() {
		System.out.println("Test1 method..");
		
	}

	@Override
	public void test3() {
		System.out.println("Test3 method..");
		
	}
	
}
public class Hirarchial_Level 
{
	public static void main(String[] args) {
		Demo3 d1 = new Demo3();
		Demo4 d2 = new Demo4();
		d1.test1();
		d1.test2();
		d2.test1();
		d2.test3();
	}
}

package pkg1;

public class Day4_ass3 
{
	public void method()
	{
		System.out.println("Default Method");
	}
	public void mehtod1(int a)
	{
		System.out.println("One Parameterized Method");
	}
	public void method2(int a, int b)
	{
		System.out.println("Two Parameterized Method");
	}
	public void method3(int a, int b, int c)
	{
		System.out.println("Three Parameterized Method");
		this.method();
		this.mehtod1(10);
		this.method4(1, 2, 3, 4);
		this.method2(1, 2);
	}
	public void method4(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized Method");
	}
	public static void main(String[] args) {
		Day4_ass3 abc=new Day4_ass3();
		abc.method3(10, 20, 30);
	}

}

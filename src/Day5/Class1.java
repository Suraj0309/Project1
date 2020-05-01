package Day5;

public class Class1
{
	public Class1() 
	{
		this(10,20,30);
		System.out.println("Parent Default Constructor");
	}
	public Class1(int a)
	{
		this();
		System.out.println("Parent one parameterized Constructor");
	}
	public Class1(int a, int b)
	{
		this(10);
		System.out.println("Parent two parameterized Constructor");
	}
	public Class1(int a, int b,int c)
	{
		System.out.println("Parent three parameterized Constructor");
	}

}

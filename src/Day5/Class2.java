package Day5;

public class Class2 extends Class1
{
	public Class2()
	{
		super(10,20);
		System.out.println("Child Deafult Constructor");
		
	}
	public Class2(int a)
	{
		this(10,20,30);
		System.out.println("Child one parameterized Constructor");
	}
	public Class2(int a, int b)
	{
		this(10);		
		System.out.println("Child two parameterized Constructor");
	}
	public Class2(int a, int b, int c)
	{
		this();
		System.out.println("Child three parameterized Constructor");
	}
public static void main(String[] args) 
{
	Class2 obj= new Class2(10,20);
	
	
}
}

package pkg1;

public class Day3 
{
	public Day3(int a,int b, int c,int d)
	{
		this(10);
		System.out.println("Four Parameterized constructor");
	}
	public Day3(int a)
	{
		this(1,2,3);
		System.out.println("One Parameterized constructor");
	}
	public Day3(int a,int b, int c)
	{
		this();
		System.out.println("Three Parameterized constructor");
	}
	public Day3()
	{
		this(1,2);
		System.out.println("Default Parameterized constructor");
	}
	public Day3(int a,int b)
	{
		System.out.println("Two Parameterized constructor");
	}

	public static void main(String[] args) {
		Day3 abc=new Day3(1,2,3,4);
	}
}

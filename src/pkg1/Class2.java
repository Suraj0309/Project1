package pkg1;

public class Class2 
{
	public int div (int a, int b)
	{
		int c;
		c=a/b;
		return c;
	}
	
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}

	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public void sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Result is "+ c);
	}
	public static void main(String[] args) {
		Class2 abc=new Class2();
		int x=abc.div(10, 2);
		int y=abc.mul(x, 2);
		int z=abc.sum(y, 2);
		int e=abc.sum(z, 2);
		abc.sub(e, 2);
	}
}

package pkg1;

public class Day2 
{
	public int mul(int a ,int b)
	{
		int c;
		c=a*b;
		return c;
	}
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("The result is " + c);
	}

	public static void main(String[] args) {
		Day2 abc=new Day2();
		int x=abc.mul(10, 2);
		int y=abc.sum(x, 2);
		int z= abc.sub(y, 2);
		int w=abc.sum(z, 2);
		abc.div(w, 2);
	}
}

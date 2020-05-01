package pkg1;

import java.util.Scanner;

public class Day4_ass2 
{
	//((((x1+x2)*x3)+x4)-x5/2))
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public void divide(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("The final result is "+ c);
	}
public static void main(String[] args) {
	Scanner abc=new Scanner(System.in);
	System.out.println("Enter the vaule of x1");
	int x1=abc.nextInt();
	System.out.println("Enter the vaule of x2");
	int x2=abc.nextInt();
	System.out.println("Enter the vaule of x3");
	int x3=abc.nextInt();
	System.out.println("Enter the vaule of x4");
	int x4=abc.nextInt();
	System.out.println("Enter the vaule of x5");
	int x5=abc.nextInt();
	
	Day4_ass1 obj=new Day4_ass1();
	int a=obj.sum(x1, x2);
	int b=obj.mul(a, x3);
	int c=obj.sum(b, x4);
	int d=obj.sub(c, x5);
	obj.divide(d, 2);
}

}

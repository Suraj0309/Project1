package pkg1;

import java.util.Scanner;

public class Day4_ass1
{
	//((((X1+X2)-X3)*X4)+2)/2)
	static int x1,x2,x3,x4;
	
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
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public void divide(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("The final result is "+ c);
	}
	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the value of x1");
	x1=xyz.nextInt();
	System.out.println("Enter the value of x2");
	x2=xyz.nextInt();
	System.out.println("Enter the value of x3");
	x3=xyz.nextInt();
	System.out.println("Enter the value of x4");
	x4=xyz.nextInt();
	
	Day4_ass1 obj=new Day4_ass1();
	int sum=obj.sum(x1,x2);
	int sub=obj.sub(sum, x3);
	int mul=obj.mul(sub, x4);
	int a=obj.sum(mul, 2);
	obj.divide(a, 2);
	
	
	}
}

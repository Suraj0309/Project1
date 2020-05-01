package Day5;

public class abc 
{
	public void arithmetic(int a)
	{
		int c,b=10;
		c=a+b;
		System.out.println("resutlt is " + c);
	}

	public void arithmetic(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("resutlt is parent " + c);
	}
	public static void main(String[] args) {
		
		abc obj=new abc();
		obj.arithmetic(10);
		obj.arithmetic(10, 20);
	}
}

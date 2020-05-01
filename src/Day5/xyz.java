package Day5;

public class xyz extends abc
{

	public void arithmetic(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("resutlt is child " + c);
	}
public static void main(String[] args) 
{
	xyz obj=new xyz();
	obj.arithmetic(10, 20);
	
}
}

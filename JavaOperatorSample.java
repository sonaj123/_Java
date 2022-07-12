import java.util.Scanner;
class JavaOperatorSample
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a=");
		a=sc.nextInt();
		System.out.println("Enter value for b=");
		b=sc.nextInt();
		System.out.println("Operations:");
		c=a+b;
		System.out.println("a+b="+c);
		c=a-b;
		System.out.println("a-b="+c);
		c=a*b;
		System.out.println("a*b="+c);
		c=a/b;
		System.out.println("a/b="+c);
	}
}
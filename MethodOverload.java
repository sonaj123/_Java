class Example
{	
	static void add(int a,int b)
	{	
		int c=a+b;
		System.out.println(c);
	}
	static void add(Double a,Double b)
	{
		Double c=a+b;
		System.out.println(c);
	}
}
class MethodOverload
{
	public static void main(String[] a)
	{
		Example m=new Example();
		m.add(5,8);
		m.add(15.02,10.12);
	}
}
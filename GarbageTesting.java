public class GarbageTesting
{
	public void finalize()
	{
		System.out.println("objected collected by garbage collector");
	}
	public static void main(String args[])
	{
		GarbageTesting obj=new GarbageTesting();
		obj=null;
		System.gc();
	}
}
import java.util.Scanner;
class EncapsulationDemo
{
	private long aadhar;
	private String empName;
	private int empAge;
	public long getEmpAadhar()
	{
		return aadhar;
	}
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpAge()
	{
		return empAge;
	}
	public void setEmpAge(int newValue)
	{
		empAge = newValue;
	}
	public void setEmpName(String newValue)
	{
		empName = newValue;
	}
	public void setEmpAadhar(long newValue)
	{
		aadhar = newValue;
	}
}
public class EncapsTest
{
	public static void main(String args[])
	{	
		EncapsulationDemo obj = new EncapsulationDemo();
		Scanner sc = new Scanner(System.in);
		obj.setEmpName(sc.next());
		obj.setEmpAge(sc.nextInt());
		obj.setEmpAadhar(sc.nextLong());
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Aadhar: " + obj.getEmpAadhar());
		System.out.println("Employee Age: " + obj.getEmpAge());
	}
}
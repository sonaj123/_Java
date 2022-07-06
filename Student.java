import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StudentId:");
		byte id = sc.nextByte();
		System.out.println("Enter StudentName:");
		String name = sc.next();
		System.out.println("Enter Gender(M/F):");
		char gender = sc.next().charAt(0);
		System.out.println("Enter Age:");
		byte age = sc.nextByte();
		System.out.println("Enter MobileNo.:");
		long mb = sc.nextLong();
		System.out.println("Enter CGPA:");
		float cgpa = sc.nextFloat();
		System.out.println("___________________");
		System.out.println("StudentId:"+id);
		System.out.println("StudentName:"+name);
		System.out.println("Gender(M/F):"+gender);
		System.out.println("Age:"+age);
		System.out.println("MobileNo.:"+mb);
		System.out.println("CGPA:"+cgpa);
	}
}
class Person
{
	private String name;
	private int age;
	public void set_name(String n)
	{
		name=n;
	}
	public String get_name()
	{
		return name;
	}
	public void set_age(int age)
	{
		this.age=age;
		
	}
	public int get_age()
	{
		return age;
	}
}
class Student extends Person
{
	private int rollno;
	public void set_Rollno(int r)
	{
		rollno=r;
		System.out.println(rollno);
	}
	public int get_rollNo()
	{
		return rollno;
	}
}
public class Example  {
   public static void main(String[] args)
   {
	   Student s=new Student();
	   s.set_Rollno(11);
	   System.out.println(s.get_rollNo());
	   
	   s.set_name( "rahul");
	   System.out.println(s.get_name());
	   s.set_age(24);
	   System.out.println(s.get_age());
   }
}


public class Constructor {
     int marks , roll;
     String name;
	public Constructor(int m,int rol,String nam) {
		marks=m;
		roll=rol;
		name=nam;
		System.out.println(marks+" "+roll+" "+name);
	}
	void get_value()
	 {
		System.out.println(marks+" "+roll+" "+name); 
	 }

	public static void main(String[] args) {
       Constructor c= new Constructor(99,02,"Himanshu");
       
       c.get_value();
	}

}

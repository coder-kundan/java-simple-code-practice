
public class Hello4 {
   int empid;
   String name;
   
   static String Compny="null"; 
   
   Hello4(int empi ,String name)
   {
          empid=empi;
          this.name=name;
          
   }
  int Show()
   {
	   System.out.println(" Employee number"+empid +" name: "+name+"Compny name: "+Compny);
	   return empid;
   }
   
	public static void main(String[] args) {
	  Hello4 hm=new Hello4(123,"Ramesh");
	  System.out.println(hm.Show());
	  Hello4 hc= new Hello4(12,"w kr"); 
	  hc.Show();

	}

}

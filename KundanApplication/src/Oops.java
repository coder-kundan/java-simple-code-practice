class First
{
   private int k;
	int setvalue(int p)
	{
		k=p;
		System.out.println(k);
		return k;
	}
    void printvalue()
    	 {
   		  System.out.println(k);
       }
}
public class Oops extends First  {
    
	public static void main(String[] args) {
		   First fs= new First();
			int j=	fs.setvalue(29);
			fs.printvalue();
            System.out.println(j);
	}

}

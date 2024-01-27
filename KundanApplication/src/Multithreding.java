
class Medical extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Medical Start");
			Thread.sleep(5000);
			System.out.println("Medical completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
   class TestDriver extends Thread
   {
	   public void run()
	   {
		   try
		   {
			   System.out.println("test driver starts");
			   Thread.sleep(500);
			   System.out.println("Driver is sleeping");
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
	   }
   }







public class Multithreding {

	public static void main(String[] args) throws InterruptedException 
	{
		Medical med=new Medical();
		med.start();
		med.join();
		TestDriver td= new TestDriver();
         td.start();
        td.join();
	}

}

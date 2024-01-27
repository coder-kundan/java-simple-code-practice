
public class MixArray {
	public static void main(String[] args) {
      int arr[]= {1,13,17,14,6};
      int [] index=new int[50];
      for(int j=0;j<=5;j++)
      {
    	  index[arr[j]]=5;
    	  System.out.println(index[j]);
      }
      for(int i=0;i<=arr.length-1;i++)
      {
      System.out.println(arr[i]);
      }
	}

}

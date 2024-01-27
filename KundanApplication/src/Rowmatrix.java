import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Rowmatrix {
	public static void main(String[] args) {
  int target=37;
  int[][] arr= {
		  {21,22,30,33,40},
		  {15,25,38,38,45},
		  {28,30,36,48,47},
		  {26,31,37,39,51}
  };
    
//int x =arr.length;
   //System.out.println( x+ " "+arr[3][4]);
    //search(arr,target);
 System.out.println(Arrays.toString(search(arr,target)));
}
	 static int[] search(int[][] matrix,int target)
	 {
		int r=0;
		int c= matrix.length-1;
		while(r< matrix.length&& c>=0)
		{
			if(matrix[r][c]==target)
			{
				return new int[]{r , c};
			}
		   if( matrix[r][c]< target) 
		   {
			   r++;
		   }
		   else
		   {
			   c--;
		   }
		}
	 return new int [] {-1,-1};
			 }
	 
}


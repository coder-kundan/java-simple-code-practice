
public class Find_Alphabet {

	public static void main(String[] args) {
		char arr[]= {'a','b','c','e','f','g'};
		char item='d';
		System.out.println(find_Index(arr,item));
	

	}
	public static char find_Index(char arr[],char item)
	{
		
		int start=0;
	    int	end=arr.length-1;
	    char res=' ';
	    while(start <= end)
	    {
	    	int mid= (start+end)/2;
	    	
	    	if(item==arr[mid])
	    	{
	    	return arr[mid+1];	
	    	}
	    	else if(item > arr[mid])
	    	{    
	    		start=mid+1;
	    	}
	    	else if(item < arr[mid]) {
	    		res=arr[mid];
	    		end=mid-1;
	    	}
	    	
	    }
		return res;
	}

}

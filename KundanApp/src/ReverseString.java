
public class ReverseString {

	public static void main(String[] args) {
		String str= "Kundan";
		String rstr="";
		int j=str.length()-1;
		/*
		for(int i=0;i<str.length()-1;i++)
		{
			char s = str.charAt(i);
			rstr= s+rstr;
			
		}
		for (int k=0;k<rstr.length();k++)
		{
			System.out.println(rstr.charAt(k));
		}
		*/
		for (int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			rstr=rstr+ch;
		
		}
		System.out.println(rstr);
	}

}

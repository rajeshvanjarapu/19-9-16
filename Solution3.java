 import java.util.*;
 public class Solution3
 {
	public int test(String str) 
	{
      int b = 0;
	  int p=0;
      int count = 1;
      if(str.length() == 0)
	  { 
         b = 0;
      } 
	  else if(str.length() == 1)
	  { 
         b = 0;
      } 
	  else 
	  {
		  
          for(int i=0; i < str.length()-1; i++)
		  {  
			if (str.charAt(i) == str.charAt(i+1))
			  {
                 count = count + 1; 
                   if(count > b)
				   {
                     b = count; 
                   }
				   
              }
			 else count = 1; 
          }
		  if(b>=3)
				   {
					   p=b-2;
					   
					   
				   }
      }
      return p;
	}  
	public static void main(String args[])throws Exception
	{
		Solution3 c=new Solution3();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=sc.next();
		int x=c.test(s);
		System.out.println(x);
	}
 }

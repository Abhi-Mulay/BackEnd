package Date_24_02_2025_Book;
/* Question 13 */

import java.util.*;
public class Count_word_in_String
{
    public static void main(String x[])
  {
   Scanner s=new Scanner(System.in);
   System.out.println("ENter the String:");
   String str=s.nextLine();
   int count=0;
   boolean flag=false;
   
   
   for(int i=0;i<str.length();i++)
   {
     //char ch[]=str.charAt(i);
	 
	 if(str.charAt(i)==' ')
	 {
	  flag=false;
	 }
	 else 
         {
	     if(!flag)
	     {
	       count++;
               flag=true;
	     }
	 }
   }
   
    System.out.println("Count of Word is:"+count);
  }

}
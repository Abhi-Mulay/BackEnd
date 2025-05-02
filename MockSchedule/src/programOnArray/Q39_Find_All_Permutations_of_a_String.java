package programOnArray;
	/*39. Find All Permutations of a String
	Description: Find all possible permutations of a string.


Input: "abc"


Output: ["abc", "acb", "bac", "bca", "cab", "cba"]*/

import java.util.*;
public class Q39_Find_All_Permutations_of_a_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{
			
			for (int j = 0; j < ch.length; j++)
			{
				
				if(ch[i]!=ch[j])
				{
					
					for(int k=0;k<ch.length;k++) 
					{
						
						if(ch[i]!=ch[k] && ch[j]!=ch[k]) 
						{
							System.out.println(ch[i]+" "+ch[j]+" "+ch[k]);
						}
					}
				}
			}
		}
	}

}

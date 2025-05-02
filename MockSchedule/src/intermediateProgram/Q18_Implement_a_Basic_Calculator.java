package intermediateProgram;
/*18. Implement a Basic Calculator
Description: Write a program to evaluate a simple expression string containing numbers and basic operators (+, -, *, /).


Input: "3+2*2"


Output: 7


*/

import java.util.*;
public class Q18_Implement_a_Basic_Calculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the expression:");
	        String s = sc.nextLine();
	        
	        int num = 0, result = 0, lastNum = 0;
	        char operator = '+';
	        
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            
	            if (Character.isDigit(ch)) {
	                num = num * 10 + (ch - '0');
	            }
	            
	            if (!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1) {
	                if (operator == '+') {
	                    result += lastNum;
	                    lastNum = num;
	                } 
	                
	                else if (operator == '-') {
	                    result += lastNum;
	                    lastNum = -num;
	                }
	                
	                else if (operator == '*') {
	                    lastNum *= num;
	                }
	                
	                else if (operator == '/') {
	                    lastNum /= num;
	                }
	                
	                operator = ch;
	                num = 0;
	            }
	        }
	        result += lastNum;
	        System.out.println("Result: " + result);
	    }
	}
package Interview_Questions_on_Stings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str = sc.next();
		String org_str = str;
		
		String rev="";
		
		//reversing the string
		int len = str.length()-1;
		
		for(int i = len; i>=0; i--) {
			
			rev = rev+str.charAt(i);
		}
		
		//cheking string is equal or not
		 if(org_str.equals(rev)) {
			 
			 System.out.println(org_str+" is plindrome string");
		 }
		 else {
			 
			 System.out.println(org_str+" is not plindrome string");
		 }
	}

}

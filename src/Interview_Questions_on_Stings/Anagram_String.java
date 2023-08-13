package Interview_Questions_on_Stings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
			
		String s1 = "listen";
		String s2 = "wsilent";
		
		char c1 [] = s1.toCharArray();
		char c2 [] = s2.toCharArray(); 
		
		
	   if(c1.length != c2.length) {
			
			System.out.println("Not Anagram");
			System.exit(0);
		}
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean True = Arrays.equals(c1, c2);
		
		if(True = true) {
		
			for(int i =0; i<s1.length()-1;i++) {
			
			if(c1 [i] == c2[i]) {
			
		   System.out.println("Anagram");
		   System.exit(0);
		      
			}  
		      } 
	
		  }else {
				 System.out.println("not anagram");
				
		   }
		
		} 
	
     }
			
		
		
		
		/*String s1 =  "silent";
		String s2 =   "listen";
	    char ch1[] = s1.toCharArray();	
	    char ch2[] = s2.toCharArray();
	    
	    if(s1.length() == s1.length()) {
	    	
	    	Arrays.sort(ch1);
	    	Arrays.sort(ch2);
	    	
	    	boolean True = Arrays.equals(ch1, ch2);
	    	
	    	if(True = true) {
	    		
	    		System.out.println("Given String is ANAGRAM");
	    	 
	    	}else {
	    		System.out.println("Given String is Not ANAGRAM");
	    	}
	    }else {
	    	System.out.println("String is not Equals in Length");
	    }*/
  

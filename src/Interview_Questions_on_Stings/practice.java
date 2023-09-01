package Interview_Questions_on_Stings;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
      
	public static void main(String[]args) {
	  
		int a=0,b=1,c;
		int L = 5;
		
		for(int i=1; i<=L; i++) {
		   
			System.out.print(a);
			c = a+b;
			a = b;
			b = c;
		}
	}
 }	

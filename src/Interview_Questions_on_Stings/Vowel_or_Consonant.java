package Interview_Questions_on_Stings;

import java.util.Scanner;

public class Vowel_or_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // a e i o u --> vowel;    
	    // all the others are consonat
	     char  ch ;
		
		System.out.println("Enter any Character: ");
		Scanner s = new Scanner(System.in);
		ch  = s.nextLine().charAt(0);
		 
		if(ch=='a' || ch=='e' || ch=='i' || ch =='o' || ch =='u'  ) {
			
			System.out.println("Vowel");
		}
		else {
			
			System.out.println("Consonant");
			
		}
	}

}

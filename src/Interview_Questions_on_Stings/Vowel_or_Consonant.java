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
		
		/*
		  String st = "rahul";
		st = st.toLowerCase();
		int vowel= 0;
		int nonvowel=0;
		for(int i=0; i<=st.length()-1; i++)
		{
			if (st.charAt(i) == 'a' || st.charAt(i) == 'e'
	                || st.charAt(i) == 'i'
	                || st.charAt(i) == 'o'
	                || st.charAt(i) == 'u')
			{
				vowel++;
			}
			else
			{
				nonvowel++;
			}
		}
		System.out.println(
	            "Total no of vowels in string are: " + vowel);	
		System.out.println(
	            "Total no of Non-vowels in string are: " + nonvowel);
		 
		  */
		
	}

}

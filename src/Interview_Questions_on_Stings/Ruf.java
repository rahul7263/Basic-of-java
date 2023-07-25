package Interview_Questions_on_Stings;

import java.util.Scanner;

public class Ruf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	  Scanner s = new Scanner(System.in);
	  
	  System.out.println("Enter String ");
	  
	  String str = s.next();
	  String org_str = str;
	  String rev="";
	  
	  int L = str.length();
	  
	  for(int i = L-1; i>=0; i--) {
		  
		rev = rev+str.charAt(i);  
	  }
	  
	  if(org_str.equals(rev)) {
		  
		  System.out.println("String is Pelindrome");
	  }else {
		  System.out.println("String is not pelindrome");
	  }
		
	}

}

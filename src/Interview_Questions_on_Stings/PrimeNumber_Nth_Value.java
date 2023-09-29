package Interview_Questions_on_Stings;

import java.util.Scanner;

public class PrimeNumber_Nth_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int min,max,i,j;
		
		System.out.println("Enter 1st Number: ");
		Scanner s = new Scanner(System.in);
		min = s.nextInt();
		
		System.out.println("Enter 2nd Number: ");
		max = s.nextInt();
		
		for( i=min; i<=max; i++) {
			for( j=2; 2<=i; j++) {
				if(i%j==0) {				
					break;	
				}		
			}
			if(i==j) { 
		    System.out.print(j+" ");
			}
		}
	}
}

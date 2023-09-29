package Interview_Questions_on_Stings;

import java.util.Scanner;

public class PrimeNumber_CheckNumber_isPrime_OR_NOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int n,count=0;
		System.out.print("Enter AnyNumber: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+" is PrimeNumber");
		}else {
			System.out.println(n+" is not PrimeNumber");
		}
	}

}

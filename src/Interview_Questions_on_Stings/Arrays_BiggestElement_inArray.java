package Interview_Questions_on_Stings;

import java.util.Scanner;

public class Arrays_BiggestElement_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a[] = new int[5];
		int max = a[0];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Element: ");
		
		for(int i=0; i<=4; i++) {
			a[i] = s.nextInt();
		}
		
		for(int i=1; i<=4; i++) {
			 if(a[i]>max) {
			    max = a[i];	
			}
		}
		
		System.out.println("Maximium: "+max);
	}

}

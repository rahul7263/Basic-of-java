package Interview_Questions_on_Stings;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 int n,arm=0,rem,orgnum;
		 System.out.print("Enter Any Number: ");
		 Scanner r= new Scanner(System.in);
		 n = r.nextInt();
		 orgnum=n;
		 
		 while(n>0) {
			 rem= n%10;
			 arm=(rem*rem*rem)+arm;
			 n=n/10;
		 }
		 if(orgnum==arm) {
	          System.out.println("ArmStrong Number");		 
		 }else {
			 System.out.println("Not ArmStrong Number");
		 }
		
	}

}

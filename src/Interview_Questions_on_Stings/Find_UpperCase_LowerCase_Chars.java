package Interview_Questions_on_Stings;

public class Find_UpperCase_LowerCase_Chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		String str = "WelCome To AutOMation";
		
		int UpperCase = 0;
		int LowerCase = 0;
		int Space = 0;
		
		for(int i =0; i<str.length()-1; i++) {
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				UpperCase++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				
				LowerCase++;
			}
			else 
			
			{
				Space++;
			}
		}
		
		System.out.println("UpperCase: "+UpperCase);
		System.out.println("LowerCase: "+LowerCase);
		System.out.println("Space Count: "+Space);
	}

}

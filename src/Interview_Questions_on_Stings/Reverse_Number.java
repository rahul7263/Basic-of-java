package Interview_Questions_on_Stings;

public class Reverse_Number {

	public static void main(String[] args) {
		int orgnum=12345;
		
		String num = Integer.toString(orgnum);
		String rev="";
		
		for(int i=num.length()-1; i>=0; i--)
		{
			rev= rev+ num.charAt(i);
		}
		int revnum = Integer.parseInt(rev);
		System.out.println(rev);
	}
}

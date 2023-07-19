package Interview_Questions_on_Stings;

public class Find_Duplicate_StringChar {
    
	public static void main(String[]args) {
		
		String str = "java";
		int length = str.length();
		char[] ch = str.toCharArray();
		
		
	      int ci = 0;
	      
		for(char c : ch) {
			System.out.print(c);
			ci++;
			System.out.println(ci);
		}
		System.out.println(ci);
		
		
		for(int i = 0; i< length; i++) {
			
			for(int j = i+1; j<length; j++ ) {
				
				if(ch[i] == ch[j]) {
					
					System.out.println("Duplicate characters are: "+ch[j]);
				}
			}
			
			
		}
	}
}

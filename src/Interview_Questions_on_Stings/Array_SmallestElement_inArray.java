package Interview_Questions_on_Stings;

public class Array_SmallestElement_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n[] = {1,2,3,4,5};
		int min = n[0];
		
		for(int i=0; i<=4; i++) {
			
			if(min>n[i]) {
				min = n[i];
			}
		}
		
		System.out.println("Smallest Element in Array: "+min);
	}

}

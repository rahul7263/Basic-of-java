package inheritance;
interface A{
	
	public void show();
	
}

public class multiple implements A {
     

	@Override
	public void show() {
		
		System.out.println("interface A");
	}
	
   public static void main(String[]args) {
		
		multiple m = new multiple();
		
		m.show(); 
		
		
	} 
	 
}

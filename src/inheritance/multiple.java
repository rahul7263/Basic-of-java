package inheritance;
interface A{
	
	public void show();
	
}

interface B{
	
	public void fun();
}



public class multiple implements A,B {
     
	@Override
	public void fun() {
		
		System.out.println("Interface B");
	}

	@Override
	public void show() {
		
		System.out.println("interface A");
	}
	
   public static void main(String[]args) {
		
		multiple m = new multiple();
		
		m.show(); m.fun();
		
		
	} 
	 
}

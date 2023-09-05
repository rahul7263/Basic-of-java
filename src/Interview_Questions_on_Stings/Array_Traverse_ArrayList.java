package Interview_Questions_on_Stings;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Traverse_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ArrayList<Object> al = new ArrayList<Object>();
	
		al.add(1995);
		al.add("Rahul");
		al.add("Pune");
		al.add("Quality Analyst");
		al.add("3.5 Years of Experenice");
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i)+" ");
		}
	   
		System.out.println(" ");
		
	    for(Object a:al) {
	    	System.out.println(a);
	    }
	    
	    System.out.println(" ");
	    
	    Iterator<Object> it = al.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	}

}

package objects;

public class object_demo {
    
	 int sid;
	 int rollnum;
	 String department;
	 String sname;
	 
	   public void display() {
			System.out.println(sid);
			System.out.println(rollnum);
			System.out.println(department);
			System.out.println(sname);
		} 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object was created to add values in obejct_demo class.and accesing the method of obejct_demo class
		//adding new stduent details by creating object of object_demo class
		object_demo stu1 = new object_demo();
		
		stu1.sid=1;
		stu1.rollnum=1;
		stu1.department="cse";
		stu1.sname="Rahul Kande";
		
	    //calling the method of object_demo class
	   stu1.display();
	   
	   //creating seoncd object to second student details
	   object_demo stu2 = new object_demo();
	   
	   stu2.sid=2;
	   stu2.rollnum=2;
	   stu2.department="insturmental enginnering";
	   stu2.sname="Scahin Kande";
	   
	   //calling the method of object_demo class
	   stu2.display();
	}

}

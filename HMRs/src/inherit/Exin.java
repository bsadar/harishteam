package inherit;

public class Exin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jntu19 rw119=new Jntu19();
       rw119.stdname="";
       rw119.hno=23;
       rw119.ok();
       
       
       Jntu20 rw120=new Jntu20();
              rw120.branch="";
              rw120.stdname="";
              rw120.hno=45;
              rw120.success();
              rw120.ok();

       
		
		
		 
		   
	}

}

class Jntu19{
String	stdname;
	int hno;
	void ok(){
		System.out.println("it is k of 19");
	}
	
}

class Jntu20 extends Jntu19 {
	String  branch;
	    void success(){
	    	System.out.println("it is success of 20");
	    }
	
}

	




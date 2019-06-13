package methods;

public class MainMethodExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collage obj=new Collage();
		
		//nonretutn type
		obj.add();
		
		obj.add(100, 300);
		
		//return type
	     int s=obj.add1();
	     System.out.println(s);
	     
	     
	     int r=obj.add1(23, 454564);
	     System.out.println(r);
		
	}

}

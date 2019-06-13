package abstr;

public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI obj=new SBI();
		obj.ok();
		RBI obj1=new ICICI();
		     obj1.ok();
	}

}
abstract class RBI{
 abstract	void ok();
}

class SBI extends RBI {
	void ok(){
		System.out.println("abstaexample");
	}
	
	
}
class ICICI extends RBI {
	void ok(){
		System.out.println("xicice ample");
	}
	
	
}
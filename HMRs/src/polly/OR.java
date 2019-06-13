package polly;

public class OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JN35 obj=new JN35();
obj.display();
//obj.display();

	}

}
class JN34{
void 	add(){
		
		int t;
		int a;
		int b;
		a=2;
		b=3;
		t=a+b;
		System.out.println(t);
		
	}
	
	}
class JN35 extends JN34{
void 	add(){
		
		int t;
		int a;
		int b;
		a=7;
		b=8;
		t=a+b;
		System.out.println(t);
		
	}
void display(){
	super.add();
	this.add();
}

	
	}
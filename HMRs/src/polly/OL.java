package polly;

public class OL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JN23 obj=new JN23();
    obj.add();
    obj.add(23, 34);
    obj.add(23.3f, 45.6f);
	}

}
class JN23{
	void add(){
		int a;
		int b;
		int t;
		a=2;
		b=3;
		t=a+b;
		System.out.println(t);
		
	     }
	
	void add(int a,int b){
		int t;
		 t=a+b;
		System.out.println(t);
		
	}
	void add(float a,float b){
		float t;
		 t=a+b;
		System.out.println(t);
		
	}
	
		
	
}
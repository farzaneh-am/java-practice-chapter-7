package chapter7;
class byreference{
	int a,b;
	byreference	(int i,int j){
	
		a=i;
		b=j;
		
		
	}
	void meth3(byreference o) {
		o.a*=2;
		o.b/=2;
	}
}
public class call_by_referance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byreference ob=new byreference(15,20);
		System.out.println("a and b before call:"+ob.a+" , "+ob.b);
		ob.meth3(ob);
		System.out.println("a and b before call:"+ob.a+" , "+ob.b);
	}

}

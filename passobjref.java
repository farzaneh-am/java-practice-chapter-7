package chapter7;
class test1 {
	int a;
	int b;
	test1 (int i,int j){
		a=i;
		b=j;
	}
	void meth2(test1 o) {
		o.a*=2;
		o.b/=2;
	}
}
public class passobjref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 ob=new test1(15,20);
		System.out.println("a and b before call:"+ob.a+" , "+ob.b);
		ob.meth2(ob);
		System.out.println("a and b before call:"+ob.a+" , "+ob.b);

	}

}

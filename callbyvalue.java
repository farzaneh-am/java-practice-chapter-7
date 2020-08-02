package chapter7;
class byvalue{
	void meth(int i,int j){
		i*=2;
		j*=2;
		
		
	}
}
public class callbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byvalue myobject=new byvalue();
int a=20,b=30;
System.out.println("a and b before call:"+a+" , "+b);
myobject.meth(a,b);
System.out.println("a and b before call:"+a+" , "+b);
	}

}

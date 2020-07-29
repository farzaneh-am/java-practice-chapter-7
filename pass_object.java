package chapter7;
class test{
	int a,b;
	test(int i, int j){
		a=i;
		b=j;
	}
		boolean equalto(test ob)
		{
			if(ob.a==a && ob.b==b)
				return true;
			else
				return false;
			
		}
	}

public class pass_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test ob1=new test(100,22);
		test ob2=new test(100,22);
		test ob3=new test(-1,-1);
		System.out.println("ob1 == ob2 "+ob1.equalto(ob2));
		System.out.println("ob1 == ob3 "+ob1.equalto(ob3));

	}

}

package chapter7;
class overloadDemo{
	void test() {
		System.out.println("No Parameter");
	}
	void test(int a) {
		System.out.println("a= "+a);
	}
	void test(int a, int b){
		System.out.println("a + b = "+(a+b));
		
	}
	double test(double a) {
		return a*a;
	}
}
public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadDemo ov=new  overloadDemo();
		ov.test();
		ov.test(10);
		ov.test(10, 20);
		System.out.println("a * a = "+ov.test(123.25));

	}

}

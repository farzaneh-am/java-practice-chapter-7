package chapter7;
class overload2{
	void test() {
		System.out.println("No Parameter");
	}
	void test(int a) {
		System.out.println("a= "+a);
	}
	void test(int a, int b){
		System.out.println("a + b = "+(a+b));
		
	}
	void test(double a) {
		System.out.println("inside test(double) a: "+a);
	}
}
public class overload_double_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		overload2 ov=new overload2();
		int i=88;
		ov.test();
		ov.test(10, 20);
		ov.test(i);//test(double a) exacute 
		ov.test(123.2);


	}

}

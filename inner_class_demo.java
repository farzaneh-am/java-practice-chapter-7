package chapter7;
class outer{
	int outer_x=100;
	void test() {
		Inner ob=new Inner();
		ob.display();
		
	}
	class Inner{
		void display() {
			System.out.println("display: outer_x= "+outer_x);
		}
	}
	}
public class inner_class_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer ob2=new outer();
		ob2.test();

	}

}

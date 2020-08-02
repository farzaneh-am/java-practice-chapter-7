package chapter7;
class outer3{
	int out_x=100;
	void test3() {
	for(int i=0;i<10;i++)
	{
		class Inner3{
			void display() {
				System.out.println("display: out_x= "+out_x);
			}
		}
		Inner3 outer=new Inner3();
		outer.display();
	}
	}
	
}
public class innerclass_infor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer3 myob=new outer3();
		myob.test3();
	}

}

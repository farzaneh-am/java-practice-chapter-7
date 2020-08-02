package chapter7;
class outer2{
		int outer_x=150;
		void test10() {
			Inner2 ob1=new Inner2();
			ob1.display();
		
			
		}
		class Inner2{
			int y=20;
			void display() {
				System.out.println("display: outer_x= "+outer_x);
			}
		}
		void show() {
			System.out.println("y of class inner is= "+y);//Error because y is local for innerclass
		}
		}
	public class inner_local_var {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			outer2 ob20=new outer2();
			ob20.test10();
			ob20.show();

		}

	}

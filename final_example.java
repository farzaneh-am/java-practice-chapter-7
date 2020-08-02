package chapter7;
class finaltest{
	final int x=20;
	void run() {
		x=400;//Error, because x is final and not change
	}
}
public class final_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finaltest ob=new finaltest();
			ob.run();
			System.out.println("x="+ob.x);
	}

}

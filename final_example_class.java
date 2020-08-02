package chapter7;
final class Bike2{}  

	class Honda1 extends Bike2{ //Error, because A class final cannot be inherited 
		  void run2(){System.out.println("running safely with 100kmph");}  
	}
public class final_example_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Honda1 honda= new Honda1();  
		  honda.run2(); 
	}

}

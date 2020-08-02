package chapter7;
class Bike{  
	   final void run1(){System.out.println("running");}  
	}  
	     
	class Honda extends Bike{  
	   void run1(){System.out.println("running safely with 100kmph");}  
	 //error because method final is not override  
	}	     
public class final_example_method {

	public static void main(String args[]){  
		   Honda honda= new Honda();  
		   honda.run1(); 

	}

}

package chapter7;
class factorial2{
	
	 int fact(int n){
	 int result;
	 if(n==1)
		 return 1;
	 else 
		 result=fact(n-1)*n;
	 return result;
	}
}
public class Recursion_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial2 f=new factorial2();
		System.out.println("factorial= "+f.fact(3));
		System.out.println("factorial= "+f.fact(4));
		System.out.println("factorial= "+f.fact(5));
		

	}

}

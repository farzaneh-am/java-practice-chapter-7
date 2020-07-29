package chapter7;

import java.io.IOException;

class factorial{
	public int fact(int n){
		 
		int result;
		if (n==1)
			return 1;
		result=fact(n-1)*n;
		return result;
		
	}
}
public class recarsion_factorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a;
		factorial ob=new factorial();
		System.out.println("Enter a Nunber: ");
		a=System.in.read();
		System.out.println("factorial number is " + ob.fact(a));

	}

}

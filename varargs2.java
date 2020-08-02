package chapter7;

public class varargs2 {
	static void vatest(String msg , int...v)
	{
		System.out.print(msg + v.length + " contents: " );
		for(int x:v)
			System.out.print(x+" ");
			System.out.println();
		}	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		vatest("one varargs: ",10);
		vatest("three varargs: ",1,2,3);
		vatest("No varargs: ");
	}

}

package chapter7;

public class varargs4_Ambiguity {
	static void vatest( int...v)
	{
		System.out.print("vatest (int ...): "+"Number of args:"+v.length + " contents: " );
		for(int x:v)
			System.out.print(x+" ");
			System.out.println();
	}
	
	static void vatest( boolean...v)
	{
		System.out.print("vatest (boolean ...): "+"Number of args:"+v.length + " contents: " );
		for(boolean x:v)
			System.out.print(x+" ");
			System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vatest(1,2,3);
		vatest(true,false,false);
		vatest();//Error:Ambiguous!!!!!
	

	}

}

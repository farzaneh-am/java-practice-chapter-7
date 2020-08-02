package chapter7;

public class varargs3_overlodvarargs {
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
	
	
	static void vatest(String msg , int...v)
	{
		System.out.print("vatest (String ,int ...): "+msg+ v.length + " contents: " );
		for(int x:v)
			System.out.print(x+" ");
			System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vatest(1,2,3);
		vatest("Testing: ",10,20);
		vatest(true,false,false);
		vatest(1458);
	}

}

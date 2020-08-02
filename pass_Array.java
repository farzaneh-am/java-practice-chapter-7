package chapter7;

public class pass_Array {
	static void vatest(int v[])
	{
		System.out.print("Number of args: "+ v.length+" contents: " );
		for(int x:v)
			System.out.print(x+" ");
			System.out.println();
		}	
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n1[]= {9};
			int n2[]= {1,5,8};
			int n3[]= {};
			vatest(n1);
			vatest(n2);
			vatest(n3);
			}

	}

package chapter7;
class rectest{
	int value[];
	rectest(int i){
		value =new int[i];
	}
	void printarray(int i) {
		if(i==0)
			return;
		
		else 
			printarray(i-1);
		System.out.println("["+(i-1)+"] "+value[i-1]);
	}
}
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectest ob=new rectest(10);
for(int i=0;i<10;i++)
	ob.value[i]=i;
ob.printarray(10);
	}

}

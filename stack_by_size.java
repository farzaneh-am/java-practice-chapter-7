package chapter7;
class stacklenght{
	private int stack[];
	private int tos;
	stacklenght(int size){
		stack=new int[size];
		tos=-1;
	}
	void push(int item)
	{
		if(tos==stack.length-1)
			System.out.println("stack is full");
			else
				stack[++tos]=item;
		
	}
	int pop() {
		if(tos<0)
		{
			System.out.println("stack underflow");
			return 0;
			
		}
		else
			return stack[tos--];
	}
}

public class stack_by_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stacklenght mystack1=new stacklenght(5);
		stacklenght mystack2=new stacklenght(10);
		for(int i=0;i<5;i++)
		mystack1.push(i);
		for(int i=0;i<10;i++)
			mystack2.push(i);
		
		System.out.print("mystack1 is:");
		for(int i=0;i<5;i++)
			System.out.print(mystack1.pop()+" ");
		System.out.println();
		System.out.print("mystack2 is:");
			for(int i=0;i<10;i++)
				System.out.print(mystack2.pop()+" ");
		
		
			
		
		

	}

}

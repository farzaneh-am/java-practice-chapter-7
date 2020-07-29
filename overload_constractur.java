package chapter7;

class Box_cons1{
	double width,heigh,depth;
	Box_cons1(double w,double h,double d) {
		width=w;
		heigh=h;
		depth=d;
	}
	Box_cons1() {
		width=-1;
		heigh=-1;
		depth=-1;
	}
	Box_cons1(double len) {
		width=heigh=depth=len;
	}
	
	double volom() {
		return width*heigh*depth;
		
	}
	
}
public class overload_constractur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box_cons1 mybox1=new Box_cons1(10,20,15);
		Box_cons1 mybox2=new Box_cons1();
		Box_cons1 mycube=new Box_cons1(7);
		System.out.println("volom is:"+mybox1.volom());
		System.out.println("volom is:"+mybox2.volom());
		System.out.println("volom is:"+mycube.volom());
		

	}

}

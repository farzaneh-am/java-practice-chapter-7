package chapter7;
class Box_cons2{
	double width,heigh,depth;
	Box_cons2(double w,double h,double d) {
		width=w;
		heigh=h;
		depth=d;
	}
	Box_cons2(Box_cons2 ob) {
		width=ob.width;
		heigh=ob.heigh;
		depth=ob.depth;
	}
	
	Box_cons2() {
		width=-1;
		heigh=-1;
		depth=-1;
	}
	Box_cons2(double len) {
		width=heigh=depth=len;
	}
	
	double volom() {
		return width*heigh*depth;
		
	}
	
}
public class overload_constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box_cons2 mybox1=new Box_cons2(10,20,15);
		Box_cons2 mybox2=new Box_cons2();
		Box_cons2 mycube=new Box_cons2(7);
		Box_cons2 myclon=new Box_cons2(mybox1);
		System.out.println("volom is:"+mybox1.volom());
		System.out.println("volom is:"+mybox2.volom());
		System.out.println("volom is:"+mycube.volom());
		System.out.println("volom is:"+myclon.volom());
		
		

	}

}

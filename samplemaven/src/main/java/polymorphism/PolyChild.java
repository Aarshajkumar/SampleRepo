package polymorphism;

public class PolyChild extends PolyParent {
	public void display(int a, int b) {
		int c = a-b;
		System.out.println("Sum of child:"+c);
		super.display(7, 7);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyChild obj = new PolyChild();
		obj.display(10,5);
	}

}

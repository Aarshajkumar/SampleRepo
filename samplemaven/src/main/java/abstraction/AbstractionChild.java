package abstraction;

public class AbstractionChild extends AbstactionParent {
public void display2() {
	System.out.println("I am the child");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionChild obj = new AbstractionChild();//object creation
		obj.display();
		obj.display1();
		obj.display2();
		
		AbstactionParent obj1 = new AbstractionChild();//reference creation
		obj1.display();
		obj1.display1();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i was hidding");
	}
	@Override
	public void display1() {
		System.out.println("I was hiiden");
		// TODO Auto-generated method stub
		
	}

}

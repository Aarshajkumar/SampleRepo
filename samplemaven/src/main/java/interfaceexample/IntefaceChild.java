package interfaceexample;

public class IntefaceChild implements InterfaceParent {
public void display2() {
	System.out.println("child");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntefaceChild obj = new IntefaceChild();
		obj.display();
		obj.display1();
		obj.display2();
		InterfaceParent obj1 = new IntefaceChild();//interface reference cheyan patu because
		//athu interface ayi anu crate cheythe anu class anekile obj patu create akan.
		obj1.display();
		obj1.display1();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("abstr");
	}
	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("abstar");
	}

}

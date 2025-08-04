package interfaceexample;

public class Child implements Parent1,Parent2 {
public void display2() {
	System.out.println("CHILD");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj =new Child();
		obj.display();
		obj.display1();
		obj.display2();
	}
	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Parent2");
	}
	@Override
	public void display() {
		System.out.println("Parent1");
		// TODO Auto-generated method stub
		
	}

}

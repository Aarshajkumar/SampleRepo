package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
public void display1()
{
	System.out.println("Orange");
	super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMethodChild obj = new SuperMethodChild();
		obj.display1();
	}

}

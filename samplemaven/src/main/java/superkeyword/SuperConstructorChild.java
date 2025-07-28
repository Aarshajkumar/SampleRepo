package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public SuperConstructorChild()
	{
		super(4, 4);
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj = new SuperConstructorChild();
	}

}

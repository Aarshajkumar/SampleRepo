package inheritance;

public class MultilevelChild extends MultilevelParent {
public void show() {
	System.out.println("to the child from parent and GP");
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	MultilevelChild obj = new MultilevelChild();
	obj.print();
	obj.display();
	obj.show();
	}

}

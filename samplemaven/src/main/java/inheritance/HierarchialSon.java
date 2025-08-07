package inheritance;

public class HierarchialSon extends HierarchialParent {
public void display() {
	System.out.println("I am the son of HierarchialParent");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialSon obj = new HierarchialSon();
		obj.print();
		obj.display();
		
	}

}

package inheritance;

public class HierarchialDaughter extends HierarchialParent {
public void show() {
	System.out.println("I am the daughter of HierarchialParent");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialDaughter obj = new HierarchialDaughter();
		obj.print();
		obj.show();
		
	}

}

package inheritance;

public class SingleChild extends SingleParent {
 public void print()
 {
	 System.out.println("to the child class");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SingleChild obj = new SingleChild();
  obj.display();
  obj.print();
  
	}

}

package accessmmodifiers;

public class AccessOne {
	public void display1() {
		System.out.println("Display Public");
		}
	private void display2() {
		System.out.println("Display private");
	}
	protected void display3() {
		System.out.println("Display protected");
	}
	void display4() {
		System.out.println("Display Default");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessOne obj = new AccessOne();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}

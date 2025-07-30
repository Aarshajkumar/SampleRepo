package aggregation;

public class AggregationTwo {
String city,state;
AggregationOne ref;

public AggregationTwo(String city,String state,AggregationOne ref) {
	this.city= city;
	this.state= state;
	this.ref=ref;
}
public void display() {
	System.out.println(ref.name+" "+ref.rollno+" "+ref.address);
	System.out.println(city+" "+state);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationOne obj1 =new AggregationOne("Malu",5,"Bethel");
		AggregationTwo obj = new AggregationTwo("tvm","kerala",obj1);
		obj.display();
		
	}

}

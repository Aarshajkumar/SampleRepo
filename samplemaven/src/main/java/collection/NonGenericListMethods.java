package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l =new ArrayList();
l.add("1");
l.add("Green");
l.add("Yellow");
l.add("1");
System.out.println(l);
System.out.println(l.get(2));//get cheyenda index kodukanam
l.set(0, "Black"); //onina mati vere set cheyan
System.out.println(l);
System.out.println(l.indexOf("Black"));//etramathe indexila enu kanikan
System.out.println(l.lastIndexOf("Black"));
l.remove(1);//l.remove("Green")
System.out.println(l);
System.out.println(l.contains("Yellow"));//koduthe value ondonu check cheyan
System.out.println(l.isEmpty());// to check the list is empty
System.out.println(l.size()); //to get the length
	}

}

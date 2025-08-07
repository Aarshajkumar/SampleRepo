package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>l = new ArrayList<String>();//import chythu kodukanam
l.add("Red");// elements add cheyan
l.add("Green");
l.add("Yellow");
l.add("Black");
System.out.println(l);
System.out.println(l.get(2));
l.set(0, "Black"); 
System.out.println(l);
System.out.println(l.indexOf("Black"));//repeat cheytha elemnt
System.out.println(l.lastIndexOf("Green"));//repeat cheytha element evida anu kidakune enu ariyan
l.remove(1);
System.out.println(l);
System.out.println(l.contains("Yellow"));
System.out.println(l.isEmpty());
System.out.println(l.size()); 
	}

}

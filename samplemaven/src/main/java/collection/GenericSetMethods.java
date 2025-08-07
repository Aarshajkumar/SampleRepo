package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String>s = new HashSet<String>();
 s.add("Red");
 s.add("Grapes");
 s.add("orange");
 System.out.println(s);
 Set<String>s1 = new HashSet<String>();
 s1.add("Banana");
 s1.add("WaterMelon");
 s.addAll(s1);
 System.out.println(s); 
 System.out.println(s.contains("Yellow"));
 System.out.println(s.containsAll(s1));
 System.out.println(s.isEmpty());
 s.remove("orange");
 System.out.println(s);
 s.removeAll(s1);
 System.out.println(s);
 System.out.println(s.size());
 s.clear();
 System.out.println(s);
	}

}

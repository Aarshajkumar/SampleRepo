package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String>s = new HashSet<String>();
s.add("Red");
s.add("Orange");
s.add("Yellow");
Iterator it = s.iterator();
while(it.hasNext()){
	
	System.out.println(it.next());//loopinu akathu kodukene matrame line varatholu
//	it.remove();
//	System.out.println(s);
}
it.remove();
System.out.println(s);

	}

}

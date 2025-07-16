package Collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> a = new HashSet <String>();
		a.add("apple");
		a.add("bananna");
		System.out.println(a);
		
		Set <String> b = new HashSet <String>();
		b.add("orange");
		b.add("grapes");
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		
		System.out.println(a.contains("grapes"));
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		System.out.println(a.isEmpty());
		a.remove("orange");
		System.out.println(a);
		System.out.println(a.size());
		a.removeAll(b);
		System.out.println(a);
		b.clear();
		System.out.println(b);
	}

}

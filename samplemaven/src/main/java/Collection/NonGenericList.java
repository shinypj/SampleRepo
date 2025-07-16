package Collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a = new ArrayList ();
		a.add("red");
		a.add("blue");
		a.add("green");
		a.add("red");
		System.out.println(a);
		System.out.println(a.get(1));
		a.set(2, "white");
		System.out.println(a);
		System.out.println(a.indexOf("red"));
		System.out.println(a.lastIndexOf("red"));
		a.remove(3);
		System.out.println(a);
		System.out.println(a.contains("blue"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}

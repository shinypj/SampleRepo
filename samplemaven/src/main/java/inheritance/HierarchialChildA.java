package inheritance;

public class HierarchialChildA extends HierarchialParent{
	public void show()
	{
		System.out.println("This is Child A class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchialChildA obj = new HierarchialChildA();
		obj.show();
		obj.print();
	}

}

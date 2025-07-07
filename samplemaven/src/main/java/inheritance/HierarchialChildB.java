package inheritance;

public class HierarchialChildB extends HierarchialParent {
	
	public void display()
	{
		System.out.println("This is Child B class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildB obj = new HierarchialChildB();
		obj.display();
		obj.print();

	}

}

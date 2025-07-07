package inheritance;

public class MultiLevelChild extends MultilevelParentB {
	
	public void show()
	{
		System.out.println("This is Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChild obj = new MultiLevelChild();
		obj.display();
		obj.print();
		obj.show();
	}

}

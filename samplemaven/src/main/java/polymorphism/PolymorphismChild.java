package polymorphism;

public class PolymorphismChild extends PolymorphismParent{
	
	public void display(int a, int b)
	{
		System.out.println(a-b);
		super.display(3, 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismChild obj = new PolymorphismChild();
				obj.display(3, 2);
	}

}

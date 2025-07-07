package accessmodifiers;

public class AccessModifier1 {
	
	public void display1()
	{
		System.out.println("Public");
	}
	
	private void display2()
	{
		System.out.println("Private");
	}
	
	protected void display3()
	{
		System.out.println("Protected");
	}
	
	void display4 ()
	{
		System.out.println("Default");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifier1 obj = new AccessModifier1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}

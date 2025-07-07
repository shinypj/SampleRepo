package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent{
	
	public SuperConstructorChild()
	{
		super(1, 2);
		System.out.println("Child class");
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperConstructorChild obj = new SuperConstructorChild();
		
	}

}

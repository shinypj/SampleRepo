package interfaceexample;

public class InterfaceChild implements InterfaceParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj = new InterfaceChild();
		obj.display();
		obj.print();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is test display");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is test print");
		
	}

}

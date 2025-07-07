package inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent {
	
	public void print() {
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceChild obj = new SingleInheritanceChild();
		obj.print();
		obj.display();
	}

}

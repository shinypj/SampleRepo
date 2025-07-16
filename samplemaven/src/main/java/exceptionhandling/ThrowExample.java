package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new NumberFormatException("Not eligible for voting");
		}	


	}

}

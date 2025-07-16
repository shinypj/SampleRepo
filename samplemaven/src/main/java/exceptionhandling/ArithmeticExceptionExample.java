package exceptionhandling;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; 
		int b = 0; 
		
		try
		{
		int c = a/b;
		}
		
		catch(ArithmeticException e)
		{
			b=5;
			int d=a/b;
			System.out.println(d);	
			System.out.println(e);	
	
		}
		
		finally
		{
			b=5;
			int d=a/b;
			System.out.println(d);					
		}
		System.out.println("hello world");		

	}

}

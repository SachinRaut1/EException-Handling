package ExceptionHandling;

public class AMExeception {

	public static void main(String[] args) {
		//1. ArithmeticException
				//Arithmetic exceptions is raised by JVM when we try to perform any arithmetic operation 
				//which is not possible in mathematics. 
				//One of the most common arithmetic exception 
				//that occurs is when we divide any number with zero.
		

		int a=10;
		int b=0;
		
		try 
		{
			int c=a/b;
			System.out.println(c);
			
		} 
		catch (ArithmeticException e)
		{
			System.out.println("this operation is not possible we cant divide by 0 with any number ");
		}
	
		

	}

}

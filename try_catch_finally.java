package ExceptionHandling;

public class try_catch_finally {

	public static void main(String[] args) {
		
		int a=20,b=2,c;
		c=a/b;
		
		//case 1 if no exception occure in program 
		//then the statement= 1,2,3,5,6 get executed
		try
		
		{
			System.out.println("statement 1 executed");
			System.out.println(c);//statement 2
			System.out.println("statement 3 executed");
			
		} 
		
		catch (ArithmeticException e) 
		
		{
			// TODO: handle exception
			System.out.println("can not divided by zero statement 4");
		}
		
		finally
		
		{
			System.out.println("statement 5 executed");
		}
		
		System.out.println("statement 6 executed");

	}

}

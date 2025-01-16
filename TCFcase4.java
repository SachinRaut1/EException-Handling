package ExceptionHandling;

public class TCFcase4 {

	public static void main(String[] args) 
	{

		//case 4 if the exception occure in ststement 2 
		//and also exception occure in catch block 
		//then the statement= 1,5 get executed
		//abnormal termination
		try
		
		{
			System.out.println("statement 1 executed");
			
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);//statement 2 excption occure
			System.out.println("statement 3 executed");
			
		} 
		
		catch (ArithmeticException e) //exception missmatch
		
		{
			int x=20,y=0,z;
			z=x/y;
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

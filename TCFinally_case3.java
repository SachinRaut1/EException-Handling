package ExceptionHandling;

public class TCFinally_case3 {

	public static void main(String[] args) {
		
		
		//case 3 if the exception occure in ststement 2 
		//in catch block exception is missmatch  
		//then the statement= 1,5,6 get executed
		//abnormal termination
		try
		
		{
			System.out.println("statement 1 executed");
			
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);//statement 2 excption occure
			System.out.println("statement 3 executed");
			
		} 
		
		catch (NullPointerException e) //exception missmatch
		
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

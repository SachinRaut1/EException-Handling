package ExceptionHandling;

public class TCFcase2 {
	

		public static void main(String[] args) 
		{
			
			//case 2 if there is  exception occure in program 
			//then the statement= 1,4,5,6 get executed
			//normal termination
			try
			{
				System.out.println("statement 1 executed");

				int a=20,b=0,c;
				c=a/b;
				System.out.println(c);//statement 2 //exception occure in ststement 2
				System.out.println("statement 3 executed");
				
			} 
			
			catch (ArithmeticException a1) 
			
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

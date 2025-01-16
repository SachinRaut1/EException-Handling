package ExceptionHandling;

public class TFCcase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//case 4 if the exception occure in ststement 2 
		//and also exception occure in catch block 
		//or exception also occur in finally block
		//then the statement= 1 get executed
		
		//this is only for practice otherwise we have to put the exception only in try block 
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
					System.out.println(z);
					// TODO: handle exception
					System.out.println("can not divided by zero statement 4");
				}
				
				finally
				
				{
					int x1=20,y1=0,z1;
					z1=x1/y1;
					System.out.println(z1);
					System.out.println("statement 5 executed");
				}
				
				System.out.println("statement 6 executed");

	}

}

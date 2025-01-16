package ExceptionHandling;

public class Nested_Finally {

	public static void main(String[] args) {
		
		try 
		{
			String str="sachinraut";
			System.out.println(str.toUpperCase());//1
		} 
		catch (NullPointerException n) 
		{
			System.out.println("Null can't be casted 2:"+n);
		}
		
		finally
		{
			System.out.println("finally block start to execute the code 3");
			try 
			{
				System.out.println(10/0);//4
			} 
			
			catch (ArithmeticException a) 
			
			{
				System.out.println("0 can't divided by any no 5:"+a);// TODO: handle exception
			}
			
			finally
			{
				System.out.println("security related code 6");
			}
			
		}
		System.out.println("statement 7 executed");

	}

}

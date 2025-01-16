package ExceptionHandling;

public class Nested_Catch_Block {

	public static void main(String[] args) {
		
		
		try 
		{
			System.out.println(10/0);//s1
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("can't divided by zero:"+e);//2
			
			
			try 
			{
			String str="SACHIN";
			System.out.println(str.toLowerCase());//3
			} 
			catch (NullPointerException n) 
			{
				
				System.out.println("null can't be converted in string:"+n);//4
			}
			
			
		}
		System.out.println("Statement 5 get executed");//5

	}

}

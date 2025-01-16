package ExceptionHandling;

public class NFException {

	//3. NumberFormatException
	//In java, variables have data types and certain operations are compatible with specific data types.
	//Some functions are to be performed on numeric values, 
	//but if a variable with an incompatible data type like string is given as an input, 
	//it results in NumberFormatException.
//	For example, trying to convert string into digit.
	//we can't convert string value into integer
	public static void main(String[] args)
	{
		String str="sachin";
		String str1="123";
		
		int b=Integer.parseInt(str1);
		System.out.println(b);
		
		try 
		{
			int a=Integer.parseInt(str);//this is risky code
			System.out.println(a);
			
		} 
		catch (NumberFormatException n) 
		{
			// TODO: handle exception
			System.out.println("String value cannot be converted to integer");
		}
		System.out.println("main method executed");
		

	}

}

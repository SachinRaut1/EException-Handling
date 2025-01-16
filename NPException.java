package ExceptionHandling;

public class NPException {

	//2. NullPointerException
	//NullPointerException occurs when a user tries to access variable that stores null values.
	//For example, if a variable stores null value and the user tries to perform 
	//any operation on that variable throws NullPointerException
		public static void main(String[] args) {
			
			String str1="sachin";
			String str=null;
			try 
			{
				System.out.println(str1.toUpperCase());
				System.out.println(str.toUpperCase());
				
				
			} 
			catch (NullPointerException n)
			{
				System.out.println("null can't be casted");
			}

}
}

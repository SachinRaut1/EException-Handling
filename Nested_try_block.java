package ExceptionHandling;

public class Nested_try_block {

	public static void main(String[] args) {


		try 
		{
			//outer try block
			try 
			{
				System.out.println("Inner try block with high risky code get executed");
				int arr[]= {10,20,30};
				System.out.println(arr[2]);
				
			}
			catch (IndexOutOfBoundsException i)
			{
				// TODO: handle exception
				System.out.println(i);
				System.out.println("inner catch block get executed");
			}
			
			System.out.println("outer try block with low risky code get executed");
			System.out.println(10/0);//can't divide by zero
			
			
		} 
		
		//outer catch block
		catch (ArithmeticException a)
		{
			// TODO: handle exception
			System.out.println(a);
			System.out.println("outer catch block get executed");
		}
		System.out.println("Statement 6 get executed");

	}

}

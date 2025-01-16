package ExceptionHandling;

public class Multiple_trycatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we use multiple try catch block
		//when we want to handle 1 or many exception in one shot
		
		try 
		{
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);
		} 
		catch (ArithmeticException e) 
		
		{
			System.out.println("can't didided by zero");
			// TODO: handle exception
		}
		
		try 
		{
			int arr[]= {1,2,3,4,5,6};
			System.out.println(arr[7]);
		} 
		catch (IndexOutOfBoundsException e) 
		{
			System.out.println("out of array limit ");
			// TODO: handle exception
		}

	}

}

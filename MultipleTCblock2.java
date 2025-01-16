package ExceptionHandling;

public class MultipleTCblock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//we use multiple try catch block
		//if there is a no exception occure in try block  then the both try block get executed
		//then the both catch block are not executed
				
				try 
				{
					int a=20,b=2,c;
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
					System.out.println(arr[3]);
				} 
				catch (IndexOutOfBoundsException e) 
				{
					System.out.println("out of array limit ");
					// TODO: handle exception
				}

	}

}

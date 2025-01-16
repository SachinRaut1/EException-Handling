package ExceptionHandling;

public class IOOBException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		try
		{
			int[] arr= {10,2,30,4,40,50};
			System.out.println(arr[8]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
			// TODO: handle exception
			System.out.println("we don't have a 8 length that why we get a exception");
			
		}
		System.out.println("main method ended");

	}

	}



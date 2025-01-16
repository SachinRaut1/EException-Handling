


	package ExceptionHandling;

	import java.util.Scanner;
	//Custome Exception
	class NotEligibleException extends RuntimeException{
		NotEligibleException(String msg)
		{
			super(msg);
		}
	}

	public class Custome_Exception {

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age: ");
			  
			int age=sc.nextInt();
			try
			{
			if(age<18)
			{
				throw new NotEligibleException("you are not Eligible for vote");
			}
			else
			{
				System.out.println("congrats you are Eligible for vote");
			}
			}
			catch(NotEligibleException e)
			{
				System.out.println(e);
			}
			System.out.println("voting bank");

		}

	}


package ExceptionHandling;

public class Throws_Keyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			
			try
			{
				System.out.println(i);
				Thread.sleep(1000);
				
			} 
			
			catch (Exception e) 
			{
				System.out.println(e);
			}

	}

	}}

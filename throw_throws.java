package ExceptionHandling;

public class throw_throws {
	
	void div(int a,int b) throws  ArithmeticException	
	//it is non static method thats why we have to create object in main metod
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		throw_throws t=new throw_throws();
		t.div(10, 0);
		
		

	}

}

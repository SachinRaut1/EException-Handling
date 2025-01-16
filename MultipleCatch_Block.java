package ExceptionHandling;

public class MultipleCatch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			//ArithmeticException
			int a=10,b=2,c;
			c=a/b;
			System.out.println(c);//5
			
			//IndexOutOfBoundException
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[3]);//4
			
			//NullPointerException
			String str="sachinraut";
			System.out.println(str.toUpperCase());//SACHINRAUT
			
//			String str2="null";
//			System.out.println(str.toUpperCase());
			
			////NumberFormatException
			String str1="123";
			int z=Integer.parseInt(str1);
			System.out.println(z);//123
			
			//NumberFormatException
			String m="sachin";
			int x=Integer.parseInt(m);
			System.out.println(x);
			
			
		}
		catch (ArithmeticException a) 
		{
			System.out.println("ArithmeticException");
			// TODO: handle exception
		}
		
		catch (IndexOutOfBoundsException i) 
		{
			// TODO: handle exception
			System.out.println("IndexOutOfBoundException");
		}
		
		catch (NullPointerException n) 
		{
			// TODO: handle exception
			System.out.println("null can't be casted");
			System.out.println("NullPointerException");
		}
		
//		catch (NumberFormatException nf) 
//		{
//			// TODO: handle exception
//			System.out.println("NumberFormatException  we can't convert string value into integer");
//			
//		}
		
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("it is a parent class of all exception");
		}

	}

}

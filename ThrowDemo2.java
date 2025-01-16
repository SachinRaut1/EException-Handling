package ExceptionHandling;

public class ThrowDemo2 {
	  public static void main(String[] args) {
		    checkAge(17); // Set age to 15 (which is below 18...)
		  }
	static void checkAge(int age) {
	    if (age <= 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    } else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }

	
}
	










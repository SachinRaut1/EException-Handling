package ExceptionHandling;

public class Try_catch_Throws1 {
	//m2 to method can't handle exception so the m2 method throws the exception to main method 
	//and m2 method caller is m2();
	public static void m2() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}

	}
//main method also can't handle exception so the main method throws the exception to main method 
	//caller and the main method caller is jvm
	public static void main(String[] args) throws InterruptedException {
		m2();

	}

}

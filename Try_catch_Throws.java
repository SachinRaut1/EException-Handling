package ExceptionHandling;

public class Try_catch_Throws {

	public static void m2() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}

	}

	public static void main(String[] args)  {
		
		try {
			m2();
			System.out.println(10/0);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception handled");
		}
		System.out.println("method ended");

	}

}

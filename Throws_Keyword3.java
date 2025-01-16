package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class Throws_Keyword3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\throws3.txt");
		try
		{
			boolean newFile=f.createNewFile();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

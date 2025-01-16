package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class Throws_keyword2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\throws.txt");
		Boolean newFile=f.createNewFile();
		
		if(newFile)
		{
			System.out.println("file created");
		}
		else
		{
			System.out.println("file not created");
		}

	}

}

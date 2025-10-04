package exception;
import java.io.IOException;

public class E4 {
	public static void main(String[] args) {
		try {
			readFile();
		}catch (IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		}
	}
	
	//Method does not declare 'throws' for the IOException
	public static void readFile() {
		throw new IOException("File not found."); //This will cause a compilations error
	}
}

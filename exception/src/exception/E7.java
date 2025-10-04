package exception;
import java.io.*;

public class E7 {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("example.txt")); //open a file
			System.out.println("First line:" + reader.readLine()); //read the firstline
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("An I/O error occurred.");
		} finally {
			try {
				if(reader != null) {
					reader.close(); //ensure the resource is closed
					System.out.println("BufferedReader closed.");
				}
			}catch (IOException e) {
				System.out.println("Error closing BufferedReader.");
			}
		}
	}
}

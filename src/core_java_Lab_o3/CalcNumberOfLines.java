package core_java_Lab_o3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CalcNumberOfLines {

	public static void main(String[] args) throws IOException {

		int numberOfLine = 1, numberOfWords = 0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter File name: ");
		String str = sc.nextLine();
		FileInputStream f = new FileInputStream(str);
		int numberOfCharacters = f.available();
		System.out.println();
		for (int i = 0; i < numberOfCharacters; i++) {
			ch = (char) f.read();
			if (ch == '\n')
				numberOfLine++;
			else if (ch == ' ')
				numberOfWords++;

		}
		System.out.println("\nNumber of lines : " + numberOfLine);
		System.out.println("\nNumber of words : " + (numberOfLine + numberOfWords));
		System.out.println("\nNumber of characters : " + numberOfCharacters);
		sc.close();
		f.close();
	}

}
//C:\Users\kosridha\Desktop\Capgemini\Capgemini pdfs\books and documents\Module-1\Core Java 8+Database&SQL+JDBC\LabBook\JEE FS-Core Java 8 - Labbook.docx
/*Enter File name: C:\Users\kosridha\Desktop\Capgemini\Capgemini pdfs\books and documents\Module-1\Core Java 8+Database&SQL+JDBC\LabBook\JEE FS-Core Java 8 - Labbook.docx


Number of lines : 502

Number of words : 1051

Number of characters : 125653
*/
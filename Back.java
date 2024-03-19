import java.util.*;
import java.io.*;
public class Back {
	public static void main(String[] args) throws IOException {
		Scanner myScanner = new Scanner(new File("Back.dat"));
		int numberOfLines = myScanner.nextInt();
		String line = "";
		String backwards = "";
		String output = "";
		for (int a = 0; a<numberOfLines; a++) {
			line = myScanner.next();
			for (int b = line.length()-1; b>=0; b--) {
				backwards = backwards + line.charAt(b);
			}
			if (line.equals(backwards)) {
			} else {
				output = "not ";
			}
			System.out.println(output + "same");
			output = "";
		}
	}
}
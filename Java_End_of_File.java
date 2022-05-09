import java.util.Scanner;

public class Java_End_of_File {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 1;
		while (s.hasNext()) {
			String a = s.nextLine();
			System.out.println(i + " " + a);
			i++;
		}
	}
}

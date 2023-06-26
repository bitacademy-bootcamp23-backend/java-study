package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();

		System.out.println(text);
		
		System.out.println(text.length());
		System.out.println(text.charAt(0));
		System.out.println(text.charAt(1));
		
		scanner.close();
	}

}

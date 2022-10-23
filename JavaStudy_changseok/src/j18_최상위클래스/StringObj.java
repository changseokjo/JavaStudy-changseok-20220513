package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		String name ="조창석";
		String name2 = "조창석";
		
		System.out.println(name == name2);

		Scanner scanner = new Scanner(System.in);
		System.out.print("이름1: ");
		name = scanner.nextLine();
		System.out.print("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		
		name = new String("조창석");
		name2 = new String("조창석");
		
		System.out.println(name == name2);
	}

}

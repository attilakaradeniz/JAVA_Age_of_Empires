package Age_of_Empires;

import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {

		 //System.out.println("Hello Age_of_Empires!");
		int inputAge;
		Scanner sc = new Scanner(System.in);
		System.out.print("Your age: ");
		inputAge = sc.nextInt();
		if(inputAge >= 0) {
			System.out.println(String.format("%%d:   ~%d~", inputAge));
			System.out.println(String.format("%%+d:  ~+%d~", inputAge));
			System.out.println(String.format("%% d:  ~% d~", inputAge));
			System.out.println(String.format("%%5d:  ~%5d~", inputAge));
			System.out.println(String.format("%%05d: ~%05d~", inputAge));
			System.out.println(String.format("%%-5d: ~%-5d~", inputAge));
			System.out.println(String.format("%%#x:  ~0x%h~", inputAge));
		} else {
			System.out.println(String.format("%%d:   ~%d~", inputAge));
			System.out.println(String.format("%%+d:  ~%d~", inputAge));
			System.out.println(String.format("%% d:  ~% d~", inputAge));
			System.out.println(String.format("%%5d:  ~%5d~", inputAge));
			System.out.println(String.format("%%05d: ~%05d~", inputAge));
			System.out.println(String.format("%%-5d: ~%-5d~", inputAge));
			System.out.println(String.format("%%#x:  ~0x%h~", inputAge));
		}
	}


}

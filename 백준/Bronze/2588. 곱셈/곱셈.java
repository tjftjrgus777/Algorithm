import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		String num2 = in.next();	
		System.out.println(num1*(num2.charAt(2)-'0'));
		System.out.println(num1*(num2.charAt(1)-'0'));
		System.out.println(num1*(num2.charAt(0)-'0'));
		System.out.println(num1*Integer.parseInt(num2));
		
		
	}		
	
}

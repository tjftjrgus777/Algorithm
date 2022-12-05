import java.util.Scanner;

class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int min = A*60+B+C;
		int min1;
		min1 = min%60;
		int hour = min/60;
		hour = hour%24;
		System.out.println(hour + " " + min1);				
	}      
}
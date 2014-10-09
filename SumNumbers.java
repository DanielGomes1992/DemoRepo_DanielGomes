import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();

		System.out.println(num1 + "+" + num2 + "=" + sum(num1, num2));
	}

	private static int sum(int num1, int num2) {
			
		int sum = num1 + num2;
		return sum;	
	}
		
}

import java.util.Scanner;
import java.lang.Math;

public class Task02 {

	public static void main(String[] args) {

		int a, b, c;
		int max;
		int min;
		int sum;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите A: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Ошибка. Введите А: ");
		}
		a = sc.nextInt();
		System.out.print("Введите B: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Ошибка. Введите В: ");
		}
		b = sc.nextInt();
		System.out.print("Введите C: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Ошибка. Введите C: ");
		}
		c = sc.nextInt();

		max = max(a, b, c);
		System.out.println("max = " + max);

		min = min(a, b, c);
		System.out.println("min = " + min);

		sum = sum(max, min);
		System.out.println("sum = " + sum);

	}

	public static int max(int a, int b, int c) {
		int max = a;

		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}

	public static int min(int a, int b, int c) {
		int min = a;

		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		return min;
	}

	public static int sum(int max, int min) {
		int sum;
		sum = max + min;
		return sum;
	}
}
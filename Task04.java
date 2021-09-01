import java.util.Random;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		int sum;
		int a;

		int[] mas = new int[10];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}
		System.out.println();

		a = sc(mas);

		sum = sum(mas, a);
		System.out.println("Сумма трех элементов: " + sum);
	}

	public static int sc(int[] mas) {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число - начало отсчета(0-9): ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Ошибка. Введите начало отсчета: ");
		}
		value = sc.nextInt();
		return value;
	}

	public static int sum(int[] mas, int a) {
		int sum = 0;
		if (a > mas.length - 3) {
			System.out.println();
			System.out.println("(В сумме было использовано меньше 3 чисел)");
			for (int i = a; i < mas.length; i++) {
				sum = sum + mas[i];
			}
		} else {
			for (int i = a; i < a + 3; i++) {
				sum = sum + mas[i];

			}
		}
		return sum;
	}
}
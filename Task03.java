import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		String x;
		String y;
		String sus;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Ошибка. Введите первое значение: ");
		}
		x = sc.nextLine();
		System.out.print("Введите второе число: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Ошибка. Введите второе значение: ");
		}
		y = sc.nextLine();

		sus = calculation(x, y);
		System.out.println("В числе " + sus + " цифр.");

	}

	public static String calculation(String x, String y) {
		String sus;
		if (x.length() > y.length()) {
			sus = x + " больше";
			// sus = "x";
		} else if (x.length() == y.length()) {
			sus = "равное количество";
		} else {
			sus = y + " больше";
			// sus = "y";
		}
		return sus;
	}

}
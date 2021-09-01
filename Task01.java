import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		double a, b;
		double nod;
		double nok;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите A: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Ошибка. Введите А: ");
		}
		a = sc.nextDouble();
		System.out.print("Введите B: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Ошибка. Введите В: ");
		}
		b = sc.nextDouble();

		nod = nod(a, b);
		System.out.println("Наибольший общий делитель = " + nod);
		nok = nok(a, b, nod);
		System.out.println("Наименьшее общее кратное = " + nok);
	}

	public static double nod(double a, double b) {
		double nod = 1;

		for (double i = a; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;
	}

	public static double nok(double a, double b, double nod) {
		double nok;
		nok = (a * b) / nod;

		return nok;
	}
}

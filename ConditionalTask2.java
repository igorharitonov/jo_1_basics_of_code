/*
 * Найти max{min(a, b), min(c, d)}
 */
package jo_1_basics_of_code;

import java.util.Scanner;

public class ConditionalTask2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;

		a = inputFromConsole("первую");
		b = inputFromConsole("вторую");
		c = inputFromConsole("третью");
		d = inputFromConsole("четвертую");

		if ((Math.min(a, b) > Math.min(c, d)) || (Math.min(a, b) == Math.min(c, d))) {
			System.out.print(Math.min(a, b));
		} else {
			System.out.print(Math.min(c, d));
		}
	}

	public static double inputFromConsole(String enumeration) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите " + enumeration + " переменную >>> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите " + enumeration + " переменную >>> ");
		}
		return sc.nextDouble();
	}
}

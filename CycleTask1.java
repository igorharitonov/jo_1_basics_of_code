/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */
package jo_1_basics_of_code;

import java.util.Scanner;

public class CycleTask1 {

	public static void main(String[] args) {
		int x;
		int result;

		result = 0;
		x = -1;

		/* Цикл для получения из ввода целого числа и проверки, положительное ли оно? */
		do {
			x = inputFromConsole();
		} while (x < 0);

		for (int i = 1; i <= x; i++) {
			result += i;
		}
		System.out.print(result);
	}

	private static int inputFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите целое положительное число >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите целое положительное число >>> ");
		}
		return sc.nextInt();
	}
}

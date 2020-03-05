/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой
 * треугольник, и если да, то будет ли он прямоугольным?
 */
package jo_1_basics_of_code;

import java.util.Scanner;

public class ConditionalTask1 {

	public static void main(String[] args) {
		int angle1;
		int angle2;
		boolean bulean;

		angle1 = inputFromConsole("первого");
		angle2 = inputFromConsole("второго");

		if ((angle1 + angle2) < 180) {
			bulean = (angle1 == 90) || (angle2 == 90);
			if (bulean) {
				System.out.print("Данный треугольник существует, и он - прямоугольный");
			} else {
				System.out.print("Данный треугольник существует, и он - не прямоугольный");
			}
		} else {
			System.out.print("Данный труегольник не существует");
		}
	}

	public static int inputFromConsole(String enumeration) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите размер " + enumeration + " угла >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите размер  " + enumeration + " угла >>> ");
		}
		return sc.nextInt();
	}
}

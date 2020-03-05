/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
package jo_1_basics_of_code;

public class CycleTask4 {

	public static void main(String[] args) {
		long mult;
		boolean print; // Вывод суммы, если цикл не был прерван
		double[] myArray; // Задаем массив, в который разместим ряд целых чисел

		mult = 1;
		print = true;
		myArray = new double[1000];

		/* Задаем элементам массива целые значения от 1 до 2.5 с помощью Math.random() */
		for (int i = 0; i < 1000; i++) {
			myArray[i] = Math.random() * 1.5 + 1;
		}

		/*Рассчитываем произведение значений квадратов первых двухсот элементов массива */
		for (int i = 0; i < 200; i++) {
			mult *= Math.pow(myArray[i], 2);
			if (mult == Long.MAX_VALUE) {
				System.out.print("Произведение квадратов первых " + i + " элементов больше 9223372036854775807L");
				print = false;
				break;
			}
		}
		if (print) {
			System.out.print("Произведение квадратов: " + mult);
		}
	}
}
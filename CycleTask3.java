/*
 * Найти сумму квадратов первых ста чисел
 */
package jo_1_basics_of_code;

public class CycleTask3 {

	public static void main(String[] args) {
		int sum;
		int start; // Стартовое значение
		int pace; // Шаг
		boolean print; // Вывод суммы, если цикл не был прерван

		sum = 0;
		start = 1;
		pace = 20;
		print = true;

		/* Рассчитываем сумму квадратов первых двухсот чисел, начиная от start с шагом pace */
		for (int i = start, j = 0; j < 200; i += pace, j++) {
			sum += Math.pow(i, 2);
			if (sum == Integer.MAX_VALUE) {
				System.out.print("Сумма первых " + j + " элементов больше 2147483647.");
				print = false;
				break;
			}
		}
		if (print) {
			System.out.print("Cумма равна " + sum);
		}
	}
}
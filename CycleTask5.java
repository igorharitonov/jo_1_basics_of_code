package jo_1_basics_of_code;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданному е. Общий член ряда имеет вид a = 1 /
 * Mat.pow(2, n) + 1 / Math.pow(3, n)
 */
public class CycleTask5 {

	public static void main(String[] args) {
		double sum; // Искомая сумма
		double e; // Заданное число е
		double a; // Член числового ряда
		int nEnd; // Количество членов числового ряда
		int n; // индекс члена числового ряда

		e = 0.3;
		sum = 0;
		n = 1;
		a = (1 / 2 + 1 / 3);
		nEnd = 50;

		while (n <= nEnd) {
			if (Math.abs(a) >= e) {
				sum += a;
			}
			a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			n++;
		}
		System.out.print(sum);
	}
}
package jo_1_basics_of_code;

/**
 * Вычислить значение функции Math.pow(x, 2) - 3x + 9, если x <= 3, и 1 /
 * (Math.pow(x, 3) + 6), если x >3
 */
public class ConditionalTask5 {

	public static void main(String[] args) {
		double x;
		double y;

		x = 8;

		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 3;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.print(y);
	}
}
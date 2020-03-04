package jo_1_basics_of_code;

/**
 * Найдите значение функции: z = ((a – 3 ) * b / 2) + c
 */
public class LinearTask1 {

	public static void main(String[] args) {
		int a;
		int c;
		double z;
		double b;

		a = 6;
		c = 3;
		b = 7;

		z = ((a - 3) * b / 2) + c;

		System.out.println(z);
	}
}
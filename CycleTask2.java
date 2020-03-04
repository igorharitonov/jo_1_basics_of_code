package jo_1_basics_of_code;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class CycleTask2 {

	public static void main(String[] args) {
		int a;
		int b;
		int h;

		a = -2;
		b = 8;
		h = 2;

		while (a <= b) {
			if (a > 2) {
				System.out.println(a);
				a += h;
			} else {
				System.out.println(-a);
				a += h;
			}
		}
	}
}
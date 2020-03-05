/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие
 */
package jo_1_basics_of_code;

public class ConditionalTask4 {

	public static void main(String[] args) {
		double A; // сторона А прямоугольного отверстия
		double B; // сторона В прямоугольного отверстия
		double x; // сторона x кирпича
		double y; // сторона y кирпича
		double z; // сторона z кирпича

		A = 4;
		B = 3.5;
		x = 6.5;
		y = 12;
		z = 25;

		if (Math.min(A, B) < Math.min(x, Math.min(y, z))) {
			System.out.print("Кирпич не проходит в прямоугольное отверстие");
		} else if ((A + B) >= (x + y + z - Math.max(x, Math.max(y, z)))) {
			System.out.print("Кирпич проходит в прямоугольное отверстие");
		} else {
			System.out.print("Кирпич не проходит в прямоугольное отверстие");
		}
	}
}
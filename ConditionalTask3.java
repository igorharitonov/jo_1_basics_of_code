package jo_1_basics_of_code;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
 * расположены на одной прямой
 */
public class ConditionalTask3 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;

		boolean a;

		x1 = 1;
		y1 = 1;
		x2 = 3;
		y2 = 2;
		x3 = 8;
		y3 = 4.5;

		a = ((y1 - y2) * x3 + (x2 - x1) * y3 + (x1 * y2 - x2 * y1)) == 0;

		if (a) {
			System.out.print("Точки лежат на одной прямой");
		} else {
			System.out.print("Точки не лежат на одной прямой");
		}
	}
}
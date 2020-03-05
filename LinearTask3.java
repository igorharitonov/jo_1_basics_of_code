/*
 * Вычислить значение выражения по формуле (Math.sin(x) + Math.cos(y)) /
 * (Math.cos(x) - Math.sin(y)) * Math.tan(x * y) (все переменные принимают
 * действительные значения)
 */
package jo_1_basics_of_code;

public class LinearTask3 {

	public static void main(String[] args) {
		double x;
		double y;
		double result;

		x = 10;
		y = 45;

		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.println(result);
	}
}
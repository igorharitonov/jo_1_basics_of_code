package jo_1_basics_of_code;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях). Поменять местами дробную и целую части числа и вывести
 * полученное значение числа.
 */
public class LinearTask4 {

	public static void main(String[] args) {
		double d1;
		double d2;
		int nnn;
		int ddd;
		double result;

		d1 = 245.679;

		nnn = (int) d1;
		ddd = (int) ((d1 - nnn) * 1000);
		d2 = nnn / 1000.0;
		result = ddd + d2;

		System.out.print("Изначальное число: " + d1 + "\nПреобразованное число: " + result);
	}
}
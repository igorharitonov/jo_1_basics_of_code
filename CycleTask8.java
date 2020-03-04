package jo_1_basics_of_code;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго
 * числа
 */
public class CycleTask8 {

	public static void main(String[] args) {
		int x1;
		double y1;
		int m; // Счетчик потворяющихся чисел
		String x2;
		String y2;
		char[] digitals1;
		char[] digitals2;
		boolean[] results;

		x1 = 1368977772;
		y1 = -3.0679;
		/** Преобразуем цифровые значения в String */
		x2 = String.valueOf(x1);
		y2 = String.valueOf(y1);
		/** Задаём длину массивов char */
		digitals1 = new char[x2.length()];
		digitals2 = new char[y2.length()];
		results = new boolean[x2.length()];
		/** Передаём значения, полученные методом charsFromString, в массивы char */
		digitals1 = charsFromString(x2);
		digitals2 = charsFromString(y2);
		
		for (int i = 0; i < x2.length(); i++) {
			for (char s2: digitals2) {
				if (digitals1[i] == s2) {
					results[i] = true;
					break;
				} else {
					results[i] = false;
				}
			}
		}
		
		/* Присваивает повторяющимся в рамках одного числа цифрам значение М */
		for (int i = 0; i < x2.length(); i++) {
			m = 0;
			
			for (char s1: digitals1) {
				if (digitals1[i] == s1) {
					m += 1;
				}
				if (m == 2) {
					digitals1[i] = 'M';
				}
			}
		}
		
		System.out.print("Повторяющиеся цифры в обоих заданных числах: ");
		for (int i = 0; i < x2.length(); i++) {
			if ((results[i]) && (digitals1[i] != 'M')) {
				System.out.print(digitals1[i] + " ");
			}
		}
	}
	
	/**
	 * Метод для преобразования строк с числами в массивы char
	 */
	private static char[] charsFromString(String str) {
		char[] str2;

		str2 = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.') {
				continue;
			}
			str2[i] = str.charAt(i);
		}
		return str2;
	}
}
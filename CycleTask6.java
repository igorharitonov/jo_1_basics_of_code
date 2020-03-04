package jo_1_basics_of_code;

/**
 * CODING UTF-8 Вывести на экран соответствий между символами и их
 * численными обозначениями в памяти компьютера
 */
public class CycleTask6 {

	public static void main(String[] args) {
		char sym; // Кодировка UTF-8

		sym = 'я';

		System.out.println("|  Символ  |  Код  |");
		for (int i = 33; i <= 1273; i++) {
			sym = (char) i;

			if ((i >= 128) && (i <= 160)) {
				continue;
			}
			System.out.println("|  " + sym + "       " + "|  " + (int) sym + "   |");
		}
	}
}

package jo_1_basics_of_code;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры
 */
public class CycleTask7 {

	public static void main(String[] args) {
		int m;
		int n;
		boolean ind; // Для проверки, обнаружен ли хотя бы один делитель
				
		m = -1;
		n = -1;
		
		do {
			m = inputFromConsole("m");
		} while (m < 0);
		do {
			n = inputFromConsole("n");
		} while (n < 0);
		
		for (int i = m; i <= n; i++) {
			ind = false;
			System.out.print("Делители натурального числа " + i + " в диапазоне [" + m + ", " + n +"],  кроме 1 и самого числа >>> ");
			/* Цикл для проверки, имеются ли делители в диапазоне [m, n] для числа i */
			for (int j = m; j <= n; j++) {
				if ((j == i) || (j == 1) || (i % j != 0)) {
					continue;
				} else {
					System.out.print(j + " ");
					ind = true;
				}
			}
			if (ind) {
				System.out.print("\n");
			} else {
				System.out.print("отсутствуют\n");
			}
		}
	}
	
	private static int inputFromConsole(String varMy) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите переменную " + varMy + " (целое и положительное число) >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите переменную " + varMy + " (целое и положительное число) >>> ");
		}
		return sc.nextInt(); 
	}	

}
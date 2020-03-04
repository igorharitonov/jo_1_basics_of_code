package jo_1_basics_of_code;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true, если
 * точка с координатами (х, у) принадлежит закрашенной области, и false — в
 * противном случае
 */
public class LinearTask6 {

	public static void main(String[] args) {
		boolean bulean;
		int xLimitMin; // Минимально возможное значение х
		int xLimitMax; // Максимально возможное значение х
		int yLimitMin; // Минимально возможное значение у
		int yLimitMax; // Минимально возможное значение у
		int x;
		int y;

		xLimitMin = -4;
		xLimitMax = 4;
		yLimitMin = -3;
		yLimitMax = 4;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите координату точки на оси x >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите координату точки на оси x >>> ");
		}
		x = sc.nextInt();

		System.out.print("Введите координату точки на оси y >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите координату точки на оси y >>> ");
		}
		y = sc.nextInt();

		bulean = (x >= xLimitMin) && (x <= xLimitMax) && (y >= yLimitMin) && (y <= yLimitMax);
		System.out.println("Координаты Вашей точки - x:" + x + ", y:" + y + ". Входит в окрашенную область: " + bulean);
	}
}
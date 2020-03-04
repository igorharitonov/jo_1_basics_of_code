package jo_1_basics_of_code;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах и
 * секундах в следующей форме: ННч ММмин SSc.
 */
public class LinearTask5 {

	public static void main(String[] args) {
		int sec;
		int hour;
		int minute;

		sec = 22_405_909;
		hour = 3600;
		minute = 60;

		hour = sec / hour; // Кол-во полных часов
		sec -= hour * 3600;// Остаток в секундах
		minute = sec / 60;// Кол-во полных минут
		sec -= minute * 60;// Остаток в секундах

		System.out.println(hour + "ч " + minute + "мин " + sec + "с");
	}
}
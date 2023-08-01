package home_work4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Calendar nowDate = Calendar.getInstance();
        int nowYear = nowDate.get(Calendar.YEAR);

        User[] arrayUsers = new User[]{
                new User("Valera", "Kanavalov", "Petrovich", new GregorianCalendar(1988, 11, 0), "justValera@mail.ru"),
                new User("Pety", "Akakiy", "Nikolaevich", new GregorianCalendar(1981, 2, 12), "justValera@mail.ru"),
                new User("Koly", "Litvinov", "Zadrotovich", new GregorianCalendar(1969, 1, 9), "justValera@mail.ru"),
                new User("Maksim", "Perdejov", "Vladislalvodich", new GregorianCalendar(1977, 17, 2), "justValera@mail.ru"),
                new User("Toly", "Zashkvarov", "Olegovich", new GregorianCalendar(1975, 10, 1), "justValera@mail.ru"),
                new User("Nikita", "Kekovich", "Borisovich", new GregorianCalendar(1995, 11, 3), "justValera@mail.ru"),
                new User("Pasha", "Lebrod", "Vasilievich", new GregorianCalendar(1998, 4, 3), "justValera@mail.ru"),
                new User("Vany", "Irving", "Maksimovich", new GregorianCalendar(1996, 5, 11), "justValera@mail.ru"),
                new User("Jeny", "Velikiy", "Pavlovich", new GregorianCalendar(2002, 7, 12), "justValera@mail.ru"),
                new User("Alex", "Tompson", "Petrovich", new GregorianCalendar(1966, 5, 2), "justValera@mail.ru"),
        };

        for (User arrayUser : arrayUsers) {
            if (nowYear - arrayUser.getBirthdate().get(Calendar.YEAR) > 44) {
                System.out.println(arrayUser.toString());
            }
        }
    }
}

package home_work4;

import java.util.Calendar;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private Calendar birthdate;
    private String email;

    public Calendar getBirthdate() {
        return birthdate;
    }

    public User(String name, String surname, String patronymic, Calendar birthdate, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "FIO: '" + name + " " + surname + " " + patronymic + '\'' +
                ", birthdate: " + birthdate.getTime() +
                ", email: '" + email + '\'' +
                '}';
    }
}

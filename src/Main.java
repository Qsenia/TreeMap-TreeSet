import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Анна", "Хольнова-Кумач", 4));
        people.add(new Person("Лидия", "Хольнова-Кумач", 7));
        people.add(new Person("Оксана", "Ван Дейк", 10));
        people.add(new Person("Ольга", "Ван Дейк", 15));
        people.add(new Person("Федор", "Кац", 36));
        people.add(new Person("Максим", "Ким", 2));
        people.add(new Person("Габриэль", "Аломар-и-Вильялонга", 11));

        System.out.println(people);
        Collections.sort(people,((o1, o2) ->  {
            int maxWords=3;
            String[] newSurname1;
            String[] newSurname2;

            newSurname1 = o1.getSurname().split("[ -]");
            newSurname2 = o2.getSurname().split("[ -]");

            if (newSurname2.length == newSurname1.length) {
                return Integer.compare(o2.getAge(), o1.getAge());

            }
            if ((newSurname2.length >= maxWords) && (newSurname1.length >= maxWords)) {

                return Integer.compare(o2.getAge(), o1.getAge());
            }
            if ((newSurname1.length < maxWords) && (newSurname2.length < maxWords)) {
                return Integer.compare(newSurname2.length, newSurname1.length);
            }
            return Integer.compare(newSurname2.length, newSurname1.length);



    }));
        System.out.println(people);
}
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Анна", "Хольнова-Кумач", 4));
        people.add(new Person("Лидия", "Хольнова-Кумач", 7));
        people.add(new Person("Оксана", "Ван Дейк", 10));
        people.add(new Person("Ольга", "Ван Дейк", 19));
        people.add(new Person("Федор", "Кац", 36));
        people.add(new Person("Максим", "Ким", 2));
        people.add(new Person("Габриэль", "Аломар-и-Вильялонга", 11));
        System.out.println(people);
        System.out.println();
        Collections.sort(people, new PersonNameNobilityComparator(3));
        System.out.println(people);
        System.out.println();
        people.removeIf(person -> person.getAge() < 18);
        System.out.println(people);
    }
}

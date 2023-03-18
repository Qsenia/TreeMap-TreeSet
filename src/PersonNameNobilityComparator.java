import java.util.Comparator;

public class PersonNameNobilityComparator implements Comparator<Person> {
    public int maxWords;
    public String[] newSurname1;
    public String[] newSurname2;

    public PersonNameNobilityComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
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

    }
}

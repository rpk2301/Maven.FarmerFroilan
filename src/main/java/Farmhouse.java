import java.util.ArrayList;
import java.util.List;

public class Farmhouse extends Storage<Person>{

    ArrayList<Person> people = new ArrayList<Person>();

    public void addPerson(Person person) {
        people.add(person);

    }

    public List<Person> getPerson() {
        return people;
    }

    public Person getPerson(int index) {
        if (index >= 0 && index < people.size()) {
            return people.get(index);
        }
        return null;

    }
}

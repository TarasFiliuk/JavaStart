package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class PersonList {
    public static void main(String[] args) {
//        ArrayList<Person>list=new ArrayList<>();


        Person vasya = new Person(1,35,"Vasya");
        Person baran = new Person(0,37,"Baran");
        Person eblan = new Person(3,48,"Eblan");
        Person koncha = new Person(2,45,"Koncha");
        TreeSet<Person> people = new TreeSet<>();
        people.add(vasya);
        people.add(baran);
        people.add(eblan);
        people.add(koncha);
        for (Person person : people) {
            System.out.println(person);
        }

    }


}

package List;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    int id;
    int age;
    String name;

    public Person() {
    }

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person o) {
return this.id - o.id;
    }
}

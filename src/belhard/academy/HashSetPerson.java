package belhard.academy;

import java.util.HashSet;
import java.util.Set;

public class HashSetPerson {

    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Ivanov", Gender.MALE);
        Person p2 = new Person("Anna", "Petrova", Gender.FEMALE);
        Person p3 = new Person("Ivan", "Ivanov", Gender.MALE);
        Person p4 = new Person("Anna", "Petrova", Gender.FEMALE);
        Person p5 = new Person("Nina", "Sidorova", Gender.FEMALE);

        Set<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        outputSet(people);
    }

    public static void outputSet(Set<Person> people) {
        System.out.println();
        int count = 0;
        for (Person p : people) {
            System.out.print("Person {firstName: " + p.getFirstName() +
                    ", lastName: " + p.getLastName() +
                    ", gender: " + p.getGender() + "} ");
            count++;
            System.out.println();
        }
        System.out.print("kolichestvo elementov: " + count);
        System.out.println();
    }
}

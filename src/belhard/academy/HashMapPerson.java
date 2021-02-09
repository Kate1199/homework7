package belhard.academy;

import java.util.HashMap;
import java.util.Map;

public class HashMapPerson {

    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Ivanov", Gender.MALE);
        Person p2 = new Person("Petr", "Petrov", Gender.MALE);
        Person p3 = new Person("Mariya", "Ivanova", Gender.FEMALE);
        Person p4 = new Person("Anna", "Petrova", Gender.FEMALE);
        Person p5 = new Person("Nina", "Sidorova", Gender.FEMALE);

        Map<Integer,Person> people=new HashMap<>();
        people.put(1,p1);
        people.put(2,p2);
        people.put(3,p3);
        people.put(4,p4);
        people.put(5,p5);

        outputMap(people);
    }

    public static void outputMap(Map<Integer,Person> map) {
        System.out.println();
        int count=0;
        for (Map.Entry<Integer,Person> keyValue:map.entrySet()) {
            System.out.println(keyValue.getKey()+" - "+keyValue.getValue());
            count++;
        }
        System.out.println("kolichestvo elementov: "+count);
    }
}

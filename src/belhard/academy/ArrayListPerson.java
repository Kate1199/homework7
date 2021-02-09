package belhard.academy;

import jdk.jshell.DeclarationSnippet;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPerson {

    public static void main(String[] args) {


        Person p1 = new Person("Ivan", "Ivanov", Gender.MALE);
        Person p2 = new Person("Petr", "Petrov", Gender.MALE);
        Person p3 = new Person("Mariya", "Ivanova", Gender.FEMALE);
        Person p4 = new Person("Anna", "Petrova", Gender.FEMALE);
        Person p5 = new Person("Nina", "Sidorova", Gender.FEMALE);

        ArrayList<String> pFirstNames = new ArrayList<>();
        pFirstNames.add(p1.getFirstName());
        pFirstNames.add(p2.getFirstName());
        pFirstNames.add(p3.getFirstName());
        pFirstNames.add(p4.getFirstName());
        pFirstNames.add(p5.getFirstName());

        outputList(pFirstNames);


    }

    public static void outputList(ArrayList<String> fN) {
        System.out.println();

        int count = 0;
        for (String name : fN) {
            System.out.print(name + " ");
            count++;
        }
        System.out.print(", kolichestvo elementov: " + count);
        System.out.println();
    }

}

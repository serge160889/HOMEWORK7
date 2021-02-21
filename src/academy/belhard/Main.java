package academy.belhard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Sergei", "Voitehovich", Gender.MALE);
        Person person2 = new Person("Ann", "Voitehovich", Gender.FEMALE);
        Person person3 = new Person("Liliya", "Novikova", Gender.FEMALE);
        Person person4 = new Person("Karpovich", "Aleksandr", Gender.MALE);
        Person person5 = new Person("Leonovich", "Aleksandr", Gender.MALE);
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);
        for (int i = 0; i < personArrayList.size(); i++)
            System.out.println(personArrayList.get(i));
        System.out.println("ArrayList содержит: \n" + personArrayList.size() + " человек");


//        boolean x1 = person1.equals(person2);
//        System.out.println(x1);
//        int c1 = person1.hashCode();
//        int c2 = person2.hashCode();
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(person1);
    }
}


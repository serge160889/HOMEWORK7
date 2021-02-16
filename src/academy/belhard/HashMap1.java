package academy.belhard;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {

        Person p1 = new Person("Sergei", "Voitehovich", Gender.MALE);
        Person p2 = new Person("Ann", "Voitehovich", Gender.FEMALE);
        Person p3 = new Person("Liliya", "Novikova", Gender.FEMALE);
        Person p4 = new Person("Karpovich", "Aleksandr", Gender.MALE);
        Person p5 = new Person("Leonovich", "Aleksandr", Gender.MALE);
        Map<Person, Integer> personIntegerMap = new HashMap<>();
        personIntegerMap.put(p1, 2);
        personIntegerMap.put(p2,10);
        personIntegerMap.put(p3,30);
        personIntegerMap.put(p4,40);
        personIntegerMap.put(p5,70);
        for (Map.Entry<Person,Integer>entry:personIntegerMap.entrySet())
            System.out.println(entry.getKey()+"-"+entry.getValue());
        System.out.println("The size of map is "+personIntegerMap.size());

    }
}


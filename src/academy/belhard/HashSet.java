package academy.belhard;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
       Person s1=new Person("Sergei","Voitehovich",Gender.MALE);
       Person s2=new Person("Sergei","Voitehovich",Gender.MALE);
       Person s3=new Person("Ylia","Ryabova",Gender.FEMALE);
       Person s4=new Person("Ylia","Ryabova",Gender.FEMALE);
       Person s5=new Person("Tom","Hardy",Gender.MALE);
       Set<Person> myList =new java.util.HashSet<>();
       myList.add(s1);
       myList.add(s2);
       myList.add(s3);
       myList.add(s4);
       myList.add(s5);
       for (Person i:myList)
           System.out.println(i);
        System.out.println("Number of different people="+myList.size());
    }
}

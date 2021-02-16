package academy.belhard;

public class Main {

    public static void main(String[] args) {
	Person person1=new Person("Sergei","Voitehovich",Gender.MALE);
	Person person2=new Person("Ann","Voitehovich",Gender.FEMALE);
	boolean x1=person1.equals(person2);
        System.out.println(x1);
        int c1=person1.hashCode();
        int c2=person2.hashCode();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(person1);
    }
}

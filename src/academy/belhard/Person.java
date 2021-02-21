package academy.belhard;

import java.util.Objects;

final class  Person {
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object path){
        if (this==path) return true;
        if (!(path instanceof Person)) return false;
        Person person=(Person) path;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &
                gender==person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName+lastName+gender);
    }

    @Override
    public String toString(){
        return "Person{"+
                "firstName="+firstName+
                ",lastName="+lastName+
                ", gender="+gender+
                '}';
    }
}
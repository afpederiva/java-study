package lab;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.setName("Slash");
        person2.setName("Duff");
        person3.setName("Axl");

        person1.setAge(61);
        person2.setAge(62);
        person3.setAge(64);

        person1.setFavoritePerson(person2);
        person2.setFavoritePerson(person3);
        person3.setFavoritePerson(person1);

        System.out.println();
        person1.introduce();
        System.out.println();
        person2.introduce();
        System.out.println();
        person3.introduce();
    }

}

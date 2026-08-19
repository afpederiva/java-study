package lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== ETAPA 1 - PERSON ==========");

        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Slash");
        person2.setName("Duff");

        person1.setAge(61);
        person2.setAge(62);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());


        System.out.println();
        System.out.println("========== ETAPA 2 - PERSON BEHAVIOR ==========");

        Person person3 = new Person();

        person3.setName("Axl");
        person3.setAge(64);

        // introduce() was added to Person.
        // Favorite person will be introduced in the next step.


        System.out.println();
        System.out.println("========== ETAPA 3 - PERSON RELATIONSHIPS ==========");

        person1.setFavoritePerson(person2);
        person2.setFavoritePerson(person3);
        person3.setFavoritePerson(person1);

        person1.introduce();

        System.out.println();
        person2.introduce();

        System.out.println();
        person3.introduce();


        System.out.println();
        System.out.println("========== ETAPA 4 - MUSICIAN ==========");

        Musician musician1 = new Musician("Guitar");

        musician1.setName("Slash");
        musician1.setAge(61);
        musician1.setFavoritePerson(person2);

        musician1.introduce();


        System.out.println();
        System.out.println("========== ETAPA 5 - BAND ==========");

        Musician musician2 = new Musician("Bass");
        Musician musician3 = new Musician("Piano");

        musician2.setName("Duff");
        musician3.setName("Axl");

        musician2.setAge(62);
        musician3.setAge(64);

        musician1.setFavoritePerson(musician2);
        musician2.setFavoritePerson(musician3);
        musician3.setFavoritePerson(musician1);

        List<Musician> membersGNR = new ArrayList<>();

        membersGNR.add(musician1);
        membersGNR.add(musician2);
        membersGNR.add(musician3);

        Band gunsNRoses = new Band("Guns N' Roses", membersGNR);

        System.out.println(gunsNRoses.getMembers());
    }
}
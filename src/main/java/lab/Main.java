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

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person3.getName());
        System.out.println(person3.getAge());


        person1.introduce();
        person2.introduce();
        person3.introduce();
    }

}

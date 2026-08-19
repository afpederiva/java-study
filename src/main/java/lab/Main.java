package lab;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Slash");
        person2.setName("Duff");

        person1.setAge(61);
        person2.setAge(62);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());

    }

}

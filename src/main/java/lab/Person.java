package lab;

public class Person {

    private String name;
    private int age;

    public void setName(String name) {

        if (name == null) {
            throw new IllegalArgumentException("Name must not be null");
        }

        if (name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank");
        }

        if (name.length() > 100) {
            throw new IllegalArgumentException("Name must not exceed 100 characters");
        }

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if (age < 0 || age > 125) {
            throw new IllegalArgumentException("Age must be between 0 and 125");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + getName() + " and I am " + getAge() + " years old.");
    }
}

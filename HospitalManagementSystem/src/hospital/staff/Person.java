package hospital.staff;

public abstract class Person {
    protected String name;
    protected int age;
    protected String gender;

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Get details of the person
    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}

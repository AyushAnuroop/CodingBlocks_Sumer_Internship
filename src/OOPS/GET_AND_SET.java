package OOPS;

public class GET_AND_SET {

    String name;
    String gender;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void walk(){
        System.out.println("Person is walking");
    }

    public void eat(){
        System.out.println("Person is eating");
    }

    public void sleep(){
        System.out.println("Person is sleeping");
    }

    public static void main(String[] args) {
        GET_AND_SET person = new GET_AND_SET();
        person.setName("Kartik");
        person.setGender("Male");
        person.setAge(25);

        System.out.println(person.getName());
        System.out.println(person.getGender());
        System.out.println(person.getAge());

        person.walk();
        person.sleep();
        person.eat();
    }
}

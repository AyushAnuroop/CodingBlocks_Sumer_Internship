package OOPS;

public class PersonClient {

    String name;
    String gender;
    int age;

    public void walk(){
        System.out.println(this.name+" is walking");
    }

    public void eat(){
        System.out.println("Person is eating");
    }

    public void sleep(){
        System.out.println("Person is sleeping");
    }

    public static void main(String[] args) {
        PersonClient me = new PersonClient();
        System.out.println(me);

//        System.out.println(me.name);
//        System.out.println(me.gender);
//        System.out.println(me.age);
//
        me.name = "Ayush Anuroop";
        me.gender = "Male";
        me.age = 20;

        System.out.println(me.name);
        System.out.println(me.gender);
        System.out.println(me.age);

        me.walk();


    }
}

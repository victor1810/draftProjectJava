public class ClassesAndObject {
    public static void main(String[] args) {
        System.out.println();
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.sayHallo();
        person1.speak();
        System.out.println();
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        person2.sayHallo();
        person2.speak();
    }
}

class Person{
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + " и мне " + age + " лет");
    }

    void sayHallo(){
        System.out.println("Привет!");
    }
}

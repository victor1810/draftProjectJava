public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут " + person1.name + " и мне " + person1.age + " лет");
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        System.out.println("Меня зовут " + person2.name + " и мне " + person2.age + " лет");
    }
}

class Person{
    String name;
    int age;
}

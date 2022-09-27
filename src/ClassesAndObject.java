public class ClassesAndObject {
    public static void main(String[] args) {
        System.out.println();
        Person person1 = new Person();
        person1.setNameAndAge("Роман", 50);
        person1.speak();
        person1.calculateYears();
        System.out.println();
        Person person2 = new Person();
        String s2 = "Вова";
        person2.setNameAndAge(s2, 20);
        person2.speak();
        person2.calculateYears();
    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    void speak() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Меня зовут " + name + " и мне " + age + " лет");
        }
    }

    void calculateYears() {
        int years = 65 - age;
        System.out.println("До пенсии осталось " + years + " лет ");
    }

    void sayHallo() {
        System.out.println("Привет!");
    }
}

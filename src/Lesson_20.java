public class Lesson_20 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        System.out.println(h1);
//        h1.printNumberOfPeople();
//        Human h2 = new Human("Tom", 30);
//        h2.printNumberOfPeople();
//        Human h3 = new Human("Rob", 50);
//        h3.printNumberOfPeople();
    }
}

class Human {

    private String name;
    private int age;
    public static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public String toString() {
        return name + ", " + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}

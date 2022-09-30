public class Lesson_19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Tom");
    }
}
class Human {
    String name;
    int age;

    public void setName(String myName) {
        name = myName;
    }
    public void setAge(int myAge) {
        age = myAge;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

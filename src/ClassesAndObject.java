public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-7);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
        person1.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Ты не ввёл своё имя");
        }
        else {name = userName;}
    }
    public String getName(){
        return  name;
    }
    public void setAge(int userAge){
        if (userAge < 0) {
            System.out.println("Возраст не может быть отрицательным");
        }
        else {age = userAge;}
    }
    public int getAge(){
        return age;
    }



    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
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

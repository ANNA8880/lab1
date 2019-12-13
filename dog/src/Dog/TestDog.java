package Dog;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sam", 3);
        Dog d2 = new Dog("John", 4);
        Dog d3 = new Dog("Walli");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
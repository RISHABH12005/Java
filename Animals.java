interface Animal {
    void Sound();
    String Type();
}
class Dog implements Animal {
    public void Sound() {
        System.out.println("Woof!");
    }
    public String Type() {
        return "Dog";
    }
}
class Cat implements Animal {
    public void Sound() {
        System.out.println("Meow!");
    }
    public String Type() {
        return "Cat";
    }
}
public class Animals {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal animal : animals) {
            System.out.println("Animal Type: " + animal.Type());
            animal.Sound();
        }
    }
}

//การเขียนโปรแกรมแบบ OOP ด้วยภาษา Java
class Animal {
    Animal() {
        System.out.println("create animal");
    }

    protected void finalize() {
        System.out.println("delete animal");
    }

    void sound() {
        System.out.println("animal makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("dog");
    }

    @Override
    protected void finalize() {
        System.out.println("delete dog");
    }

    @Override
    void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("cat");
    }

    @Override
    protected void finalize() {
        System.out.println("delete cat");
    }

    @Override
    void sound() {
        System.out.println("cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        a.sound();
        d.sound();
        c.sound();
    }
}

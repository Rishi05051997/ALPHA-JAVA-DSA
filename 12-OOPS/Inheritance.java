public class Inheritance {
    public static void main(String[] args) {
        Mammals m = new Mammals();

        m.walk();

        Fish f = new Fish();

        f.swim();

        Bird b = new Bird();

        b.fly();
    }
}

//// Base Or Parent Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breath");
    }
}

//// Child class
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("Swims in water");
// }
// }

//// child class
class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

//// child class
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

//// child class
class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}

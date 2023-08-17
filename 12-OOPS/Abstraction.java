public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();

        // c.eat();
        // c.walk();

        Mustang m = new Mustang();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor called");
        this.color = "brown";
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse class constructor called....");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang class constructor called....");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

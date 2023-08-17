public class Super_Keyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.getColor());
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        // super();
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }

    String getColor() {
        return this.color;
    }
}

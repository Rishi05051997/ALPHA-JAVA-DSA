public class Multiple_Inheritance {
    public static void main(String[] args) {
        C obj = new C(); // creating object of class C
        obj.execute1(); // calling method execute1
        obj.execute2(); // calling method execute2
    }
}

interface A {
    public abstract void execute1();
}

interface B {
    public abstract void execute2();
}

class C implements A, B {
    public void execute1() {
        System.out.println("Haii.. I am from execute1");
    }

    public void execute2() {
        System.out.println("Haii.. I am from execute2");
    }
}

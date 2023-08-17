public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); ////// created a pen object called "p1"
        // p1.setColor("red");
        // p1.setTip(6);

        // System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "vrushabhdhatrak";
        // myAcc.setPassword("jfhfh63828dgdhdh");

        Student s1 = new Student();
        s1.name = "Vrushabh";
        s1.roll = 3892;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        // System.out.println(s1.name);

        // Student s2 = new Student("Vrushabh", 121);
        // System.out.println(s2.name);
        // System.out.println(s2.roll);
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String newPassword) {
        password = newPassword;
    }
}

class Pen {
    ///// prop + functions
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColor() {
        return color;
    }

    int getTip() {
        return tip;
    }
}

// class Student {
// String name;
// int age;
// float percentage;

// void calculatePercentage(int phy, int chem, int maths) {
// percentage = (phy + chem + maths) / 3;
// }

// }

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    ///// shallow copy constructor
    // Student(Student s) {
    // marks = new int[3];
    // this.name = s.name;
    // this.roll = s.roll;
    // this.marks = s.marks;
    // }

    //// deep copy constructor
    Student(Student s) {
        marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    ////// Below one is the nothing but constructor of Student class
    Student() {
        marks = new int[3];
        System.out.println("constructor is called....");
    }

    ///// Below one is nothing but parameterized constructor
    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }
}

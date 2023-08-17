public class Static_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student("Raju", 234);
        System.out.println(
                "Name: " + s1.getName() + " " + "Roll: " + s1.getRoll() + " " + " School Name: " + Student.schoolName);
        Student s2 = new Student("Rani", 4578);
        System.out.println(
                "Name: " + s2.getName() + " " + "Roll: " + s2.getRoll() + " " + " School Name: " + Student.schoolName);
        Student s3 = new Student("Raghav", 7942);
        System.out.println(
                "Name: " + s3.getName() + " " + "Roll: " + s3.getRoll() + " " + " School Name: " + Student.schoolName);

    }
}

class Student {
    String name;
    int roll;

    static String schoolName = "XYZ";

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    // void setName(String name) {
    // this.name = name;
    // };

    String getName() {
        return this.name;
    };

    // void setRoll(int roll) {
    // this.roll = roll;
    // };

    int getRoll() {
        return this.roll;
    }

}

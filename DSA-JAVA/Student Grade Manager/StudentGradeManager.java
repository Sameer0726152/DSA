
class Student {

    String name;
    int rollNO;
    int marks;

    Student(String name, int rollNO, int marks) {
        this.name = name;
        this.rollNO = rollNO;
        this.marks = marks;
    }
}

public class StudentGradeManager {

    public static void main(String[] args) {
        Student s1 = new Student("Sameer", 17, 90);
        Student s2 = new Student("Rohit", 14, 88);
        Student s3 = new Student("Rahul", 48, 75);
        Student s4 = new Student("Dhruv", 11, 80);
        Student s5 = new Student("Nihar", 10, 70);
        Student[] arr = {s1, s2, s3, s4, s5};
        for (Student i : arr) {
            System.out.print(i.name + "    ");
            System.out.print(i.rollNO + "    ");
            System.out.print(i.marks + "    ");
            if (i.marks >= 90) {
                System.out.println("A");
            } else if (i.marks >= 80) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }
}

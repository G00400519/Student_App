package ie.atu.week5;

import java.util.Scanner;

public class Student_Details {

    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        Student_App Student1 = new Student_App();
        Student1.setName(name);

        System.out.println("Please enter your email");
        String email = input.next();
        Student1.setEmail(email);

        System.out.println("Please enter your course");
        String course = input.next();
        Student1.setCourse(course);

        System.out.print("Student1: " + Student1.getName());
        System.out.print(", " + Student1.getEmail());
        System.out.println(", " + Student1.getCourse());

        System.out.println("Please enter your name");
        name = input.next();
        Student_App Student2 = new Student_App();
        Student2.setName(name);

        System.out.println("Please enter your email");
        email = input.next();
        Student2.setEmail(email);

        System.out.println("Please enter your course");
        course = input.next();
        Student2.setCourse(course);

        System.out.print("Student2: " + Student2.getName());
        System.out.print(", " + Student2.getEmail());
        System.out.println(", " + Student2.getCourse());

        System.out.println("Please enter your name");
        name = input.next();
        System.out.println("Please enter your email");
        email = input.next();
        System.out.println("Please enter your course");
        course = input.next();
        Student_App Student3 = new Student_App(name, email, course);
        System.out.print("Student3: " + Student3.getName());
        System.out.print(", " + Student3.getEmail());
        System.out.println(", " + Student3.getCourse());
    }
}

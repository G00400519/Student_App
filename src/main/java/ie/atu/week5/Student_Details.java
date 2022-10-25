package ie.atu.week5;

import java.util.Scanner;

public class Student_Details {

    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Please enter your email");
        String email = input.next();

        System.out.println("Please enter your course");
        String course = input.next();

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }
}

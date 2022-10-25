package ie.atu.week5;

import java.util.Scanner;

public class Student_Details {

    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Name: " + name);
    }
}

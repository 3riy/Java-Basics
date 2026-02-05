// Write a Java program to display student information reading details from users.

import java.io.IOException;
import java.util.Scanner;

class Student_Details {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        int intVal = scanner.nextInt();
        System.out.println("You entered: " + intVal);
 
        System.out.print("Enter your marks: ");
        float floatVal = scanner.nextFloat();
        System.out.println("You entered: " + (float)floatVal);

        System.out.print("Enter your course: ");
        int stringVal = System.in.read();
        System.out.println("You entered: " + (char)stringVal);
    }
}

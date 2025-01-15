package UI;

import Controller.Controller;

import java.io.IOException;
import java.util.Scanner;

public class UI {
    private final Controller controller;
    private final Scanner scanner;

    public UI(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void menu() throws IOException {
        while (true) {
            System.out.println();
            System.out.println("1. Show all students whose names start with a specific letter");
            System.out.println("2. Show all Gryffindor students");
            System.out.println("3. Show house results");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    //handleStudentsByLetter();
                    break;
                case "2":
                    //printStudents(controller.getGryffindorStudents());
                    break;
                case "3":
                    //printHouseResults();
                    break;
                case "4":
                    System.out.println("Exiting the application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

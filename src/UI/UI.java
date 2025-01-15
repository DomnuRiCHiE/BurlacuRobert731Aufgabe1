package UI;

import Controller.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static Model.FileFunctionalities.writeToFile;

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
            System.out.println("1. Show all patients whose names start with a specific letter");
            System.out.println("2. Show all patients that have the fever symptom");
            System.out.println("3. Show number of cases per hospital");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    handlePatientsByLetter();
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

    private void handlePatientsByLetter() {
        System.out.print("Enter a capital letter: ");
        String letter = scanner.nextLine();
        controller.getPatientsByLetter(letter).forEach(System.out::println);
    }

    private void printPatients(List<String> logs) {
        if (logs.isEmpty()) {
            System.out.println("No students found.");
        } else {
            logs.forEach(System.out::println);
        }
    }

    private void printHospitalCases() throws IOException {
        writeToFile(controller.getHospitalCases(), "fallanzahl.txt");
    }
}

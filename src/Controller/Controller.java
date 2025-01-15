package Controller;

import Model.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Controller {
    private final List<Log> logEntries;

    public Controller(List<Log> logEntries) {
        this.logEntries = logEntries;
    }

    public List<String> getPatientsByLetter(String letter) {
        Set<String> uniquePatients = new HashSet<>(); // Eliminating students that show up more than once
        for (Log entry : logEntries) {
            String patient = entry.getPatient();
            if (patient.startsWith(String.valueOf(letter))) {
                uniquePatients.add(patient);
            }
        }
        return new ArrayList<>(uniquePatients); // Converting to List, printStudents needs a List parameter
    }


}

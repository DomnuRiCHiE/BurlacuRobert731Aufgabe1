package Controller;

import Model.Log;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static Model.FileFunctionalities.writeToFile;

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

    public List<String> getHospitalCases() throws IOException {
        Map<String, Integer> hospitalLogs = logEntries.stream()
                .collect(Collectors.groupingBy(
                        Log::getHospital,
                        Collectors.summingInt(Log::getId)
                ));

        List<String> processedHospitals = hospitalLogs.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .map(entry -> entry.getKey() + "&" + entry.getValue())
                .toList();

        return processedHospitals;
    }
}

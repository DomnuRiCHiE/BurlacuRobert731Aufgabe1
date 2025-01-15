package Model;

public class Log {
    private int id;
    private String patient;
    private String symptom;
    private String date;
    private String hospital;

    public Log(int id, String patient, String symptom, String date, String hospital) {
        this.id = id;
        this.patient = patient;
        this.symptom = symptom;
        this.date = date;
        this.hospital = hospital;
    }

    public Log(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", patient='" + patient + '\'' +
                ", symptom='" + symptom + '\'' +
                ", date='" + date + '\'' +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}

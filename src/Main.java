import Model.Log;
import Model.LogParser;
import Model.LogParserFactory;
import Controller.Controller;
import UI.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            LogParser parser = LogParserFactory.getParser("txt");
            List<Log> logEntries = parser.parse("fallakten.json");

            Controller controller = new Controller(logEntries);

            UI ui = new UI(controller);
            ui.menu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

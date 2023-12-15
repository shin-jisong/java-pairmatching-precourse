package pairmatching.model;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pairmatching.Application;

public class Crew {

    private final List<String> backendCrew;
    private final List<String> frontendCrew;

    public Crew() {
        this.backendCrew = readCrew("backend-crew.md");
        this.frontendCrew = readCrew("frontend-crew.md");
    }

    private List<String> readCrew(String crewCourse) {
        List<String> lines = new ArrayList<>();
        InputStream inputStream = Application.class.getClassLoader().getResourceAsStream(crewCourse);
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lines.add(line);
        }
        return lines;
    }
}

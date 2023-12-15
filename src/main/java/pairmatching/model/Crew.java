package pairmatching.model;

import java.util.List;

public class Crew {

    private final List<String> backendCrew;
    private final List<String> frontendCrew;

    public Crew(List<String> backendCrew, List<String> frontendCrew) {
        this.backendCrew = backendCrew;
        this.frontendCrew = frontendCrew;
    }
}

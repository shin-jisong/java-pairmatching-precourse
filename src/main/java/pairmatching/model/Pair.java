package pairmatching.model;

import java.util.List;

public class Pair {
    private final Course course;
    private final Level level;
    private final Crew crew;
    private List<String> crews;

    public Pair(String course, String level, String mission) {
        this.course = new Course(course);
        this.level = new Level(level, mission);
        this.crew = new Crew();
    }

    
}

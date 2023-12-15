package pairmatching.model;

import java.util.Arrays;
import java.util.List;

public class Course {

    private final List<String> courseName = Arrays.asList("백엔드", "프론트엔드");
    private final String currentCourse;

    public Course(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    public boolean compareCourse(String targetCourse) {
        return currentCourse.equals(targetCourse);
    }

}

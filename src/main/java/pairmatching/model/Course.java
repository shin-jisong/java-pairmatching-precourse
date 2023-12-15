package pairmatching.model;

import java.util.Arrays;
import java.util.List;
import pairmatching.exception.CourseException;

public class Course {

    private final List<String> courseName = Arrays.asList("백엔드", "프론트엔드");
    private final String currentCourse;

    public Course(String currentCourse) {
        validateCourse(currentCourse);
        this.currentCourse = currentCourse;
    }

    public boolean compareCourse(String targetCourse) {
        return currentCourse.equals(targetCourse);
    }

    private void validateCourse(String currentCourse) {
        if(!courseName.contains(currentCourse)) {
            throw new IllegalArgumentException(CourseException.INVALID_COURSE.getExceptionMessage());
        }
    }

}

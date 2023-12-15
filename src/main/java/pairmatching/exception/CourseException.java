package pairmatching.exception;

public enum CourseException {

    INVALID_COURSE("유효하지 않은 과정입니다. 다시 입력해 주세요.");

    private final String exceptionMessage;

    CourseException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return this.exceptionMessage;
    }
}

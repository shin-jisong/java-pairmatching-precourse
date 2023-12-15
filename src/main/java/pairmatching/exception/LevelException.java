package pairmatching.exception;

public enum LevelException {
    INVALID_LEVEL("유효하지 않은 레벨입니다. 다시 입력해 주세요.");

    private final String exceptionMessage;

    LevelException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return this.exceptionMessage;
    }
}

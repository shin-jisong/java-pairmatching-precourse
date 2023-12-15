package pairmatching.exception;

public enum LevelException {
    INVALID_LEVEL("유효하지 않은 레벨입니다. 다시 입력해 주세요."),
    INVALID_MISSION("유효하지 않은 미션입니다. 다시 입력해 주세요.");

    private final String exceptionMessage;

    LevelException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return this.exceptionMessage;
    }
}

package screenMatch.exceptions;

public class InvalidConversionYear extends RuntimeException{
    private String message;

    public InvalidConversionYear(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

package altn72.tpfilrouge.exceptions;

public class PassagerNonTrouveException extends IllegalStateException {
    public PassagerNonTrouveException(String messageErreur, Throwable causeException) {
        super(messageErreur, causeException);
    }

    public PassagerNonTrouveException(String messageErreur) {
        super(messageErreur);
    }
}

package de.fesere.hypermedia.cj.annotations.exceptions;

public class TransformationException extends RuntimeException {
    public TransformationException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransformationException(String message) {
        super(message);
    }
}

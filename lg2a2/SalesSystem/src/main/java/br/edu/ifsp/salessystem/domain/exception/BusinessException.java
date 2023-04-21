package br.edu.ifsp.salessystem.domain.exception;

public class BusinessException extends RuntimeException {

    public static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}

package br.edu.ifsp.salessystem.domain.exception;

public abstract class EntityNotFoundException extends BusinessException {

    public static final long SerialVersionUID = 1L;
    public EntityNotFoundException(String message) {
        super(message);
    }
}

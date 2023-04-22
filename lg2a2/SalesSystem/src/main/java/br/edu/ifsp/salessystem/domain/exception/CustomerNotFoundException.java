package br.edu.ifsp.salessystem.domain.exception;


public class CustomerNotFoundException extends EntityNotFoundException {
    public CustomerNotFoundException(String message) {
        super(message);
    }

    public CustomerNotFoundException(Long customerId) {
        this(String.format("There's no Customer registered with code %d", customerId));
    }
}

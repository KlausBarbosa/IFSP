package br.edu.ifsp.salessystem.domain.exception;

public class ZoneNotFoundException extends EntityNotFoundException {

    public static final long ServialVersionUID = 1L;

    public ZoneNotFoundException(String message) {
        super(message);
    }

    public ZoneNotFoundException(Long zoneId) {
        this(String.format("There's no zone registered with code %d", zoneId));
    }
}

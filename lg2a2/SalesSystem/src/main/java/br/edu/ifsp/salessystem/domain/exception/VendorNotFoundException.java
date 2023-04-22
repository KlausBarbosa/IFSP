package br.edu.ifsp.salessystem.domain.exception;

public class VendorNotFoundException extends EntityNotFoundException {
    public VendorNotFoundException(String message) {
        super(message);
    }

    public VendorNotFoundException(Long vendorId) {
        this(String.format("There's no vendor registered with id %d", vendorId));
    }
}

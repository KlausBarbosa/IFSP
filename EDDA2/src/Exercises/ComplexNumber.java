package Exercises;

public class ComplexNumber {

    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return real + ", " + imaginary +
                'i';
    }

    public void sum(ComplexNumber complexNumberB) {
        this.real += complexNumberB.getReal();
        this.imaginary += complexNumberB.getImaginary();
    }

    public void subtraction(ComplexNumber complexNumberB) {
        this.real -= complexNumberB.getReal();
        this.imaginary -= complexNumberB.getImaginary();
    }

    public double module() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }

}

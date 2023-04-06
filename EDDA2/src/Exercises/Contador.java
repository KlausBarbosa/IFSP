package Exercises;

public class Contador {

    private int value;


    public void zerar() {
        this.value = 0;
    }

    public void incrementar(int toSum) {
        this.value += toSum;
    }

    public int getValue() {
        return value;
    }
}

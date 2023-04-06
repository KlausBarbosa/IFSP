package Exercises;

import java.util.Objects;

public class Ponto2D {

    private double x;
    private double y;

    public Ponto2D() {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void movimentarPonto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ponto2D ponto2D = (Ponto2D) o;
        return Double.compare(ponto2D.x, x) == 0 && Double.compare(ponto2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Ponto2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distancePoints(Ponto2D pontoB) {
        double xab = this.getX() - pontoB.getX();
        double yab = this.getY() - pontoB.getY();

        return Math.sqrt((Math.pow(xab, 2) + Math.pow(yab, 2)));
    }
}

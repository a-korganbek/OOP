package lab2.Task1.parta;
public class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public String toString() {
        return "Cube [side=" + side + "]";
    }
}
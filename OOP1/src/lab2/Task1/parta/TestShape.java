package lab2.Task1.parta;
public class TestShape {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(3, 5);
        Shape3D sphere = new Sphere(4);
        Shape3D cube = new Cube(2);

        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("Surface Area: " + cylinder.surfaceArea());
        System.out.println();

        System.out.println(sphere);
        System.out.println("Volume: " + sphere.volume());
        System.out.println("Surface Area: " + sphere.surfaceArea());
        System.out.println();

        System.out.println(cube);
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface Area: " + cube.surfaceArea());
    }
}
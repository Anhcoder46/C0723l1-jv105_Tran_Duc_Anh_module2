package Access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius 1 = " + c1.getRadius());
        System.out.println("Area1 = " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("Radius 2 = " + c2.getRadius());
        System.out.println("Area 2 = " + c2.getArea());
    }
}

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", Which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println(" The area of a circle is: " + getArea());
        System.out.println(" Area  of circle after change: " + getArea() * percent);
    }
}

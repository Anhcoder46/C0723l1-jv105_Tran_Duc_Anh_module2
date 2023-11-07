public class Cylinder extends Circle {
    private double height = 5.0;
    Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder - a subclass of circle" + super.toString() + " and heigh = " + getHeight() + " has volume = " + getVolume();
    }
}

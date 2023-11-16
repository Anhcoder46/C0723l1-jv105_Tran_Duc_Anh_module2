public class Square extends Shape implements Colorable {
    private double length = 1.0 ;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public Square(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double isPerimeter(){
        return length * 4;
    }
    public double isArea(){
        return length * length;
    }

    @Override
    public String toString() {
        return "Square {" + "length = " + length + '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}

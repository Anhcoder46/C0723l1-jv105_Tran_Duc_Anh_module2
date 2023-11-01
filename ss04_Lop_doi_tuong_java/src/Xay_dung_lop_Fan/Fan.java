package Xay_dung_lop_Fan;

public class Fan {
    private final int SLOW = 1; // slow: chậm
    private final int MEDIUM = 2; // medium: trung bình
    private final int FAST = 3; // nhanh

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + " - Quat o trang thai bat.";
        } else {
            return "Color: " + color + ", Radius: " + radius + " - Quat o trang thai tat.";
        }
    }
}


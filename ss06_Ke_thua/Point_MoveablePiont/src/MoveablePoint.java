public class MoveablePoint extends Point {
    private float a;
    private float b;
    public MoveablePoint() {
    }

    public MoveablePoint(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public MoveablePoint(float x, float y, float a, float b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }


    public void setSpeed(float a, float b) {
        this.a = a;
        this.b = b;
    }
    public float[] getSpeed(float a, float b) {
        return new float[]{a, b};
    }

    @Override
    public String toString() {
        return "(x, y, speed) = " + getX() + ", " + getY() + ", " + getA() + ", " + getB();
    }
}

public class Rectangle extends TwoDShape {
    public Rectangle(double w, double h) {
        super(w, h);
    }

    public double calcArea() {
        return getWidth() * getHeight();
    }
}

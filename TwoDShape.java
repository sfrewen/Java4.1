public abstract class TwoDShape {
    private double width;
    private double height;

    // A default constructor
    public TwoDShape() {
    }

    // Parameterized donstructor to initialize height and width
    public TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal height and width
    public TwoDShape(double x) {
        width = height = x;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }
}

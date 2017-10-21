import java.awt.*;

public class Squre implements Shape {

    int i;
    Color color;

    public Squre(int i, Color color) {
        super();
        this.color = color;
        this.i = i;
    }

    public double size() {
        double area = (i * i);
        return area;
    }

    public Color color() {

        return color;
    }
}

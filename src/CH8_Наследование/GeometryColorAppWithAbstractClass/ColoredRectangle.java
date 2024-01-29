package CH8_Наследование.GeometryColorAppWithAbstractClass;

public class ColoredRectangle extends AbstractShape {

    private Color color;
    private double height;
    private double width;

    ColoredRectangle (Color color, double height, double width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }
    void displayInfo () {
        System.out.println("площадь прямоугольника  = " + calculateArea() + ", цвет: " + color);
    }
    double calculateArea() {
        return height * width;
    }
}

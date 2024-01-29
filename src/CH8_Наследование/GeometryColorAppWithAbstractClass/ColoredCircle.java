package CH8_Наследование.GeometryColorAppWithAbstractClass;

public class ColoredCircle extends AbstractShape {

    private Color color;
    private double radius;
    ColoredCircle (Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    void displayInfo() {
        System.out.println("Площадь круга равна " + calculateArea() + ", цвет: " + color);
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

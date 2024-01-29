package CH8_Наследование.GeometryApp;

public class Main {
    static void shape (Shape x) {
        x.displayInfo();
        x.calculateArea();
    }

    public static void main(String[] args) {

        Shape shape;

        Circle circle = new Circle(10);
        Rectancle rectancle = new Rectancle(5, 10);
        Triangle triangle = new Triangle(15, 20);

        shape(circle);
        shape(rectancle);
        shape(triangle);
    }
}

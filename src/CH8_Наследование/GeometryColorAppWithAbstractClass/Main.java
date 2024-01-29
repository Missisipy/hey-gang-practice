package CH8_Наследование.GeometryColorAppWithAbstractClass;

public class Main {
    static void getInfo(AbstractShape shape) {

        shape.displayInfo();
    }

    public static void main(String[] args) {

        AbstractShape shape;

        ColoredCircle circle = new ColoredCircle(Color.RED, 12.3);
        ColoredRectangle rectangle = new ColoredRectangle(Color.YELLOW, 16.9, 42.09);

        shape = circle;
        getInfo(shape);

        shape = rectangle;
        getInfo(shape);
    }
}

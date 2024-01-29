package CH8_Наследование.GeometryApp;

public class Circle extends Shape {
    private double rad;
    Circle (double rad) {
        this.rad = rad;
    }
    Circle () {
        this.rad = -1;
    }
    void calculateArea() {
        System.out.println("площадь равна" + (Math.PI * rad * rad));
    }
    void displayInfo () {
        System.out.println("круг радиусом " + rad);
    }
}

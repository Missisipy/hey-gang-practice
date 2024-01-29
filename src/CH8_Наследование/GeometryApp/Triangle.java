package CH8_Наследование.GeometryApp;

import CH8_Наследование.GeometryApp.Shape;

public class Triangle extends Shape {
    private double height;
    private double width;

    Triangle (double height, double width) {
        this.height = height;
        this.width = width;
    }
    void calculateArea() {
        System.out.println("площадь равна " + ((height * width) / 2));
    }
    void displayInfo () {
        System.out.println("треугольник высотой " + height + " и шириной " + width);
    }
}

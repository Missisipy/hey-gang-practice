package CH8_Наследование.GeometryApp;

public class Rectancle extends Shape {
    private double lenght;
    private double width;

    Rectancle (double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }
    void calculateArea () {
        System.out.println("Площадь равна " + lenght * width);
    }
    void displayInfo () {
        System.out.println("прямоугольник с длиной " + lenght + " и шириной " + width);
    }
}

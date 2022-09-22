package Shapes;
public class Triangle extends Shape{
    double base;
    double height;
    public Triangle(double height,double base){
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return base * height / 2;
    }
}

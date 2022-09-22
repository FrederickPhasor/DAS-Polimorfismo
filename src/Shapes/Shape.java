package Shapes;
public abstract class Shape implements Comparable<Shape>{
    public abstract double getArea();
    @Override
    public int compareTo(Shape shape) {
        double myArea = this.getArea();
        double otherShapeArea = shape.getArea();
        return myArea > otherShapeArea ? 1 : myArea < otherShapeArea ? -1 :0;
    }
}
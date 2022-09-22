package Shapes;
import java.util.Arrays;
public class ShapesController {
    public static void main(String[] args) {
        Shape[] shapesList = new Shape[3];
        shapesList[0] = new Square(4,4);
        shapesList[1] = new Rectangle(2,2);
        shapesList[2] = new Triangle(3,3);
        double totalArea = SumAreasInArray(shapesList);
        PrintToConsole(totalArea);
        PrintToConsole("This is the array without sorting :");
        PrintShapesNames(shapesList);
        SortByIncreasingArea(shapesList);
        PrintToConsole("This is the sorted array:");
        PrintShapesNames(shapesList);
    }
    static void PrintShapesNames(Shape[] shapesList){
        for (Shape shape: shapesList) {
            String shapeName = shape.getClass().getSimpleName();
            PrintToConsole(shapeName);
        }
    }
    static double SumAreasInArray(Shape[] shapesList){
        double result = 0;
        for (Shape shape : shapesList) {
            result += shape.getArea();
        }
        return result;
    }
    static void SortByIncreasingArea(Shape[] shapesList){
       Arrays.sort(shapesList);
    }
    static void PrintToConsole(Object message){
        System.out.println(message);
    }
}
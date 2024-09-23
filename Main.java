import Lesson1OOP.Animal.Dog;
import Lesson1OOP.Shape.Circle;
import Lesson1OOP.Shape.Rectangle;
import Lesson1OOP.Shape.Shape;
import Lesson1OOP.Shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();

        Shape rectangle = new Rectangle(10, 12);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(7, 9, 8);

        System.out.println("\nArea and perimeter of various shapes:");

        System.out.println("\nRectangle: Length-10, Width-12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter " + rectangle.getPerimeter());

        System.out.println("\nCircle Radius-5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\nTriangle Side1-7, Side2-9, Side3-8");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
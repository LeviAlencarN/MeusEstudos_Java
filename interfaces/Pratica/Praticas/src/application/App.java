package application;

import model_entities.AbstractShape;
import model_entities.Circle;
import model_entities.Rectangle;
import model_entities.Shape;
import model_enums.Color;

public class App {
    public static void main(String[] args) throws Exception {
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + s2.area());
    }
}

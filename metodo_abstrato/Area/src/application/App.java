package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesEnums.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Shape #" + i + " data: ");

            System.out.print("Rectangle or Circle? (r / c)");
            char shape = sc.next().charAt(0);

            System.out.print("Color: (BLACK, BLUE or RED)");
            Color color = Color.valueOf(sc.next());

            if(shape == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();
                
                list.add(new Rectangle(color, width, height));
            }

            else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
             
                list.add(new Circle(color, radius));
            }
        }

            System.out.println();
            System.out.println("SHAPE AREA: ");

            for(Shape sp : list){
                System.out.printf("%.2f%n", sp.area());
            }

        sc.close();
    }
}

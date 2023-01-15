import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Circle GreenCircle = new Circle(10.5,"Green");

        //insert colour
        System.out.println("insert colour");
        GreenCircle.setColor(reader.nextLine());


        //insert radius
        System.out.println("insert Radius");
        GreenCircle.setRadius(Double.parseDouble(reader.nextLine()));


        System.out.println("Radius is " + GreenCircle.getRadius());
        System.out.println("Colour is " + GreenCircle.getColor());
        System.out.println("Area is " + GreenCircle.getArea());


    }
}
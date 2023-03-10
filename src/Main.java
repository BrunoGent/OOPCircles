import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag= false;
        Scanner reader = new Scanner(System.in);

        Circle GreenCircle = new Circle(10.5,"Green");

        //insert colour
        System.out.println("insert colour");
        GreenCircle.setColor(reader.nextLine());

        //insert radius
        System.out.println("insert Radius");
        do { //loop to validate radius input
            try {
                GreenCircle.setRadius(Double.parseDouble(reader.nextLine()));
                flag = true; //true to exit the loop unless exception
            }
            catch (Exception e) {
                System.out.println("Input not valid, enter a number");
            }

        } while (!flag);


        System.out.println("Radius is " + GreenCircle.getRadius());
        System.out.println("Colour is " + GreenCircle.getColor());
        System.out.println("Area is " + GreenCircle.getArea());

    }
}
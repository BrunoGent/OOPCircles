public class Circle {

    double radius /*= 1.0*/;
    String color /*= "red"*/;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getArea(){ return (radius*radius)*Math.PI;}

    public double getRadius(){return radius;}

    public String getColor() {return color;}

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

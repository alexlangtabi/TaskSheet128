package TaskSheet128;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();
    String color();
}
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;
    public AbstractShape(String color, double width, double length) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
    static class Rectangle extends AbstractShape {
        public Rectangle(String color, double width, double length) {
            super(color, width, length);
        }
        public double calculateArea() {
            return width * length;
        }
        public double calculatePerimeter() {
            return 2 * (width + length);
        }
        public String color() {
            return color;
        }
    }
    static class Circle implements Shape {
        double radius;
        String color;
        public Circle(String color,double radius) {
            this.radius = radius;
            this.color=color;
        }
        public double calculateArea() {
            return (Math.PI * radius * radius);
        }
        public double calculatePerimeter() {
            return (2 * Math.PI * radius);
        }
        public String color(){
            return color;
        }
    }
    public static void main(String[] args) {
        AbstractShape rect = new Rectangle("red",5,10);
        System.out.println("Rectangle"+"\nColor : "+rect.color()+"\nAreas :" +rect.calculateArea() + "\nPerimeter :"+rect.calculatePerimeter());
        Shape cir = new Circle("yellow",3);
        System.out.println("Circle"+"\nColor : "+cir.color()+"\nAreas :" +cir.calculateArea() + "\nPerimeter :"+cir.calculatePerimeter());
    }
}



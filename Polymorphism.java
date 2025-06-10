class Shape{
    protected String shapeName;

    Shape(String shapeName){
        this.shapeName = shapeName;
    }

    public void area(){
        System.out.println("use to calculate area of " + shapeName);
    }
}

class Rectangle extends Shape{
    private int length, breadth;

    Rectangle(int length, int breadth){
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override // Annotation not necessary but a good practice
    public void area(){
        super.area();
        System.out.println("The area of the " + super.shapeName + " is " + (length * breadth));
    }
}

class Circle extends Shape{
    private int radius;

    Circle(int radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void area(){
        super.area();
        System.out.println("The area of the " + super.shapeName + " is " + (3.14 * radius * radius));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);
        Circle c = new Circle(4);

        r.area();
        c.area();
    }
}
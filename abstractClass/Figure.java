package abstractClass;

public abstract class Figure {
    abstract int calculateArea();
    abstract int calculatePerimeter();
    public String displayArea() {
        System.out.println("Area of Rectangle is : " + calculateArea());
        return null;
    }
    public String displayPerimeter() {
        System.out.println("Perimeter of Rectangle is : " + calculatePerimeter());
        return null;
    }
}

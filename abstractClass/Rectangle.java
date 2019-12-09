package abstractClass;

public class Rectangle extends Figure {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    int calculateArea() {
        int Area = length*breadth;
        return Area;
    }

    @Override
    int calculatePerimeter() {
        int Perimeter = 2*(length + breadth);
        return Perimeter;
    }

    @Override
    public String toString() {
        String string1 = displayArea();
        String string2 = displayPerimeter();
        return string1 + "\n" + string2;
    }
}

package c.liskov.substitution;

public class main {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(5, 10);
        useRectangle(rectangle);

        Square square = new Square(5);
        useRectangle(square);
    }

    public static void useRectangle(Rectangle rectangle) {
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        int area = rectangle.calculateArea();
        System.out.println("Area: " + area);
    }
}

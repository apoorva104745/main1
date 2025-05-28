class RectangleArea {
    int length;
    int breadth;

    // Constructor
    RectangleArea(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    int getArea() {
        return length * breadth;
    }
}

// RectanglePerimeter.java
class RectanglePerimeter extends RectangleArea {

    // Constructor
    RectanglePerimeter(int length, int breadth) {
        super(length, breadth);
    }

    // Method to calculate perimeter
    int getPerimeter() {
        return 2 * (length + breadth);
    }
}

// Main.java
public class Main1 {
    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter(10, 5);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
}
}
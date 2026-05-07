public class Rectangle {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private double length;
    private double width;
    
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
        this.point4 = p4;
        calculateDimensions();
    }
    
    public void calculateDimensions() {
        double side1 = point1.distance(point2);
        double side2 = point2.distance(point3);
        
        if (side1 >= side2) {
            this.length = side1;
            this.width = side2;
        } else {
            this.length = side2;
            this.width = side1;
        }
    }
    
    public double getArea() {
        return length * width;
    }
    
    public void display() {
        System.out.println("Rectangle Information:");
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println("Point 3: (" + point3.getX() + ", " + point3.getY() + ")");
        System.out.println("Point 4: (" + point4.getX() + ", " + point4.getY() + ")");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
}

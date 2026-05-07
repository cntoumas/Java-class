public class RectangleTest {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(0, 3);
        
        Rectangle rect = new Rectangle(p1, p2, p3, p4);
        rect.display();
        
        System.out.println();
        
        Point p5 = new Point(1, 1);
        Point p6 = new Point(9, 1);
        Point p7 = new Point(9, 5);
        Point p8 = new Point(1, 5);
        
        Rectangle rect2 = new Rectangle(p5, p6, p7, p8);
        rect2.display();
    }
}

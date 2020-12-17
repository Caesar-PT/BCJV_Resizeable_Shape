package Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("Trước khi tăng: ");
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        System.out.println("Sau khi tăng: ");
        rectangle.resize(10);
        System.out.println(rectangle);
    }
}

package Square;

public class SquareTess {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);
        square.resize(10);
        System.out.println(square);

    }
}

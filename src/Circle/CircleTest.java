package Circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle[] circles = new Circle[5];

        for (int i = 0; i < circles.length; i++) {
            System.out.println("Nhập vào bán kính thứ: " + (i+1));
            circles[i] = new Circle(scanner.nextDouble());
        }
        System.out.println("Bán kính của 5 hình tròn trước resize : ");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i].getRadius());
        }
        System.out.println("Sau khi resize: ");
        for (int i = 0; i < circles.length; i++) {
            circles[i].resize(Math.random()*100);
            System.out.println(circles[i].getRadius());
        }


    }
}

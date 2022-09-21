import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    //while (true) {
    System.out.println("Выберите фигуру, площадь которой необходимо узнать (окружность, треугольник, прямоугольник)");
    Scanner scanner1 = new Scanner(System.in);
    String figure = scanner1.nextLine();

    switch (figure) {
        case "окружность":
            System.out.println("Введите радиус окружности");
            Scanner scanner2 = new Scanner(System.in);
            double radius = scanner2.nextDouble();
            System.out.println("Площадь окружности = " + circleArea(radius));
            break;
        case "треугольник":
            System.out.println("Введите длину первой стороны треугольника");
            Scanner scanner3 = new Scanner(System.in);
            double side1 = scanner3.nextDouble();
            System.out.println("Введите длину второй стороны треугольника");
            Scanner scanner4 = new Scanner(System.in);
            double side2 = scanner4.nextDouble();
            System.out.println("Введите длину второй стороны треугольника");
            Scanner scanner5 = new Scanner(System.in);
            double side3 = scanner5.nextDouble();
            System.out.println("Площадь треугольника = " + triangleArea(side1, side2, side3));
            break;
        case "прямоугольник":
            System.out.println("Введите длину прямоугольника");
            Scanner scanner6 = new Scanner(System.in);
            double length = scanner6.nextDouble();
            System.out.println("Введите высоту треугольника");
            Scanner scanner7 = new Scanner(System.in);
            double width = scanner7.nextDouble();
            System.out.println("Площадь прямоугольника = " + rectangleArea(length, width));
            break;
        default:
            System.out.println("Вы не правильно выбрали фигуру");
    }

//}
        }
    static double circleArea(double radius) {return Math.PI * Math.pow(radius, 2);}
    static double triangleArea (double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));}
    static double rectangleArea (double length, double width) {return length * width;}
    }


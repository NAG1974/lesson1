import java.util.Scanner;

// Noskachev Alexey
public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Температура первой колбы");
        Scanner scanner = new Scanner(System.in);
        double temperature1 = scanner.nextDouble();
        System.out.println("Температура второй колбы");
        double temperature2 = scanner.nextDouble();
        boolean result = temperature1 > 100 && temperature2 < 100;
        if (result == true) {
            System.out.println(result + " Устройство работает верно");
        } else {
            System.out.println(result + " Устройство работает не верно");
        }

    }
}
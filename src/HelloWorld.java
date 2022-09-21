import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Какую валюту Вы хотите конвернтировать: Евро или Доллары?");
        Scanner scanner1 = new Scanner(System.in);
        String currency = scanner1.nextLine();
        System.out.println("Какую сумму Вы хотите конвертировать?");
        Scanner scanner2 = new Scanner(System.in);
        double amountCur = scanner2.nextDouble();
        double courseCur = 0.973;
        System.out.println("Курс за 1 доллар = " + courseCur + " евро.");
            if (currency == String.valueOf(currency.equalsIgnoreCase("Евро"))) {
                double total = EURtoUSDConverter(courseCur, amountCur);
                System.out.print("За " + amountCur + " Евро Вы получите - ");
                System.out.printf("%.2f", total);
                System.out.print("Долларов");
            } else {
                double total = USDtoEURConverter(courseCur, amountCur);
                System.out.print("За " + amountCur + " Долларов Вы получите - ");
                System.out.printf("%.2f", total);
                System.out.print("Евро");
            }

    }
    static double EURtoUSDConverter(double course, double amount) {
        return course / amount;
    }
    static double USDtoEURConverter(double course, double amount) {
        return amount * course;
    }
}


import java.util.Scanner;

public class HomeWork2Task2 {
    public static void main(String[] args) {
        System.out.println("привет! как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("в каком году ты родился?");
        int yearOfBirth = scanner.nextInt();
        System.out.println("в каком месяце ты родился?");
        int monthOfBirth = scanner.nextInt();
        int age = calculatingAge(yearOfBirth, monthOfBirth);
        if (age != 0) {
            System.out.printf("привет %s! тебе %d %s", name, age, correctDateFormat(age));
        } else {
            System.out.printf("привет %s! Поздравляю тебя с днем рождения! тебе %d %s", name, (2022 - yearOfBirth), correctDateFormat(2022 - yearOfBirth));
        }
    }

    static int calculatingAge(int year, int month) {
        int age;
        Scanner scanner = new Scanner(System.in);
        if (month == 8) {
            System.out.println("скажи пожалуйста день своего рождения");
            int dayOfBirth = scanner.nextInt();
            if (dayOfBirth == 18) {
                return 0;
            } else if (dayOfBirth > 18){
                age = 2021 - year;
                return age;
            } else {
                age = 2022 - year;
                return age;
            }
        } else if (month < 8) {
            age = 2022 - year;
            return age;
        } else {
            age = 2021 - year;
            return age;
        }
    }

    static String correctDateFormat(int age) {
        if (age % 10 == 0 || age % 10 >= 5) {
            return "лет";
        } else if (age % 10 == 1) {
            return "год";
        } else {
            return "года";
        }
    }


}
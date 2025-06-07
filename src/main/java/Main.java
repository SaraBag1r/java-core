import java.util.Scanner;

public class Main {
    public static void findEvenAndOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " -> четное");
        } else {
            System.out.println(number + " -> нечетное");
        }
    }

    public static void main(String[] args) {
        findEvenAndOdd(45);
        calculator(5, 3, '+');
        multiplicationTable();
        leapYear(2024);
        System.out.println(returnOddNum(5));
        ordinalNumbers();
        greetUntilExit();
        positiveNumber();


    }

    public static void calculator(double num1, double num2, char operator) {
        double result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Ошибка: деление на ноль!");
                return;
            }
        } else {
            System.out.println("Ошибка: неизвестный оператор");
            return;
        }
        System.out.println("Результат: " + result);

    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void leapYear(int year) {

        if (isLeapYear(year)) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static int returnOddNum(int number) {
        if (number % 2 == 0) {
            return number;
        }
        return 0;
    }

    public static void ordinalNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }


    public static void greetUntilExit() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("exit")) {
            System.out.println("Привет");
            input = scanner.nextLine();
        }

        System.out.println("Программа завершена");
    }
     public static void positiveNumber(){
         Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();

         while (number <0) {
             System.out.println("Повторите ввод");
             number = scanner.nextInt();
         }

         System.out.println("OK");
     }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задание 8");
        int monthlyContribution = 29000;
        System.out.println("Ежемесячный вклад " + monthlyContribution);
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total += monthlyContribution;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 9");
        double monthlyInterest = 0.01;
        double totalWithInterest = 0;
        for (int month = 1; month <= 12; month++) {
            totalWithInterest += monthlyContribution;
            totalWithInterest *= (1 + monthlyInterest);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) totalWithInterest + " рублей");
        }


        System.out.println("Задание 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }

    }
}
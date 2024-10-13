public class Main {
    public static void main(String[] args) {
        System.out.println("KONICHIVA SENSEI!");

        System.out.println("Задача 1");
        int salary = 15_000;
        int totalMoney = 2_459_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            while (total <= totalMoney) {
                total += salary;
                month++;
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("Задача 3");
        int year = 2010;
        long people = 12_000_000;
        int death = 8;
        int children = 17;
        for (; i < 10; i++) {
            year++;
            people += people / 1000 * (children - death);
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }

        System.out.println("Задача 4");
        int money = 15_000;
        int moneyMax = 12_000_000;
        int monthh = 0;
        while (money <= moneyMax) {
            money = (int) (money * 1.07);
            monthh++;
            System.out.println("Месяц " + monthh + ", сумма накопления равна " + money);
        }
    }
}

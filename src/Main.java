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
    }
}

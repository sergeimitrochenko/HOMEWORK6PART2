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
        System.out.println("Задача 5");
        money = 15_000;
        monthh = 0;
        while (money <= moneyMax) {
            money = (int) (money * 1.07);
            monthh++;
            if (monthh % 6 == 0) {
                System.out.println("Месяц " + monthh + ", сумма накопления равна " + money);
            }


            System.out.println("Задача 6");
            int moneyVasya = 15_000;
            int monthhVasya = 0;
            int term = 9 * 12;
            while (monthhVasya < term) {
                moneyVasya = (int) (moneyVasya * 1.07);
                monthhVasya++;
                if ((monthhVasya % 6) == 0) {
                    System.out.println("Месяц " + monthhVasya + ", сумма накопления равна " + moneyVasya);
                }
            }
            System.out.println("Задача 7");
            int Friday = 5;
            int friday1 = 5;
            int mo = 31;
            do {
                System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет");
                Friday += 7;
                System.out.println("Сегодня пятница, " + friday1 + "-е число. Необходимо подготовить отчет");
                friday1 += 7;
            }
            while (Friday < mo);
        }
        System.out.println("Задача 8");
        int Year = 2024;
        int start = Year - 200;
        int stop = Year + 100;
        for (i = start; i <= stop; i++)
            if (i % 79 == 0) {
                System.out.println(i);
            }
    }
}






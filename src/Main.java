public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println("");
        task2();
        System.out.println("");
        System.out.println("");
        task3();
        System.out.println("");
        task4();
        System.out.println("");
        task5();
        System.out.println("");
        task6();
        System.out.println("");
        task7();
        System.out.println("");
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 15_000;
        int sum = 0;
        int i = 1;
        while (sum < 2_459_000) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (sum + deposit) + " рублей");
            sum = sum + deposit;
            i++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (int m = 10; m > 0; m--) {
            System.out.print(m + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int peopleCountry = 12_000_000;
        int birthRate = peopleCountry / 1000 * 17;
        int deathRate = peopleCountry / 1000 * 8;
        for (int i = 1; i <= 10; i++) {
            int totalPeople = peopleCountry + birthRate - deathRate;
            System.out.println("Год " + i + ", численность населения составляет " + totalPeople + " человек");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15_000;
        double totalMoney = 0;
        double precent = 0.07;
        for (int i = 1; totalMoney <= 12_000_000; i++) {
            totalMoney = totalMoney + deposit;
            totalMoney = totalMoney + totalMoney * precent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Math.round(totalMoney) + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double deposit = 15_000;
        double totalMoney = 0;
        double precent = 0.07;
        for (int i = 1; totalMoney <= 12_000_000; i++) {
            totalMoney = totalMoney + deposit;
            totalMoney = totalMoney + totalMoney * precent;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + Math.round(totalMoney) + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double deposit = 15_000;
        double totalMoney = 0;
        double precent = 0.07;
        for (int i = 1; i <= 9 * 12; i++) {
            totalMoney = totalMoney + deposit;
            totalMoney = totalMoney + totalMoney * precent;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + Math.round(totalMoney) + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstDateFriday = 1;
        do {
            System.out.println("Сегодня пятница " + firstDateFriday + "-е число. Необходимо подготовить отчет");
            firstDateFriday += 7;
        }
        while (firstDateFriday <= 31);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int pastYears = year - 200;
        int futureYears = year + 100;
        for (int i = 0; i <= futureYears; i += 79) {
            if (i >= pastYears) {
                System.out.println(i);
            }
        }
    }
}

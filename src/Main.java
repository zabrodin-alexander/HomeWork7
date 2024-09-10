public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");

        int total = 0;
        int safe = 15000;
        int i = 0;
        while (total < 2_459_000) {
            total = total + safe;
            total = total + total / 100;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений ровна " + total + " рублей. ");
        }

        //task 2
        System.out.println("Task 2");

        int q = 0;
        while (q < 10) {
            q++;
            System.out.print("" + q + " ");
        }
        System.out.println();
        for (int w = 10; w > 0; w--) {
            System.out.print("" + w + " ");
        }
        System.out.println();

        //task 3
        System.out.println("Task 3");

        double population = 12_000_000;
        double birthRate = 17.0 / 1000;
        double deathRate = 8.0 / 1000;
        for (int year = 1; year <= 10; year++) {
            double birthPerYear = population * birthRate;
            double deathPerYear = population * deathRate;
            population += (birthPerYear - deathPerYear);
            System.out.println("Год " + year + ", численность населения составляет " + Math.round(population) + " человек.");
        }

        //task 4
        System.out.println("Task 4");

        double total1 = 0;
        int safe1 = 15000;
        int m = 1;
        while (total1 < 12_000_000) {
            m++;
            total1 = total1 + safe1;
            total1 = (total1 * 1.07);
            System.out.println("Месяц " + m + ", сумма накоплений ровна " + Math.round(total1) + " рублей.");
        }

        //task 5
        System.out.println("Task 5");

        double total2 = 0;
        int safe2 = 15000;
        int v = 1;
        while (total2 < 12_000_000) {
            v++;
            total2 = total2 + safe2;
            total2 = (total2 * 1.07);
            if (v % 6 == 0) {
                System.out.println("Месяц " + v + ", сумма накоплений ровна " + Math.round(total2) + " рублей.");
            }
        }

        //task 6
        System.out.println("Task 6");

        double total3 = 0;
        int safe3 = 15000;
        int x = 1;
        int time = 9 * 12;
        while (x <= time) {
            x++;
            total3 = total3 + safe3;
            total3 = (total3 * 1.07);
            if (x % 6 == 0) {
                System.out.println("Через " + x + " месяцев, сумма накоплений ровна " + Math.round(total3) + " рублей.");
            }
        }

        //task 7
        System.out.println("Task 7");

        int days = 31;
        int friday = 5;
        for (int day = friday; day <= days; day += 7) {
            System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
        }

        //task 8
        System.out.println("Task 8");

        int currentYear = 2024;
        int twoHundredBackward = currentYear - 200;
        int oneHundredForward = currentYear + 100;
        for (int t = 0; t <= oneHundredForward; t += 79) {
            if (t > twoHundredBackward) {
                System.out.println(t + " год, когда над Землей пролетает комета.");
            }
        }

        //task 9
        System.out.println("Task 9");

        for (int y = 1; y <= 30; y++) {
            if (y % 3 == 0 && y % 5 == 0){
                System.out.println(y + " pingpong");
            }else if (y % 3 == 0){
                System.out.println(y + " ping");
            }else if (y % 5 == 0){
                System.out.println(y + " ping");
            }else {
                System.out.println(y);
            }
        }

        // task 10 Последовательность Фибоначи
        System.out.println("Task 10");

        int one = 0;
        int two = 1;
        System.out.print(one + " ");
        System.out.print(two + " ");
        for (int s = 2; s < 10; s++) {
            int next = one + two;
            System.out.print(next + " ");
            one = two;
            two = next;
        }

    }
}
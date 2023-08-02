public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 3");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("Задача 1:");
        byte a = 15;
        short b = 102;
        int c = 123224;
        long longNum = 129883289198L;
        float floatNum = 143.0215f;
        double doubleNum = 155.4564552148;
        System.out.println("Значение переменной a с типом byte равно " + a + "\n"
                + "Значение переменной b с типом short равно " + b + "\n"
                + "Значение переменной c с типом int равно " + c + "\n"
                + "Значение переменной longNum с типом long равно " + longNum + "\n"
                + "Значение переменной floatNum с типом float равно " + floatNum + "\n"
                + "Значение переменной doubleNum с типом double равно " + doubleNum + "\n");
    }

    private static void task2() {
        System.out.println("Задача 2:");
        float floatNum1 = 27.12f;
        long longNum = 987678965549L;
        float floatNum2 = 2.786f;
        short shortNum1 = 569;
        short shortNum2 = -159;
        short shortNum3 = 27897;
        byte byteNum = 67;
        System.out.println("Объявлены переменные:\n"
                + "float floatNum1 = " + floatNum1 + "\n"
                + "long longNum = " + longNum + "\n"
                + "float floatNum2 = " + floatNum2 + "\n"
                + "short shortNum1 = " + shortNum1 + "\n"
                + "short shortNum2 = " + shortNum2 + "\n"
                + "short shortNum3 = " + shortNum3 + "\n"
                + "byte byteNum = " + byteNum + "\n");
    }

    private static void task3() {
        System.out.println("Задача 3:");
        byte students1 = 23;
        byte students2 = 27;
        byte students3 = 30;
        short papers = 480;
        System.out.println("На каждого ученика рассчитано "
                + papers / (students1 + students2 + students3)
                + " листов бумаги.\n");
    }

    private static void task4() {
        System.out.println("Задача 4:");
        byte bottlesPerMinute = 16 / 2;
        short minutes = (short) (20 * bottlesPerMinute);
        short minutesPerOneDay = 24 * 60; // Количество минут в сутках
        short oneDay = (short) (minutesPerOneDay * bottlesPerMinute);
        int threeDays = 3 * minutesPerOneDay * bottlesPerMinute;
        int month = 30 * minutesPerOneDay * bottlesPerMinute;
        System.out.println("За 20 минут машина произвела " + minutes + " штук бутылок.\n"
                + "За сутки машина произвела " + oneDay + " штук бутылок.\n"
                + "За 3 дня машина произвела " + threeDays + " штук бутылок.\n"
                + "За 1 месяц машина произвела " + month + " штук бутылок.\n");
    }

    private static void task5() {
        System.out.println("Задача 5:");
        byte allTinOfPaint = 120;
        byte whiteTinPerClass = 2;
        byte brownTinPerClass = 4;
        byte classes = (byte) (allTinOfPaint / (whiteTinPerClass + brownTinPerClass));
        System.out.println("В школе, где " + classes + " классов, нужно "
                + whiteTinPerClass * classes + " банок белой краски и "
                + brownTinPerClass * classes + " банок коричневой краски.\n");
    }

    private static void task6() {
        System.out.println("Задача 6:");
        byte bananasWeight = 80;
        byte milkWeight = 105;
        byte icecreamWeight = 100;
        byte eggWeight = 70;
        short breakfastWeightGr = (short) (5 * bananasWeight + 2 * milkWeight + 2 * icecreamWeight + 4 * eggWeight);
        float breakfastWeightKg = (float) breakfastWeightGr / 1000;
        System.out.println("Вес завтрака " + breakfastWeightGr + " грамм, или " + breakfastWeightKg + " кг.\n");
    }

    private static void task7() {
        System.out.println("Задача 7:");
        float allWeight = 7.0f;
        float minWeightPerDay = 0.25f;
        float maxWeightPerDay = 0.5f;
        int daysMax = (int) (allWeight / minWeightPerDay);
        int daysMin = (int) (allWeight / maxWeightPerDay);
        int daysAvg = (daysMax + daysMin) / 2;
        System.out.println("При похудении на 250 грамм ежедневно спортсмен похудеет на 7 кг за " + daysMax + " дней.\n"
                + "При похудении на 500 грамм ежедневно - за " + daysMin + " дней.\n"
                + "В среднем на похудение необходим " + daysAvg + " день.\n");
    }

    private static void task8() {
        System.out.println("Задача 8:");
        int mashaOldSalary = 67760;
        int denisOldSalary = 83690;
        int kristinaOldSalary = 76230;
        int mashaNewSalary = mashaOldSalary + mashaOldSalary * 10 / 100;
        int denisNewSalary = denisOldSalary + denisOldSalary * 10 / 100;
        int kristinaNewSalary = kristinaOldSalary + kristinaOldSalary * 10 / 100;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на "
                + (mashaNewSalary - mashaOldSalary) * 12 + " рублей.\n"
                + "Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на "
                + (denisNewSalary - denisOldSalary) * 12 + " рублей.\n"
                + "Кристина теперь получает " + kristinaNewSalary + " рубля. Годовой доход вырос на "
                + (kristinaNewSalary - kristinaOldSalary) * 12 + " рублей.\n");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte bird = 6;
        System.out.println("Значение переменной bird с типом byte равно " + bird);
        short dollar = 625;
        System.out.println("Значение переменной dollar с типом short равно " + dollar);
        int drop = 2_500_000;
        System.out.println("Значение переменной drop с типом int равно " + drop);
        long star = 185_640_520_500L;
        System.out.println("Значение переменной star с типом long равно " + star);
        float kg = 6.25f;
        System.out.println("Значение переменной kg с типом float равно " + kg);
        double dergee = 24.197358495d;
        System.out.println("Значение переменной degree с типом double равно " + dergee);

        System.out.println("Задача 2 (без отображения)");
        float a = 27.12f;
        long b = 987_678_965_549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println("Задача 3");
        byte liudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalPaper = 480;
        int paperForOnePupil = totalPaper / (liudmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + paperForOnePupil + " листов бумаги");

        System.out.println("Задача 4");
        short bottlesPer1min = 8;
        int bottlesPer20min = bottlesPer1min * 20;
        System.out.println("За 20 минут машина произвела " + bottlesPer20min + " штук бутылок");
        short minutesInOneDay = 24 * 60;
        int bottlesPerOneDay = bottlesPer1min * minutesInOneDay;
        System.out.println("За сутки машина произвела " + bottlesPerOneDay + " штук бутылок");
        int bottlesPerThreeDays = bottlesPerOneDay * 3;
        System.out.println("За три дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        int bottlesPerOneMonth = bottlesPerOneDay * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesPerOneMonth + " штук бутылок");

        System.out.println("Задача 5");
        byte totalJar = 120;
        byte jarWhiteForOneRoom = 2;
        byte jarBrownForOneRoom = 4;
        int totalRooms = totalJar / (jarWhiteForOneRoom + jarBrownForOneRoom);
        int totalJarWhite = totalRooms * jarWhiteForOneRoom;
        int totalJarBrown = totalRooms * jarBrownForOneRoom;
        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalJarWhite + " банок белой краски и " + totalJarBrown + " банок коричневой краски");

        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte totalBananas = 5;
        int totalBananaWeight = bananaWeight * totalBananas;
        byte milkWeight = 105;
        byte totalMilk = 2;
        int totalMilkWeight = milkWeight * totalMilk;
        byte icecreamWeight = 100;
        byte totalIcecream = 2;
        int totalIcecreamWeight = icecreamWeight * totalIcecream;
        byte eggWeight = 70;
        byte totalEggs = 4;
        int totalEggWeight = eggWeight * totalEggs;
        int sportBreakfast = totalBananaWeight + totalMilkWeight + totalIcecreamWeight + totalEggWeight;
        float sportBreakfastInKg = sportBreakfast / 1000f;
        System.out.println("Вес спортзавтрака в граммах равен " + sportBreakfast + ", а в килограммах - " +sportBreakfastInKg);

        System.out.println("Задача 7");
        short totalLoseWeight = 7000;
        short loseWeightPerDay1 = 250;
        short loseWeightPerDay2 = 500;
        int totalDays1 = totalLoseWeight / loseWeightPerDay1;
        int totalDays2 = totalLoseWeight / loseWeightPerDay2;
        float daysAverage = (totalDays1 + totalDays2) / 2f;
        System.out.println("Чтобы сбросить 7 кг, " + totalDays1 + " дней уйдет на похудение, если спортсмен будет терять в день по 250 грамм, и " + totalDays2 + " дней - если будет худеть на 500 грамм в день");
        System.out.println(daysAverage + " день в среднем понадобится, чтобы добиться результата похудения");

        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaSalaryPerYear = mashaSalary * 12;
        int denisSalaryPerYear = denisSalary * 12;
        int kristinaSalaryPerYear = kristinaSalary * 12;
        float newMashaSalary = mashaSalary * 1.1f;
        float newDenisSalary = denisSalary * 1.1f;
        float newKristinaSalary = kristinaSalary * 1.1f;
        float newMashaSalaryPerYear = newMashaSalary * 12;
        float newDenisSalaryPerYear = newDenisSalary * 12;
        float newKristinaSalaryPerYear = newKristinaSalary * 12;
        float mashaSalaryDifferencePerYear = newMashaSalaryPerYear - mashaSalaryPerYear;
        float denisSalaryDifferencePerYear = newDenisSalaryPerYear - denisSalaryPerYear;
        float kristinaSalaryDifferencePerYear = newKristinaSalaryPerYear - kristinaSalaryPerYear;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + mashaSalaryDifferencePerYear + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + denisSalaryDifferencePerYear + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос " + kristinaSalaryDifferencePerYear + " рублей");

    }
}
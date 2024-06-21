

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int cats = 55000;
        System.out.println("Котов " + cats + " шт");
        byte horses = 126;
        System.out.println("Лошадей " + horses + " шт");
        short cars = 31500;
        System.out.println("Машин " + cars + " шт");
        long frogs = 3000456;
        System.out.println("Лягушек " + frogs + " шт");
        float rabbits = 57.8978f;
        System.out.println("Кроликов " + rabbits + " шт");
        double monkeys = 78.98786748d;
        System.out.println("Обезьян " + monkeys + " шт");

        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        System.out.println("Задача 3");
        byte studentsA = 23;
        byte studentsB = 27;
        byte studentsC = 30;
        short paper = 480;
        int totalStudents = studentsA + studentsB + studentsC;
        int paperPerStudents = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudents + " листов бумаги");

        System.out.println("Задача 4");
        byte efficiencyTwoMinutes = 16;
        int efficiencyOneMinutes = efficiencyTwoMinutes / 2;
        int efficiencyTwentyMinutes = efficiencyOneMinutes * 20;
        System.out.println("За 20 минут машина произвела " + efficiencyTwentyMinutes + " штук бутылок");
        int efficiencyOneDay = efficiencyOneMinutes * 1440;
        System.out.println("За 1 сутки машина произвела " + efficiencyOneDay + " штук бутылок");
        int efficiencyThreeDays = efficiencyOneMinutes * 4320;
        System.out.println("За 3 суток машина произвела " + efficiencyThreeDays + " штук бутылок");
        int efficiencyOneMonth = efficiencyOneDay * 31;
        System.out.println("За 1 месяц машина произвела " + efficiencyOneMonth + " штук бутылок");

        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whiteCansForClassroom = 2;
        byte brownCansForClassroom = 4;
        int totalClassroom = totalCans / (whiteCansForClassroom + brownCansForClassroom);
        int totalWhiteCans = whiteCansForClassroom * totalClassroom;
        int totalBrown = brownCansForClassroom * totalClassroom;
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrown + " банок коричневой краски");

        System.out.println("Задача 6");
        byte banana = 80;
        System.out.println("Вес 1 банана " + banana + " гр");
        byte milk100Ml = 105;
        System.out.println("Вес 100 мл молока " + milk100Ml + " гр");
        byte iceCream = 100;
        System.out.println("Вес 1 брикета " + iceCream + " гр");
        byte egg = 70;
        System.out.println("Вес 1 яйца " + egg + " гр");

        int breakfastWeight = banana * 5 + milk100Ml * 2 + iceCream * 2 + egg * 4;
        System.out.println("Вес завтрака " + breakfastWeight + " гр");
        float brekfastWeightKg = breakfastWeight / 1000f;
        System.out.println("Вес завтрака " + brekfastWeightKg + " кг");

        System.out.println("Задача 7");
        byte loseWeight = 7;
        System.out.println(loseWeight + " кг");
        int loseWieghtgr = loseWeight * 1000;
        System.out.println(loseWieghtgr + " гр");
        short loseWeightPerDay = 250;
        int weightLossDays = loseWieghtgr / loseWeightPerDay;
        System.out.println("На похудение уйдет " + weightLossDays + " дней, если терять по " + loseWeightPerDay + " гр");
        short loseWeightPerDay2 = 500;
        int weightLossDays2 = loseWieghtgr / loseWeightPerDay2;
        System.out.println("На похудение уйдет " + weightLossDays2 + " дней, если терять по " + loseWeightPerDay2 + " гр");
        int averageTime = (weightLossDays + weightLossDays2) /2;
        System.out.println("Среднее время похудения " + averageTime + " день");

        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int mashaSalaryUp = mashaSalary / 100 * 10;
        int mashaSalaryUpYear = mashaSalaryUp * 12;
        int mashaSalaryUpMonth = mashaSalary + mashaSalaryUp;
        System.out.println("Маша теперь получает " + mashaSalaryUpMonth + " рублей." + " Годовой доход вырос на " + mashaSalaryUpYear+ " рублей");

        int denisSalary = 83690;
        int denisSalaryUp = denisSalary / 100 * 10;
        int denisSalaryUpYear = denisSalaryUp * 12;
        int denisSalaryUpMonth = denisSalary + denisSalaryUp;
        System.out.println("Денис теперь получает " + denisSalaryUpMonth + " рублей." + " Годовой доход вырос на " + denisSalaryUpYear+ " рублей");

        int kristinaSalary = 76230;
        int kristinaSalaryUp = kristinaSalary / 100 * 10;
        int kristinaSalaryUpYear = kristinaSalaryUp * 12;
        int kristinaSalaryUpMonth = kristinaSalary + kristinaSalaryUp;
        System.out.println("Кристина теперь получает " + kristinaSalaryUpMonth + " рублей." + " Годовой доход вырос на " + kristinaSalaryUpYear+ " рублей");



    }
}

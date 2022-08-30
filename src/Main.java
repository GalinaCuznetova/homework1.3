public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int cat = 3;
        System.out.println("Значение переменной cat с типом int равно " + cat );
        byte dog = 7;
        System.out.println("Значение переменной dog с типом byte равно " + dog);
        short flower = 1;
        long leon = 300L;
        float water = 36.7f;
        double rice = 7.987654789;
        System.out.println("Значение переменной flower с типом short равно " + flower );
        System.out.println("Значение переменной leon с типом long равно " + leon);
        System.out.println("Значение переменной water с типом float равно " + water);
        System.out.println("Значение переменной rice с типом double равно " + rice);
        //Задача 2
        System.out.println("Задача 2");
        float i = 27.2f;
        System.out.println(i);
        long j = 987678965549L;
        System.out.println(j);
        float t = 2.786f;
        System.out.println(t);
        boolean w = false;
        System.out.println(w);
        short k = 569;
        System.out.println(k);
        int g = -159;
        System.out.println(g);
        int r = 27897;
        System.out.println(r);
        byte s = 67;
        System.out.println(s);
        //Задача 3
        System.out.println("Задача 3");
        int learner1Anna = 23;
        int learner2Ludmila = 27;
        int learner3Ekaterina = 30;
        int learners = learner1Anna + learner2Ludmila + learner3Ekaterina;
        int paper = 480;
        int paperForLearners = paper / learners;
        System.out.println("На каждого ученика рассчитано " + paperForLearners + " листов бумаги");
        //Задача 4
        System.out.println("Задача 4");
        int bottleInMinute = 16 / 2;
        int bottleI20Minute = bottleInMinute * 20;
        int bottleDay = 24 * 60 * 8;
        int bottle3Day = bottleDay * 3;
        long bottleMonth = bottleDay * 30L;
        System.out.println("За 20 минут машина произвела бутылок " + bottleI20Minute + " штук");
        System.out.println("За сутки машина произвела бутылок " + bottleDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + bottle3Day + " штук");
        System.out.println("За месяц машина произвела бутылок " + bottleMonth + " штук");
        //Задача 5
        System.out.println("Задача 5");
        int jar = 120;
        int whiteJar = 2;
        int brownJar = 4;
        int whiteBrownJar = whiteJar + brownJar;
        int classes = jar / whiteBrownJar;
        int totalWhite = whiteJar * classes;
        int totalBrown = brownJar * classes;
        System.out.println("В школе , где " + classes + " классов , нужно " + totalWhite + " банок белой краски и "
        + totalBrown + " банок коричневой краски");
        //Задача 6
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int breakfast = bananas + milk + iceCream + eggs;
        float breakfastKg = breakfast / 1000f;
        System.out.println("Вес завтрака равен " + breakfastKg + " кг");
        //Задача 7
        System.out.println("Задача 7");
        int kgG = 7 * 1000;
        int weightLoss250 = kgG / 250;
        int weightLoss500 = kgG / 500;
        int weightLossAverage = (weightLoss250 + weightLoss500) / 2;
        System.out.println("Спортсмену понадобится " + weightLoss250 + " дней(250g/день)");
        System.out.println("Спортсмену понадобится " + weightLoss500 + " дней , если он будет худеть на 500g в день");
        System.out.println("Спортсмену понадобится " + weightLossAverage + " дней в среднем");
        //Задача 8
        System.out.println("Задача 8");









    }
}
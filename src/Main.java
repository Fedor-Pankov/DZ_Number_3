//Первая задача
public class Main {
    public static void main(String[] args) {
        byte a = 101;
        short b = -27_102;
        int c = 789;
        long d = 1_789_123L;
        float e = 0.238f;
        double f = 23_547_111;
        char g = 5;

        var cat = 9;
        boolean catAge = cat > 13;
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d + " e=" + e + " f=" + f + " g=" + g + catAge);

//Вторая задача
        float boxerWeightOne = 78.2f;
        float boxerWeightTwo = 82.7f;
        float totalWeight = boxerWeightOne + boxerWeightTwo;
        float differenceWeight = boxerWeightTwo - boxerWeightOne;
        System.out.println("Общий вес боксёров " + totalWeight + " кг!");
        System.out.println("Разница в весе составляет " + differenceWeight + " кг!");

//Третья задача
        //Продукты:
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int egg = 4;

        //Вес каждого продукта в граммах:
        int bananasWeight = 5 * 80;
        int milkWeight = 105 * 2;
        int iceCreamWeight = 2 * 100;
        int eggWeight = 4 * 70;

        //Общий вес завтрака в кг:
        double Weight = (bananasWeight + milkWeight + iceCreamWeight + eggWeight) * 0.001;
        System.out.println("Суммарный вес завтрака составляет " + Weight + " кг");

//Четвёртая задача
        double days250 = 7000 / 250;
        double days500 = 7000 / 500;
        double days = (days250 + days500) / 2;
        System.out.println("Спортсмен похудеет в среднем за " + days + " день!");

//Пятая задача
        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;

        float MashaRun = Masha * 1.1f;
        float DenisRun = Denis * 1.1f;
        float KristinaRun = Kristina * 1.1f;

        float MashaYearDo = Masha * 12 * 0.1f;
        float DenisYearDo = Denis * 12 * 0.1f;
        float KristinaYearDo = Kristina * 12 * 0.1f;

        System.out.println("Маша будет получать " + MashaRun + " рублей в месяц!");
        System.out.println("Денис будет получать " + DenisRun + " рублей в месяц!");
        System.out.println("Кристина будет получать " + KristinaRun + " рублей в месяц!");

        System.out.println("Разница в годовом доходе до и после повышения зарплаты Маши составит " + MashaYearDo + " рублей!");
        System.out.println("Разница в годовом доходе до и после повышения зарплаты Дениса составит " + DenisYearDo + " рублей!");
        System.out.println("Разница в годовом доходе до и после повышения зарплаты Кристины составит " + KristinaYearDo + " рублей!");

    }
}





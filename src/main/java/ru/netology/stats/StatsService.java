package ru.netology.stats;

public class StatsService {
    // Сумма всех продаж
    public int getSum_Sales(int[] amount) {
        int sum = 0;

        for (int i = 0; i < amount.length; i++) {
            sum += amount[i];

        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public int getMediumSalesPerMonth(int[] amount) {
        int sum = 0;
        int medium = 0;

        for (int i = 0; i < amount.length; i++) {
            sum += amount[i];

        }
        return sum / amount.length;

    }

    //Месяц с макс продажей
    public int getMaxMonthSales(int[] amount) {
        int MaxMonth = 0;

        for (int i = amount.length - 1; i >= 0; i--) {
            if (amount[i] > amount[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth;
    }

    // Месяц с мин продажей
    public int getMinMonthSales(int[] amount) {
        int MinMonth = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] < amount[MinMonth]) {
                MinMonth = i;
            }
        }
        return MinMonth;
    }

    // КОличество месяцев с продажами ниже среднего (5)
    public int getMinMediumSales(int[] amount) {
        int MinMediumMonth = 0;
        for (int i = 0; i < amount.length; i++) {

            if (amount[i] < 15) {
                MinMediumMonth = MinMediumMonth + 1;
            }

        }
        return MinMediumMonth;
    }

    //Количество месяцев с продажами выше среднего (5)
    public int getMaxMediumSales(int[] amount) {
        int MaxMediumSales = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] > 15) {
                MaxMediumSales = MaxMediumSales + 1;
            }
        }
        return MaxMediumSales;
    }

}





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
        int maxMonth = 0;

        for (int i = amount.length - 1; i >= 0; i--) {
            if (amount[i] > amount[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    // Месяц с мин продажей
    public int getMinMonthSales(int[] amount) {
        int minMonth = 0;
        for (int i = amount.length - 1; i>=0; i--){
            if (amount[i] <amount[minMonth]){
                minMonth = i;
            }
        }
        return minMonth;
    }

    // КОличество месяцев с продажами ниже среднего (5)
    public int getMinMediumSales(int[] amount) {
        int minMediumMonth = 0;
        for (int i = 0; i < amount.length; i++) {

            if (amount[i] < getMediumSalesPerMonth(amount)) {
                minMediumMonth = minMediumMonth + 1;
            }

        }
        return minMediumMonth;
    }

    //Количество месяцев с продажами выше среднего (5)
    public int getMaxMediumSales(int[] amount) {
        int maxMediumSales = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] >getMediumSalesPerMonth(amount)) {
                maxMediumSales = maxMediumSales + 1;
            }
        }
        return maxMediumSales;
    }

}





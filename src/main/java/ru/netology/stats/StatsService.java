package ru.netology.stats;

public class StatsService {
    long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    long average(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSale = totalSale / 12;
        return averageSale;
    }

    int goodMonthMaxiSale(long[] sales) {
        int inMonthMaxiSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] >= sales[inMonthMaxiSale]) {
                inMonthMaxiSale = i;
            }
        }

        return inMonthMaxiSale + 1;
    }

    int badMonthMiniSale(long[] sales) {
        int inMonthMiniSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] <= sales[inMonthMiniSale]) {
                inMonthMiniSale = i;
            }
        }

        return inMonthMiniSale + 1;
    }

    int findMonthsLowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }

        }
        return counter;
    }

    int findMonthsHighAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }

        }
        return counter;}



}

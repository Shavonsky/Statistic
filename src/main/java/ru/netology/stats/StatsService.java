package ru.netology.stats;

public class StatsService {
    //1
    public int calculateSum (int[] purchases) {
        int sum = 0;
        for (int purchase : purchases){
            sum += purchase;
        }
        return sum;

    }
    //2
    public int calculateAverageSum (int[] purchases) {
       return calculateSum(purchases)/purchases.length;
    }
    //3
    public int monthMaxSum (int[] purchases) {
        int currentMax = purchases[0];
        int indexMonth = 0;
        int indexMaxMonth = 0;
        for (int purchase : purchases) {
            indexMonth++;
            if (currentMax <= purchase) {
                currentMax = purchase;
                indexMaxMonth = indexMonth;
            }
        }
        return indexMaxMonth;
    }
    //4
    public int monthMinSum (int[] purchases) {
        int currentMin = purchases[0];
        int indexMonth = 0;
        int indexMinMonth = 0;
        for (int purchase : purchases) {
            indexMonth++;
            if (currentMin >= purchase) {
                currentMin = purchase;
                indexMinMonth = indexMonth;
            }
        }
            return indexMinMonth;
    }
    //5
    public int monthAverageMinSum (int[] purchases) {
        int quantityMonth = 0;
        int quantityAverageMinMonth = 0;
        double average = calculateAverageSum(purchases) ;
        for (int purchase : purchases) {
            if (purchase < average) {
                quantityMonth++;
                quantityAverageMinMonth = quantityMonth;
            }
        }
        return quantityAverageMinMonth;
    }
    //6
    public int monthAverageMaxSum (int[] purchases) {
        int quantityMonth = 0;
        int quantityAverageMaxMonth = 0;
        double average = calculateAverageSum(purchases) ;
        for (int purchase : purchases) {
            if (purchase > average) {
                quantityMonth++;
                quantityAverageMaxMonth = quantityMonth;
            }
        }
        return quantityAverageMaxMonth;
    }
}

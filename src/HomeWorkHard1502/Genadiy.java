package HomeWorkHard1502;

import java.util.Arrays;

public class Genadiy {
    public static void main(String[] args) {
        int[][] income = {
                {95, 76, -9, 28, 17, 61, 10},
                {14, -21, 89, 106, 19, -8, 88},
                {64, 38, 87, -26, 10, 15, 11},
        };
        int sum = 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < income.length; i++) {
            for (int j = 0; j < income[i].length; j++) {
                sum += income[i][j];
                if (sum > max) {
                    max = sum;
                    count = i;
                }
            }
            sum = 0;
        }
        System.out.println("Геннадию лучше работать с " + (count + 1) + " заказчиком, он платит за неделю " + max + " баксов");
    }
}

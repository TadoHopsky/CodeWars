package TheHighestProfitWins;

import java.util.Arrays;

public class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
        int[] result = new int[2];
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);

        result[0] = min;
        result[1] = max;

        return result;
    }
}


/*
##############################################
############    Best practise   ##############
##############################################

class MinMax {
    public static int[] minMax(int[] arr) {
         Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}
*/

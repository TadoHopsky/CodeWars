import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] someArray1 = {1,2,3,4,5};
        int[] someArray2 = {2334454,5};
        int[] someArray3 = {1};

        System.out.println(Arrays.toString(minMax(someArray1)));
        System.out.println(Arrays.toString(minMax(someArray2)));
        System.out.println(Arrays.toString(minMax(someArray3)));
    }

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

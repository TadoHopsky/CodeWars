package TheMuseumOfIncrediblyDullThings;

import java.util.Arrays;

public class TheMuseumOfIncrediblyDullThings {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) return new int[0];

        int min = Arrays.stream(numbers).min().getAsInt();

        int indexToRemove = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                indexToRemove = i;
                break;
            }
        }
        int[] result = new int[numbers.length - 1];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == indexToRemove) continue;
            result[j++] = numbers[i];
        }

        return result;
    }
}





/*

 ##############################################
 ############    Best practise   ##############
 ##############################################

 import static java.util.stream.IntStream.range;

interface Remover {
  static int[] removeSmallest(int[] numbers) {
    int min = range(0, numbers.length).reduce((i, j) -> numbers[i] > numbers[j] ? j : i).orElse(-1);
    return range(0, numbers.length).filter(i -> i != min).map(i -> numbers[i]).toArray();
  }
}

 */
package FindTheSmallestIntegerInTheArray;

import java.util.Arrays;

public class FindTheSmallestIntegerInTheArray {

    public static int findSmallestInt(int[] args) {
        return (Arrays.stream(args).min()).orElse(0);
    }
}


/*
##############################################
############    Best practise   ##############
##############################################

import java.util.stream.IntStream;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }
}
*/


package NumberOfPeopleInTheBus;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

    public static int countPassengers(ArrayList<int[]> stops) {
        int passengers = 0;

        for (int[] stop : stops) {
            passengers += stop[0];
            passengers -= stop[1];
        }
        return passengers;
    }
}

/*
##############################################
############    Best practise   ##############
##############################################

  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
  }
}
*/


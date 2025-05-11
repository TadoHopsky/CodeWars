package RemovingElements;

import java.util.ArrayList;
import java.util.List;

public class RemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> list = new ArrayList<Object>();

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                list.add(arr[i]);
            }
        }
        return list.toArray();
    }
}

/*
##############################################
############    Best practise   ##############
##############################################

    public static Object[] removeEveryOther(Object[] arr) {
    return IntStream.range(0, arr.length).filter(n -> n % 2 == 0).mapToObj(i->arr[i]).toArray();
  }
}
*/

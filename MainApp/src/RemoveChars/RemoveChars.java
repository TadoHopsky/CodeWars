package RemoveChars;

import java.util.ArrayList;
import java.util.List;

public class RemoveChars {
    public static String remove(String str) {
        StringBuilder result = new StringBuilder();

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {list.add(str.charAt(i));}

        for (int i = 0; i < list.size(); i++) {
            if(i == 0 || i == list.size() - 1) {continue;}
            result.append(list.get(i));
        }

        return result.toString();
    }
}

/*
##############################################
############    Best practise   ##############
##############################################

  public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
*/

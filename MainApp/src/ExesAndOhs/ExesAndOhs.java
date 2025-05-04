package ExesAndOhs;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        int countX = 0;
        int countO = 0;
        String lowerCaseString = str.toLowerCase();

        for (int i = 0; i < lowerCaseString.length(); i++) {
            char ch = lowerCaseString.charAt(i);
            if (ch == 'x') countX++;
            if (ch == 'o') countO++;
        }
    return countO == countX;
    }

/*
    ##############################################
    ############    Best practise   ##############
    ##############################################

    public static boolean getXO (String str) {
        str = str.toLowerCase();
        return str.replace("x", "").length()  == str.replace("o", "").length();
    }
 */
}


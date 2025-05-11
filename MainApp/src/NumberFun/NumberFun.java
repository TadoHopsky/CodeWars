package NumberFun;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double res = Math.pow(Math.sqrt(sq) + 1, 2);
        if(res % 1 == 0){
            System.out.println(res);
            return (long) res;
        }
        return -1;
    }
}


/*
##############################################
############    Best practise   ##############
##############################################

public class NumberFun {
  public static long findNextSquare(long sq) {
      return Math.sqrt(sq) % 1 != 0 ? -1 : (long)Math.pow(Math.sqrt(sq)+1,2);
  }
}
 */
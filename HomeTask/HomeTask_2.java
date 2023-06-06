package HomeTask;
/*
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? 
 * public static int sum2d(String[][] arr){
 *  int sum = 0; 
 * for (int i = 0; i < arr.length; i++) {
 *   for (int j = 0; j < 5; j++) { 
 *      int val = Integer.parseInt(arr[i][j]); sum += val;
 *  } 
 * } 
 * return sum; }
 */
public class HomeTask_2 {
    public static void main(String[] args) {

     /*    String[][] Arr = new String[][]{{"1","2","3","4","5"}, {"1","2","b","4","5"}};
        sum2d(Arr);
        // NumberFormatException  "b" - Error
    */
/* 
        String[][] Arr = new String[][]{{"1","2","3","4","5"}, {"1","2","3"}};
        sum2d(Arr);
        // ArrayIndexOutOfBoundsException
*/
        /*
        String[][] Arr = new String[10][10];
        sum2d(Arr);
        // NumberFormatException
*/
    }

    public static int sum2d(String[][] arr){
          int sum = 0; 
         for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < 5; j++) { 
             int val = Integer.parseInt(arr[i][j]); 
             sum += val;
          } 
         } 
     return sum; 
    }
    
}

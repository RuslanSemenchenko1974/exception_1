package HomeTask;
/*
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class HomeTask_3 {
    public static void main(String[] args) {
        //metod1(Integer.parseInt("d")); 
        //NumberFormatException
        //metod2(3,0);
        //ArithmeticException
      int[] arr = new int[]{1,2,3};
      metod3(arr); //ArrayIndexOutOfBoundsException
    }
    public static void metod1(int item) {
        System.out.println(item);
        
    }

    public static void metod2(int a, int b) {
        System.out.println(a/b);
    }

    public static void metod3(int[] arr) {
        for (int i = 0; i < 5; i++) {
         System.out.println(arr[i]);   
        }
    }
}

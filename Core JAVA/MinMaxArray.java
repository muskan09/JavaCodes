import java.util.Scanner;

class MinMaxArray {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int arr[] = new int[10];

      for(int i = 0 ; i < 10 ; i++ ) {
         arr[i] = scan.nextInt();
      }
      int min = arr[0] , max = arr[0] , min2 = arr[0] , max2 = arr[0];

      for(int i = 0 ; i < 10 ; i++) {
         if(arr[i] > max) {
            max = arr[i];
         }
         if(min > arr[i]) {
            min = arr[i];
         }
      }
      for(int i = 0 ; i < 10 ; i++ ) {
         if(max > arr[i] && max2 <= arr[i]) {
            max2 = arr[i];
         }
      }
      for(int i = 0 ; i < 10 ; i++ ) {
         if(min < arr[i] && min2 >= arr[i]) {
            min2 = arr[i];
         }
      }
      System.out.println("max = " + max);
      System.out.println("min = " + min);
      System.out.println("second max = " + max2);
      System.out.println("second min = " + min2);
      scan.close();
   }
}

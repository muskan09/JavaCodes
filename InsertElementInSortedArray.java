import java.util.Scanner;
class InsertElementInSortedArray {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int arr[] = new int[11];
      System.out.println("Enter 10 elements of array : ");
      for (int i = 0 ; i < 10 ; i++ ) {
         arr[i] = scan.nextInt();
      }
      System.out.println("Enter the number you wanna insert : ");
      arr[10] = scan.nextInt();
      for(int i = 0 ; i < arr.length ; i++ ) {
         for(int j = 0 ; j < arr.length - 1 ; j++ ) {
            if(arr[j] > arr[j+1]) {
               arr[j] = arr[j]+arr[j+1];
               arr[j+1] = arr[j]-arr[j+1];
               arr[j] = arr[j]-arr[j+1];
            }
         }
      }
      for(int i = 0 ; i < arr.length ; i++ ) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      scan.close();
   }
}

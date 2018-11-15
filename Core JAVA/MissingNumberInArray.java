import java.util.Scanner;
class MissingNumberInArray {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter size of array : ");
      int size = scan.nextInt();
      int arr[] = new int[size];
      System.out.println("Enter array elements : ");
      for(int i = 0 ; i < size ; i++ ) {
         arr[i] = scan.nextInt();
      }
      for(int i = 0 ; i < arr.length ; i++ ) {
         for(int j = 0 ; j < arr.length - 1 ; j++ ) {
            if(arr[j] > arr[j+1]) {
               arr[j] = arr[j]+arr[j+1];
               arr[j+1] = arr[j]-arr[j+1];
               arr[j] = arr[j]-arr[j+1];
            }
         }
      }
      int max = 0;
      for(int i = 0 ; i < size ; i++) {
         if(arr[i] > max) {
            max = arr[i];
         }
      }
      System.out.print("Sorted Array : ");
      for(int i = 0 ; i < size ; i++ ) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      System.out.print("Missing Numbers : ");
      int flag = 0;
      for(int i = 0 ; i < max ; i++ ) {
         for(int j = 0 ; j < size ; j++ ) {
            if(arr[j] == i) {
               flag = 1;
               break;
            }
         }
         if(flag == 1) {
         }else {
            System.out.print(i + " ");
         }
         flag = 0;
      }
      System.out.println();
      scan.close();
   }
}

import java.util.Scanner;

class RemoveDuplicateFromArray {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      int size = scan.nextInt();
      int arr[] = new int[size];
      System.out.println();
      System.out.println("Enter the elements in array : ");
      for(int i = 0 ; i < size ; i++ ) {
         arr[i] = scan.nextInt();
      }
      for(int i = 0 ; i < size ; i++ ) {
         for(int j = 0 ; j < size - 1 ; j++ ) {
            if(arr[j] > arr[j+1]) {
               arr[j] = arr[j]+arr[j+1];
               arr[j+1] = arr[j]-arr[j+1];
               arr[j] = arr[j]-arr[j+1];
            }
         }
      }
      for(int i = 0 ; i < size ; i++ ) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      for(int i = 0 ; i < size-1 ; i++ ) {
         if(arr[i]==arr[i+1]){
            continue;
         }
         System.out.print(arr[i] + " ");
      }
      System.out.println(arr[size-1]);
      scan.close();
   }
}

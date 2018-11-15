import java.util.Scanner;

class Arrays {
   public static void main(String args[]) {
      int arr1[] = new int[5];
      Scanner scan = new Scanner(System.in);
      System.out.println("Array : ");
      for(int i = 0 ; i < 5; i++ ) {
         System.out.print("enter number : ");
         arr1[i]= scan.nextInt();
      }
      for(int i = 0 ; i < 5 ; i++ ) {
         System.out.print(arr1[i] + " ");
      }
      System.out.println();
      System.out.println("2D Array : ");
      int arr2[][] = new int[3][3];
      for(int i = 0 ; i < 3 ; i++ ) {
         for(int j = 0 ; j < 3 ; j++ ) {
            System.out.print("enter number : ");
            arr2[i][j] = scan.nextInt();
         }
      }
      for(int i = 0 ; i < 3 ; i++ ) {
         for(int j = 0 ; j < 3 ; j++ ) {
            System.out.print(arr2[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println("Jagged 2D Array :");
      int arr3[][] = new int[3][];
      arr3[0] = new int[1];
      arr3[1] = new int[2];
      arr3[2] = new int[3];
      for(int i = 0 ; i < 3 ; i++ ) {
         for(int j = 0 ; j < i+1 ; j++ ) {
            System.out.print("enter number : ");
            arr2[i][j] = scan.nextInt();
         }
      }
      for(int i = 0 ; i < 3 ; i++ ) {
         for(int j = 0 ; j < i+1 ; j++ ) {
            System.out.print(arr2[i][j] + " ");
         }
         System.out.println();
      }
      scan.close();
   }
}

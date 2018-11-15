import java.util.Scanner;
class SumOfPairEqualsN {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the number you wanna check sum : ");
      int n = scan.nextInt();
      System.out.println("Enter the size of array : ");
      int size = scan.nextInt();
      System.out.println("enter thejavac  elements of array : ");
      int arr[] = new int[size];
      for(int i = 0 ; i < size ; i++ ) {
         arr[i] = scan.nextInt();
      }
      int count = 0;
      for(int i = 0 ; i < size ; i++ ) {
         for(int j = i ; j < size ; j++ ) {
            if(arr[i]+arr[j] == n) {
               count++;
            }
         }
      }
      System.out.println("number of pairs : " + count);
      scan.close();
   }
}

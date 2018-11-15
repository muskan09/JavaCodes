import java.util.Scanner;

class LinearSearch {
  public static void main(String args[]) {
   int n, search;

   Scanner scan = new Scanner(System.in);
   System.out.print("Enter number of elements : ");
   n = scan.nextInt();
   int array[] = new int[n];

   System.out.println("Enter those " + n + " elements");

   for (int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
   }

   System.out.print("Enter value to find : ");
   search = scan.nextInt();

   for (int i = 0; i < n; i++) {
      if (array[i] == search) {
         System.out.println(search + " is present at location " + (i+1) + ".");
         break;
      }
   }
   scan.close();
   }
}

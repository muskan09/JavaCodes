import java.util.Scanner;

class NthPrime {
   public static void main(String args[]) {
      int num;
      Scanner scan = new Scanner(System.in);
      System.out.println("enter a number : ");
      num = scan.nextInt();
      int x=0;
      for(int i = 2 , j = 2; num>0 ; i++) {
         for(j = 2 ; j < i ; j++) {
            if(i%j==0){
               break;
            }
         }
         if(i == j) {
            num--;
         }
         x = j;
      }
      System.out.println(x);
      scan.close();
   }
}

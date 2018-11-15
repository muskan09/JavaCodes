import java.util.*;
import java.io.*;
class palin{
  public static void main(String args[]){
    int  num, reverse = 0, temp, remainder;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number");
    num=sc.nextInt();
    temp =num;
     int a=0;
   for(int i=temp;i<10000;i++){

  while (num > 0)

  {

      remainder = num % 10;

      reverse = reverse * 10 + remainder;

      num /= 10;

  }
  if(i==reverse){
    a=i;
    break;
  }else{
  continue;
  }
 }
 System.out.println("The palindrome is "+a);
  }
}

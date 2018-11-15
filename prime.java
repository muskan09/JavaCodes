import java.util.*;
import java.io.*;
class prime{
  public static void main(String args[]){
    int n,sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of array");
    n=sc.nextInt();
    int arr[];
    arr= new int[n];
    System.out.println("Enter elements");
    int r,c=0;
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      for(int j=1;j<n;j++){
        r=arr[i]%j;
        if(r==0){
          c++;
        }
      }
      if(c==2){
        sum=sum+arr[i];
      }
    }
    System.out.println("Sum is "+sum);
  }
}

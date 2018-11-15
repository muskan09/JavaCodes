import java.util.*;
import java.io.*;
class tuzikdog{
  public static void main(String[] args) {
    int n,k,x;
    x=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no of coins,n");
    n=sc.nextInt();
    System.out.println("Enter no of people,k");
    k=sc.nextInt();
    for(int i=n;i>0;i--){
      if(i%k==0){
        x=i;
        //System.out.println("val of x"+x);

        break;
      }
      else{
        continue;
      }
    }
    int z=n-x;
    System.out.println("No of coins Tuzik would get are "+z);

  }
}

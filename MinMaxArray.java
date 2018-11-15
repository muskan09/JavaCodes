import java.util.*;
class Arraymm{
  public static void main(String args[]){

    int n,i,temp;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of array");
    n=sc.nextInt();
    int a[];
    a= new int[n];
    System.out.println("Enter elemets of array");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
      for(int j=0;j<(n-1);j++){
        if(a[j]>a[j+1]){
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    System.out.println("Min element is "+a[0]);
    System.out.println("Max element is "+a[n]);
  }
}

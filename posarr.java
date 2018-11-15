import java.util.*;
//array pass karni hai method ko
class posarr{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of array");
    int n;
    n=sc.nextInt();
    int arr=new int[n];
    posarr(int a[]){
      for(int i=0;i<n;i++){
        a[i]=arr[i];
      }
    }

  }
}

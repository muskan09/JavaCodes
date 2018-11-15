import java.util.*;
class count{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("ENter size of array");
    int n= sc.nextInt();
    int arr[];
    arr= new int[n];
    int c=0;
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      int num=arr[i];
      for(int j=0;j<n;j++){
        if(arr[j]==num){
          c++;
        }
        System.out.println("The count of number "+arr[i]+" is "+c);
      }

    }
  }
}

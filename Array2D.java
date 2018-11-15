import java.util.*;
class Array2D{
public static void main(String args[]){
System.out.println("Enter array size");
int n,i,j;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[][];
arr= new int[n][n];
//int arr= new int[n];
for(i=0;i<n;i++){
for(j=0;j<n;j++){
System.out.println("Enter element");
arr[i][j]=sc.nextInt();
}
}
System.out.println("Your array is");
for(i=0;i<n;i++){
for(j=0;j<n;j++){
System.out.println(arr[i][j]);
}
}
}
}

import java.util.*;
class Array{
public static void main(String args[]){
System.out.println("Enter array size");
int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[];
arr= new int[n];
//int arr= new int[n];
for(i=0;i<5;i++){
System.out.println("Enter element");
arr[i]=sc.nextInt();
System.out.println("Element is"+arr[i]);
}
}
}

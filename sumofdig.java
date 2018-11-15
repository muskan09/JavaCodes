import java.util.*;
import java.io.*;
public class sumofdig{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[6];
		int sum=0;
		int num=n;
		while(n>0)
		{
			int x=n%10;
			sum=sum+x;
			for(int i=0;i<num;i++){
				arr[i]=x;
			}
			n=n/10;
		}
		System.out.println("Sum "+sum);
		for(int i=0;i<num;i++){
			System.out.println("ele "+arr[i]);
		}
	}
}




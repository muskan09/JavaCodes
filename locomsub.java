import java.util.*;
import java.io.*
class locomsub{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter String1");
    String s1=br.readLine();
    System.out.println("Enter String2");
    String s2=br.readLine();
    int a=s1.length();
    int b=s2.length();
    int arr[][]= new int[a][b];
    for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
        if(s1.charAt(i) == s2.charAt(j)){
				
    }
    System.out.println("Longest sub string that is commom between two entred strings is");
  }
}

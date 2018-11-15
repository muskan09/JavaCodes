import java.util.*;
import java.io.*;
class stlen{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string");
         String s=br.readLine();
         int a=s.length();
         System.out.println("Length of string is "+a);
  }
}

import java.util.*;
import java.io.*;
class stsub{
  public static void main(String args[])throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter string");
     String s=br.readLine();
     System.out.println("Enter substring");
      String str=br.readLine();
      int a=s.indexOf(str);
      if(a==-1-){
        System.out.println("String not found");
      }
      else{
        System.out.println("Substring found at "+a);
      }
  }
}

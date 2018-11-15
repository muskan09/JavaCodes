import java.util.*;
import java.io.*;
class buffreaderdemo{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter char string int");

    char ch=(char)br.read();
    br.readLine();
    String s=br.readLine();

    int i=Integer.parseInt(br.readLine());
    System.out.println("String:"+s);
    System.out.println("Char:"+ch);
    System.out.println("Int:"+i);
  }
}

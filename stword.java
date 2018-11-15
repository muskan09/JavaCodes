import java.util.*;
import java.io.*;
class stword{
 public static void main(String[] args)throws  IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter string");
    String s=br.readLine();
    //int a=1;
    int count = 1;
        for (int i=0;i<=s.length()-1;i++)
        {
            if (s.charAt(i) == ' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }
        }

     System.out.println("No of words in string are "+count);
  }
}

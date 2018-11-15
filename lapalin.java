import java.util.*;
import java.io.*;
class lapalin{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    int testcase;
    testcase=sc.nextInt();
    while (testcase-->0) {
        //String s;
        //s=sc.nextLine();
        StringBuffer s=new StringBuffer("gaga");
        int len=s.length();

        String a=s.substring(0,(len +1)/2);
        String b=s.substring(len-(len + 1)/2,(len+1)/2);

        sort(a.begin(),a.end());
        sort(b.begin(),b.end());

        if (a==b) {
          System.out.println("Yes");
        }
        else {
          System.out.println("No");
      }
    }
  }
}

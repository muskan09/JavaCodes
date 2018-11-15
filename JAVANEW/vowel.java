import java.util.*;
import java.io.*;
class vowel{
  public static void main(String[] args) {
    StringBuffer sb= new StringBuffer();
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char x=s.charAt(0);
    char s1[];
    if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'||s.charAt(0)=='A'||s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O' || s.charAt(0)=='U'){
      System.out.println(s+"way");
    }else{

       for(int i=0;i<s.length();i++){
             s1[i]=s.charAt(i);
             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O' || s.charAt(i)=='U'){
              break;
             }
         }

}
int y=s1.length;
for(int i=0;i<y;i++){
  System.out.print(s1[i]);
}

  }
}

import java.util.*;
import java.io.*;
class StringReverser{
String reverseWord(String str){
    String words[]=str.split("\\s");
    String reverseWord="";
    for(String w:words){
        StringBuilder sb=new StringBuilder(w);
        sb.reverse();
        reverseWord+=sb.toString()+" ";
    }
    return reverseWord.trim();
}
}
public class revstr {
public static void main(String[] args) {
  StringReverser m = new StringReverser();
    System.out.println(m.reverseWord("muskan kalsi"));
    }
}

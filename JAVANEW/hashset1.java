import java.util.*;
import java.io.*;
class hashset1{
  public static void main(String[] args) {
    HashSet<String>hset=new HashSet<String>();
    hset.add("ab");
    hset.add("bc");
    hset.add("NULL");
    Iterator<String> i=hset.iterator();

    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}

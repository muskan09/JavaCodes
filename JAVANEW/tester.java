package blah;
import java.util.*;
import java.io.*;
class tester{
  public static void main(String[] args) {
    student s1=new student("ab",12,3);
    student s2=new student("cd",13,4);
    student s3=new student("ef",14,5);
    HashSet<student>hset=new HashSet<student>();
    hset.add(s1);
    hset.add(s2);
    hset.add(s3);
    Iterator<student> i=hset.iterator();

    while(i.hasNext()){
      System.out.println(i.next());
    }

  }
}

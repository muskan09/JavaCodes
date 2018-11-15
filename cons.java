import java.util.*;
import java.io.*;
class first{
  first(){
    System.out.println("First");
  }
}
class second extends first{
  second(){
    System.out.println("Second");
}
}
class cons{
  public static void main(String[] args) {
    second s=new second();
  }
}

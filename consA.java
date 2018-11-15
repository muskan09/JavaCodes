import java.util.*;
import java.io.*;
class one{
  void display(){
    System.out.println("One");
  }
}
class two extends one{
  two(){
    System.out.println("two");
}
}
class three extends one{
  three(){
    System.out.println("three");
}
}
class consA{
  public static void main(String[] args) {
    one obj1=new one();
    one obj2=new two();
    one obj3=new three();
    obj1.display();
    obj2.display();
    obj3.display();
  }
}

import java.util.*;
import java.io.*;
interface I1{
  void interfaceone();
}
interface I2{
  void interfacetwo();
}

class C1 implements I1,I2{
  public void interfaceone(){
      System.out.println("I1 implemented");
  }
  public void interfacetwo(){
    System.out.println("I2 implemented");
  }
}

class multiinheriInterface{
  public static void main(String args[]){
   I1 obj1=new C1() ;
     obj1.interfaceone();
   I2 obj2=new C1();

  obj2.interfacetwo();
  }
}

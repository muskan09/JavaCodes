import java.util.*;
import java.io.*;
interface Database{
  void connect();
  void disconnect();
}
class db1 implements Database{
  public void connect(){
      System.out.println("DB1 CONNECTED");
  }
  public void disconnect(){
    System.out.println("DB1 DISCONNECTED");
  }
}
class db2 implements Database{
  public void connect(){
    System.out.println("DB2 CONNECTED");
  }
  public void disconnect(){
      System.out.println("DB2 DISCONNECTED");
  }
}
class db3 implements Database{
  public void connect(){
    System.out.println("DB3 CONNECTED");
  }
  public void disconnect(){
      System.out.println("DB3 DISCONNECTED");
  }
}

class interfacetwo{
  public static void main(String args[]){
     Database o1;
     o1=new db1();
     System.out.println("OUTPUT db1 ");
     o1.connect();
     System.out.println("OUTPUT db1  ");
     o1.disconnect();
     o1=new db2();
     System.out.println("OUTPUT db2  ");
     o1.connect();
     System.out.println("OUTPUT db2 ");
     o1.disconnect();
     o1=new db3();
     System.out.println("OUTPUT db3  ");
     o1.connect();
     System.out.println("OUTPUT db3  ");
     o1.disconnect();


  }
}

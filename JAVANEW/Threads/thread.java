import java.util.*;
class test extends Thread{
public static void main(String args[]){
Thread t=Thread.currentThread();
t.setName("MK");
System.out.println(t);
}
}

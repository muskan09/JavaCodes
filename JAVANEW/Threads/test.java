import java.util.*;
class test extends Thread{
public void run(){
System.out.println("Hello"); //ADvantage;its a simple code; disadv java doesnt support multiple inheritance so if we want to extend a claass we use Runnable
}
public static void main(String args[]){
test o1=new test();
System.out.println("Sample1");
System.out.println("Sample2");
o1.start();

System.out.println("Bye");
System.out.println("Sample3");
System.out.println("Sample4");
test o2=new test();
o2.start();
System.out.println("Bye2");
Thread t=Thread.currentThread();
t.setName("MK");
t.setPriority(3);
System.out.println(t.getName());
System.out.println(t);
}
}

import java.util.*;
class test1 implements Runnable{
  test1(){
    Thread t=new Thread(this);
    t.start();
  }
  public void run(){
    System.out.println("Hello");
    Thread t1 =Thread.currentThread();
    System.out.println(t1);
    try{
      for(int i=5;i>=0;i--){
        System.out.println(i);
        Thread.sleep(1000); //output comes slowly
      }
    }
    catch(Exception e){
      System.out.println(e);

      System.out.println("Interrupted Exception");
    }
  }
}
  class abc{
  public static void main(String args[]){
    test1 o1=new test1();
    test1 o2=new test1();
    /*o1.run();
    o2.run();*/
    //when we call run method directly from the main then o1 and o2 are treated as a normal object not a threaded object, so there is no context switching(ek choor ke dusre mein jaana is context switching)
    /*Thread t=new Thread(o1); //overriding cuz THread ka object firse bana re hai
      t.start(); //if we remove the constructor in test1 we can use this */
    Thread x=Thread.currentThread();

    System.out.println(x);
  }
}

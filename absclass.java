import java.util.*;
import java.io.*;
abstract class bank{
  int roi;
  bank(int roi){
    this.roi=roi;
  }
  abstract int rateOfInterest();
}
class bankOne extends bank{
  bankOne(int roi){
    super(roi);
  }
  int rateOfInterest(){
  return(roi/2);
  }
}
class bankTwo extends bank{
  bankTwo(int roi){
    super(roi);
  }
  int rateOfInterest(){
  return(roi/3);
  }
}
class absclass{
  public static void main(String args[]){
    bank b1= new bankOne(4);
    System.out.println("Rate of interest of bank one is "+b1.rateOfInterest());
    bank b2= new bankOne(6);
    System.out.println("Rate of interest of bank two is "+b2.rateOfInterest());
  }
}

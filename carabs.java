import java.util.*;
import java.io.*;
abstract class car{
  Scanner sc = new Scanner(System.in);
  int registerationNo;
  int angle,force;
  String direction;
  int openTank(){

     System.out.println("Enter your Registeration No");
     registerationNo=sc.nextInt();
     System.out.println("Registeration No is "+registerationNo);
    System.out.println("Please fill the tank");
  }
  car(int angle,int direction,int force){
    this.angle=angle;
    this.force=force;
    this.direction=direction;
  }
  abstract void steering(int direction,int angle);
  abstract void breaking(int force);
}
class carOne extends car{
  carOne(int angle,int direction,int force){
    super(angle,direction,force);
  }
  void steering(String direction,int angle){
    System.out.println("Car1 data");
      System.out.println("Direction is "+direction);
      System.out.println("Angle is "+angel);
  }
  void breaking(int force){
    if(force==1){
      System.out.println("Hydraulic Breaks");
    }else{
      System.out.println("Gas Breaks");
    }
  }
}
class carTwo extends car{
  carOne(int angle,int direction,int force){
    super(angle,direction,force);
  }
  int steering(int direction,int angle){
    System.out.println("Car2 data");
    return(direction/2 , angle/4);
  }
  void breaking(int force){
    if(force==1){
      System.out.println("Hydraulic Breaks");
    }else{
      System.out.println("Gas Breaks");
    }
  }
}
class carabs{
  public static void main(String args[]){

    car c1= new carOne(60,30,1);
    c1.openTank()
    c1.steering();
    c1.breaking();
    c2.openTank();
    car c2= new carTwo(40,20,2);
    c2.steering();
    c2.breaking();
  }
}

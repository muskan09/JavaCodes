import java.util.*;
class Rectangle{
  int length,breadth;
  Rectangle(int l, int b){
    length=l;
    breadth=b;
  }
  int rectArea(){
    return length*breadth;
  }
}
class Circle{
  double r,a,p;
  Circle(double x,double y,double z){
    r=x;
    a=y;
    p=z;
  }
  double circleArea(){
    return r*r*p;
  }
}
class Square{
  int s;
  Square(int m){
    s=m;
  }
  int squareArea(){
    return s*s;
  }
}
class Consoverload{
  public static void main(String args[]){
    int ab,cd,ef;
    double gh,ij,kl;
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter length,breadth");
    ab=sc.nextInt();
    cd=sc.nextInt();
    System.out.println("Enter side");
    ef=sc.nextInt();
    System.out.println("Enter radius");
    gh=sc.nextDouble();
    ij=gh;
    kl=3.14;

    Rectangle h=new Rectangle(ab,cd);
    Square i=new Square(ef);
    Circle j=new Circle(gh,ij,kl);
    System.out.println("Area of rect is "+h.rectArea());
    System.out.println("Area of circle is "+j.circleArea());
    System.out.println("Area of square is "+i.squareArea());
  }
}

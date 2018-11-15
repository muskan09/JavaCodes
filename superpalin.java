import java.util.*;
class Reverse{
  int num;
  Reverse(int n){
    num=n;
  }
  int b,c,re;
  int y,e,f,rem;
void rev(){
  System.out.println("Number Entered is "+num);

  b=num%10;
  c=num/10;
  re=b*10+c;
  System.out.println("Reverse is "+re);
  if(re==num){
    System.out.println("The entered number is a palindrome "+re);
    y=re*re;
    e=y%10;
    f=y/10;
    rem=e*10+f;
    if(y==rem){
      System.out.println("Voila! You've found a superpalindrome"+rem);
    }
    else{
      System.out.println("Is a palindrome but not superpalindrome :( )");

    }

  }
  else{
    System.out.println("The entered number is a Not a  hence cant be superpalindrome ");

  }
  }
}
class superpalin{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");

    int ab=sc.nextInt();
    Reverse k=new Reverse(ab);
    k.rev();

  }
}

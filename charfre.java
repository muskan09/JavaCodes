import java.util.*;
import java.io.*;
class charfre{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputString = sc.nextLine();
    int length = sc.nextInt();
    String smallest="";
    String largest="";
    for(int i = 0;i<=inputString.length()-length;i++){
        String subString = inputString.substring(i,i+length);
        if(i == 0){
            smallest = subString;
        }
        if(subString.compareTo(largest)>0){
            largest = subString;
        }else if(subString.compareTo(smallest)<0)
            smallest = subString;
    }
    System.out.println(smallest);
    System.out.println(largest);
  }
}

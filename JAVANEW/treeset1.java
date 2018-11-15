import java.util.*;
public class treeset1{
  static int checkAnagram(String str1,String str2){
    int i,j;
    int n=str1.length();
    if(str1.length()==str2.length()){
      Set<Character>s1=new TreeSet<Character>();
    for(i = 0; i < str1.length(); i++) {
        s1.add(str1.charAt(i));
    }

    Set<Character>s2=new TreeSet<Character>();
    for(i = 0; i < str2.length(); i++) {
        s2.add(str2.charAt(i));
    }
    s1.retainAll(s2);
    int x=s1.size();
    if(x==n){
      System.out.println("intsec 1");

    }
    else{
      System.out.println("intersec 0");

    }
    }
    else{
      System.out.println("length 0");
    }
    return 0;
  }
  public static void main(String[] args) {
    int t;
    String str1,str2;
    Scanner sc=new Scanner(System.in);
    t=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<t;i++){
      str1=sc.nextLine();
      str2=sc.nextLine();
      checkAnagram(str1,str2);
    }
  }
}

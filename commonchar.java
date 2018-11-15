import java.util.*;
import java.io.*;
public class commonchar{
	public static void main(String args[]){
		Set<Character> s1=new TreeSet<Character>();
		Set<Character> s2=new TreeSet<Character>();
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		for(int i=0;i<a.length();i++){
			s1.add(a.charAt(i));
		}
		for(int i=0;i<b.length();i++){
			s2.add(b.charAt(i));
		}
		s1.retainAll(s2);
		int n=s1.size();
		System.out.println("n"+n);
	}
}


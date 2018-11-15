import java.util.*;
import java.io.*;
public class CountOfWords{
	public static void main(String[] args){
		String s1=new String();
		int count=1;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		for(int i=0;i<s1.length()-1;i++){
			if(s1.charAt(i)==' '&&s1.charAt(i+1)!=' '){
				count=count +1;
			}
		}
		System.out.println("Words: "+count);
	}
}

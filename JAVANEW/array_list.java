package collections;

import java.util.ArrayList;
import java.util.*;
public class array_list {

	public static void main(String[] args) 
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("ABC");
		//obj.add(2,"BC"); gives indexoutofbounds exception..........
		obj.add(1,"BC");
		System.out.println(obj);
		System.out.println("------------------------------------------");
		ArrayList obj2=new ArrayList();
		obj2.add(1);
		obj2.add("ABC");
		System.out.println(obj2);
		System.out.println("------------------------------------------");
		for(String k : obj)
		{
			System.out.println(k);
		}
		System.out.println("------------------------------------------");
		for(Object l : obj)
		{
			System.out.println(l);
		}
		System.out.println("------------------------------------------");
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			String k=(String)it.next();
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------");
		obj.add("sdf");
		it=obj.iterator();
		while(it.hasNext())
		{
			String k=(String)it.next();
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println(obj);
		obj.remove("ABC");
		System.out.println(obj);
		System.out.println("------------------------------------------");
		ArrayList<Integer> obj3=new ArrayList<Integer>();
		obj3.add(0);
		obj3.add(2);
		obj3.add(4);
		obj3.add(3);
		System.out.println(obj3);
		obj3.remove(2);
		System.out.println(obj3);
		System.out.println("------------------------------------------");
		System.out.println(obj);
		obj.set(1, "hello");
		System.out.println(obj);
		System.out.println("------------------------------------------");
		System.out.println(obj);
		System.out.println("index of hello "+obj.indexOf("hello"));
		System.out.println("index of ABC "+obj.indexOf("ABC"));
		System.out.println("------------------------------------------");
		System.out.println(obj);
		System.out.println("obj contains hello "+obj.contains("hello"));
		System.out.println("obj contains ABC "+obj.contains("ABC"));
		System.out.println("------------------------------------------");
		System.out.println("size of array list is "+obj.size());
		System.out.println("------------------------------------------");
		obj3.add(1);
		System.out.println(obj3);
		Collections.sort(obj3);
		System.out.println(obj3);
		System.out.println("------------------------------------------");
		System.out.println(obj3);
		Collections.sort(obj3,Collections.reverseOrder());
		System.out.println(obj3);
		System.out.println("------------------------------------------");
		ArrayList<String> obj4=new ArrayList<String>();
		obj4.add("hello");
		obj4.add("world");
		obj4.add("hello");
		System.out.println(obj4);
		obj4.remove("hello");
		System.out.println(obj4);
		System.out.println("------------------------------------------");
	}

}

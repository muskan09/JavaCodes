package collections;
import java.util.*;
public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("hello");
		obj.addFirst("welcome");
		obj.addLast("world");
		obj.add("bye");
		System.out.println(obj);
		System.out.println("--------------------------------------");
		System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println("--------------------------------------");
		System.out.println(obj);
		System.out.println(obj.set(2,"world!!!"));
		System.out.println(obj);
		System.out.println("--------------------------------------");
		System.out.println(obj);
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		System.out.println("--------------------------------------");
		System.out.println(obj);
		obj.set(0, "bye");
		obj.set(2, "bye");
		System.out.println(obj.lastIndexOf("bye"));
		System.out.println("--------------------------------------");
		System.out.println(obj);
		System.out.println(obj.indexOf("bye"));
		System.out.println("--------------------------------------");
		System.out.println(obj);
		obj.remove("bye");
		System.out.println(obj);
		System.out.println("--------------------------------------");
		System.out.println(obj);
	}

}

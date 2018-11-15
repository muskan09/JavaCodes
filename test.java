class First 
{
int a=70;



}

class Second extends First{
	int a=30;
public static void main (String[] args){
First a = new Second();
System.out.println(a.a);

}
}

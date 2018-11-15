import java.util.*;
import java.io.*;
class First
{
int a = 30;
}
class Second extends First
{
int a = 70;
public static void main(String args[])
{
First s = new Second();
System.out.println(s.a);
}
}

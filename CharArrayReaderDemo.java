import java.io.*;
public class CharArrayReaderDemo{
public static void main(String args[])throws IOException{
CharArrayReader c1=null;
CharArrayReader c2= null;
try{
char c[]={'M','K','H','L','C','B','D'};
//CharArrayReader c1=new CharArrayReader(c);
//CharArrayReader c2= new CharArrayReader(c,0,3);
c1=new CharArrayReader(c);
c2= new CharArrayReader(c,0,3);
int i;
while((i=c1.read())!= -1){
System.out.print((char)i);
}
System.out.println();
while((i=c2.read())!=-1){
	System.out.print((char)i);
}
}
catch(Exception e){
	System.out.println(e);
}
finally{

if(c1!=null){
c1.close();
}
if(c2!=null){
c2.close();
}
}
}
}

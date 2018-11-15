import java.io.*;
public class cawd{
public static void main(String[] args)throws IOException{
CharArrayWriter w1=null;
try{
  w1= new CharArrayWriter("/root/Desktop/xyz.txt");
w1.write('M');
char c[]={'M','K','H','L','C','B','D'};
w1.write(c,1,3);
w1.append("End of code");
c1=new CharArrayReader(c);
c2= new CharArrayReader(c,0,3);
}
catch(Exception e){
	System.out.println(e);
}
finally{

if(w1!=null){
w1.close();
}
}
}
}
}

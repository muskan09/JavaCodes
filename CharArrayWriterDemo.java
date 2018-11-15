import java.io.*;
public class CharArrayWriterDemo{
public static void main(String[] args)throws IOException{
CharArrayWriter w1=null;
FileWriter fw=null;
try{
  fw= new FileWriter("/root/Desktop/xyz.txt");

//w1.write('M');
//char c[]={'M','K','H','L','C','B','D'};
w1=new CharArrayWriter(fw);
//w1.write(c,1,3);
w1.write("muskan");
w1.close();
fw.append("End of code");
}
catch(Exception e){
	System.out.println(e);
}
finally{

if(w1!=null){
w1.close();
}
if(fw!=null){
  fw.close();
}
}
}
}

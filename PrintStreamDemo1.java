import java.io.*;
import java.util.*;
public class PrintStreamDemo1{
  public static void main(String[] args)throws IOException{
    FileOutputStream fileOutputStream = null;
    PrintStream printStream=null;
    try{
      fileOutputStream = new FileOutputStream("/root/Desktop/test3.txt");
      printStream= new PrintStream(fileOutputStream);
      printStream.print('A');
      printStream.print(100L);
      printStream.print(45.451);
      printStream.print(new Date());
      printStream.println();
      printStream.println("This is an example of PrintStream class");
      printStream.append('a');
      printStream.append("Append method of print stream class");
      String str="Example of PrintStream Class";
      byte b[]=str.getBytes();
      printStream.write(b);
      printStream.printf("This is a %s application",str);
    }
    catch(Exception e){
      e.printStackTrace();
    }
    finally{
      try{
        if(fileOutputStream!=null){
          fileOutputStream.close();
        }
        if(printStream!=null){
          printStream.close();
        }
      }
      catch(Exception e){
        e.printStackTrace();
      }
    }
  }
}

import java.io.*;
public class io{
  public static void main(String args[])throws Exception{
    FileOutputStream outStream = null;
      BufferedOutputStream bos=null;
      try{
        outStream = new FileOutputStream("/root/Desktop/test1.txt");
        bos=new BufferedOutputStream(outStream);
        String s="Content of BufferedOutputStream Class";
        byte buf[]=s.getBytes();
        bos.write(buf);
        bos.flush();
      }
      catch(Exception e){
        System.out.println(e);
      }
      finally{
        if(outStream!=null){
          outStream.close();
        }
        if(bos!=null){
          bos.close();
        }
      }
  }
}

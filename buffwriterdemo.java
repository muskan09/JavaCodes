import java.io.*;
public class buffwriterdemo{
public static void main(String[] args) throws Exception {
    FileWriter writer = new FileWriter("/root/Desktop/blah.txt");
    BufferedWriter buffer = new BufferedWriter(writer);
    buffer.write("Muskan Kalsi");
    buffer.close();
    System.out.println("Code chal gaya! :D");
    }
}

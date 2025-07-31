import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.io.file;
 
public class MyClass {
    public static void main(String[] args) throws Exception{
        System.out.println("Fil Handling in Java");
        //Writer file = new file("abc.txt");
        //file.createNewFile();
        //System.out.println(file.exist());
        FileWriter fw = new FileWriter("abc.txt");
    BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello i am manswi");
       bw.close();
    //FileReader fr = new FileReader("abc.txt");
    //BufferedReader bf = new BufferedReader(fr);
    //System.out.println(bf.readLine());     
    }

}

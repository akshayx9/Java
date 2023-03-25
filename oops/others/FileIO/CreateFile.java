package oops.others.FileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) throws IOException{
        File f=new File("abc.txt");
        f.createNewFile();
        System.out.println(f.exists());

        //FileWriter - we can only write char data
        FileWriter fw=new FileWriter(f,true);
        fw.write("JAVA");
        fw.write(" TECH\n");
        fw.write("Hibernate\n");
        fw.write(65);//A
        fw.flush();
        fw.close();
        System.out.println("--Done--");

        //PrintWriter - we can use this to write any type of data
        PrintWriter pw=new PrintWriter(f);
        pw.println("Spring");
        pw.println(65);
        pw.flush();
        pw.close();
        System.out.println("--Done--");

        //FileReader - reads the file char by char
        FileReader fr=new FileReader(f);
        //creating char array of file length
        char[] ch=new char[(int)f.length()];
        //read data & inserting into char array
        fr.read(ch);
        fr.close();

        for(char ch1:ch){
            System.out.println(ch1);
        }
    }
}

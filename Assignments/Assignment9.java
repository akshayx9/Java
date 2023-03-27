package Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class Assignment9 {

    public long addData(File f, String data) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter(f, true));
        bw.write(data);
        bw.close();
        return f.length();
    }
    public long removeWord(File fn, String newFileName, String wordToBeRemoved) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(fn));
        String st;
        List<String> allLines = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            allLines.add(st.replaceAll(wordToBeRemoved, ""));
        }
        File outFile = new File(newFileName);
        if (!outFile.exists()) {
            outFile.createNewFile();
        }
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
        for (String str: allLines) {
            pw.println(str);
        }
        br.close();
        pw.close();
        return outFile.length();
  }
  public long createNewFile(File r, String newrFileName) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(r));
        String str;
        List<String> allLines = new ArrayList<>();
        while ((str = br.readLine()) != null) {
            StringBuffer sb=new StringBuffer(str);
            sb.reverse();
            str=sb.toString();
            allLines.add(str);
        }
        File outFile = new File(newrFileName);
        if (!outFile.exists()) {
            outFile.createNewFile();
        }
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
        for (String str1: allLines) {
            pw.println(str1);
        }
        br.close();
        pw.close();
        return outFile.length();
  }
    public static void main(String[] args) throws IOException {
        Assignment9 ad=new Assignment9();
        File f=new File("xyz.txt");
        ad.addData(f, "Hi there!!");

        File fn=new File("ijk.txt");
        PrintWriter pw=new PrintWriter(fn);
        pw.println("Welcome to Java");
        pw.flush();
        pw.close();
        ad.removeWord(fn, "ABC.txt", "Java");

        File r=new File("abc.txt");
        PrintWriter pw1=new PrintWriter(r);
        pw1.println("Welcome to Java World");
        pw1.flush();
        pw1.close();
        ad.createNewFile(r, "abc1.txt");
    }
}

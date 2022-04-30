package lesson44WrireInFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("1");
        PrintWriter pw = new PrintWriter(file);

        pw.println("hello");
        pw.println("world");
        pw.close();
    }
}

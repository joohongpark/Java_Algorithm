package useful;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileControl {
    File file;
    public boolean createFile(String path) {
        boolean result = true;
        try {
            file = new File(path);
        } catch (Exception e) {
            System.out.println(e);
            result = false;
        }
        return result;
    }


    public boolean dataSave(String data) {
        boolean result = true;
        try {
            FileWriter fWriter = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fWriter);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(data);
            pw.close();

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return result;
    }
}

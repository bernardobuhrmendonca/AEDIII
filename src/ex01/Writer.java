package ex01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {


    private BufferedWriter writer;
    private File file;
    private FileWriter fileWriter;

    public boolean CreateFile(String pathName) {
        file = new File(pathName);
    try{
        file.createNewFile();
    } catch(IOException err) {
        System.err.println("IOException");
        return false;
    }
    return true;
    }

    

    public boolean write(int[] text) {
        try {
            fileWriter = new FileWriter(file);
            writer = new BufferedWriter(fileWriter);
            for (int i = 0; i < text.length; i++) {
                writer.write(text[i]);
                writer.newLine();
            }
        } catch (IOException err) {
            err.printStackTrace();
            return false;
        }
        return true;
    }

}

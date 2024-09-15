package ex07;

import java.io.*;

public class Writer {
    File f;
    FileWriter fw;
    BufferedWriter bw;

    public void createFile(String pathname) {
        f = new File(pathname);
        try {
            f.createNewFile();
        } catch (Exception e) {
            System.err.println("Erro na criação do arquivo");
        }
    }

    public void write(String pathname, String text) {
        try {

            bw = new BufferedWriter(fw);
            fw = new FileWriter(pathname);
            
            bw.write(text);
            bw.newLine();
        } catch (Exception e) {
           System.err.println("Erro na escrita.");
        }
    }
    public void write(String pathname, int number) {
        try {

            bw = new BufferedWriter(fw);
            fw = new FileWriter(pathname);
            
            bw.write(number);
            bw.newLine();
        } catch (Exception e) {
           System.err.println("Erro na escrita.");
        }
    }

}

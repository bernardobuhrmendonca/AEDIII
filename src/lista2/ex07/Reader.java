package ex07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {
    FileReader fr;
    BufferedReader br;

    public String read(String pathname) {
        try {
            fr = new FileReader(pathname);
            br = new BufferedReader(fr);
            return br.readLine();
            
        } catch (Exception e) {
            System.err.println("Erro na leitura do arquivo.");
            return null;
        }
    }

    public int readI(String pathname) {
        try {
            fr = new FileReader(pathname);
            br = new BufferedReader(fr);
            return br.read();
            
        } catch (Exception e) {
            System.err.println("Erro na leitura do arquivo.");
            return 0;
        }
    }
}

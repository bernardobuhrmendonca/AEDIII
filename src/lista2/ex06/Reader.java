package ex06;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {
    FileReader fr;
    BufferedReader br;

    public int readCount(String pathname) {
        int cont = 0;

        try {
            fr = new FileReader(pathname);
            br = new BufferedReader(fr);
            while(br.readLine() != null) {
                br.readLine();
                cont++;
            }
            return cont;
        } catch (Exception e) {
            System.err.println("Erro na leitura do arquivo.");
            return 0;
        }
    }
}

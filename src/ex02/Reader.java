package ex02;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {
    private FileReader fileReader; //leitor de arquivo que receberá como input o arquivo que será lido.
    private BufferedReader bufferedReader; //Buffered para leitura que acelerará o pocesso de leitura do arquivo, recebendo como input o fileReadder.
    public String line;
    
    public void Read(String fileName) {
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println("Erro na leitura do arquivo.");
        }
    }
}